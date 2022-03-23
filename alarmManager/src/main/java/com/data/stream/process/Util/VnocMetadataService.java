package com.data.stream.process.Util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import com.data.stream.process.model.VnocAlarm;
import com.data.stream.process.model.VnocMetadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Service
public class VnocMetadataService {

    @Value("classpath:/packages.json")
    Resource resourceFile;
    @Autowired
    private KafkaTemplate<String, VnocAlarm> kafkaTemplate;

    public static void main() {

    }

    public VnocMetadata processAlarms(String alarmFile) {

        VnocMetadata vnocMetadata = new VnocMetadata();
        try {
            InputStream resource = new ClassPathResource("/packages.json").getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(resource));
            JsonElement element = JsonParser.parseReader(reader);
            if (element.isJsonArray()) {
                JsonArray jsonArray = (JsonArray) element;
                jsonArray.forEach(metadata -> {
                    VnocAlarm alarm = parseVnocMetadataObject(metadata.getAsJsonObject());
                    vnocMetadata.getMetadata().add(alarm);
                });
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.gc();
        }
        return vnocMetadata;
    }

    private VnocAlarm parseVnocMetadataObject(JsonObject metadata) {

        JsonElement alarmJson = metadata.get("metadata");
        JsonElement element = JsonParser.parseString(alarmJson.getAsString());
        VnocAlarm alarm = new Gson().fromJson(element, VnocAlarm.class);

        return alarm;
    }

    public void publish(VnocMetadata data, String topicName) {
        data.getMetadata().forEach(alarm -> {
            kafkaTemplate.send(topicName, alarm);
        });
    }
}

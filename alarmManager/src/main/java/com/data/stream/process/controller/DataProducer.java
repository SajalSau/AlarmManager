package com.data.stream.process.controller;

import com.data.stream.process.Util.VnocMetadataService;
import com.data.stream.process.model.VnocMetadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataProducer {

    private final String TOPIC = "vnoc-alarms";

    @Autowired
    private VnocMetadataService vnocMetadataService;

    @GetMapping("/publish")
    public String processAlarms() {
        VnocMetadata vnocMetadata = vnocMetadataService.processAlarms("packages.json");
        vnocMetadataService.publish(vnocMetadata, TOPIC);
        return "Published successfully";
    }
}

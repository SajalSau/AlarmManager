package com.data.stream.process;


import com.data.stream.process.model.VnocAlarm;

import org.apache.kafka.streams.kstream.KStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class AlarmConsumer {

    private static final Logger logger = LogManager.getLogger(AlarmConsumer.class);

    @Bean("alarmProcessor")
    public Consumer<KStream<String, VnocAlarm>> alarmProcessor() {
        return kstream -> kstream.foreach((key, alarm) -> {
            logger.info(String.format("Alerm ID[%s] Affected-Node[%s] Vnoc-AlarmId[%s] Alarm-Event-Time[%s]", alarm.getAlarmID(), alarm.getAffectedNode(), alarm.getVnocAlarmID(), alarm.getAlarmEventTime()));
        });
    }
}

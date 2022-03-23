package com.data.stream.process.model;

import java.util.ArrayList;
import java.util.List;


public class VnocMetadata {

    private List<VnocAlarm> metadata = new ArrayList<>();

    public List<VnocAlarm> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<VnocAlarm> metadata) {
        this.metadata = metadata;
    }
}

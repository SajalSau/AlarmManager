package com.data.stream.process.model;

public class VnocAlarm {
    private String affectedNode;
    private String affectedEquipment;
    private String affectedSite;
    private String alarmCategory;
    private String alarmGroup;
    private String alarmCSN;
    private String alarmID;
    private String alarmMO;
    private String alarmNotificationType;
    private String alarmLastSeqNo;
    private String alarmEventTime;
    private String vnocAlarmID;

    public VnocAlarm(){

    }


    public VnocAlarm(String affectedNode, String affectedEquipment, String affectedSite, String alarmCategory, String alarmGroup, String alarmCSN, String alarmID, String alarmMO, String alarmNotificationType, String alarmLastSeqNo, String alarmEventTime, String vnocAlarmID) {
        this.affectedNode = affectedNode;
        this.affectedEquipment = affectedEquipment;
        this.affectedSite = affectedSite;
        this.alarmCategory = alarmCategory;
        this.alarmGroup = alarmGroup;
        this.alarmCSN = alarmCSN;
        this.alarmID = alarmID;
        this.alarmMO = alarmMO;
        this.alarmNotificationType = alarmNotificationType;
        this.alarmLastSeqNo = alarmLastSeqNo;
        this.alarmEventTime = alarmEventTime;
        this.vnocAlarmID = vnocAlarmID;
    }

    public String getAffectedNode() {
        return affectedNode;
    }

    public void setAffectedNode(String affectedNode) {
        this.affectedNode = affectedNode;
    }

    public String getAffectedEquipment() {
        return affectedEquipment;
    }

    public void setAffectedEquipment(String affectedEquipment) {
        this.affectedEquipment = affectedEquipment;
    }

    public String getAffectedSite() {
        return affectedSite;
    }

    public void setAffectedSite(String affectedSite) {
        this.affectedSite = affectedSite;
    }

    public String getAlarmCategory() {
        return alarmCategory;
    }

    public void setAlarmCategory(String alarmCategory) {
        this.alarmCategory = alarmCategory;
    }

    public String getAlarmGroup() {
        return alarmGroup;
    }

    public void setAlarmGroup(String alarmGroup) {
        this.alarmGroup = alarmGroup;
    }

    public String getAlarmCSN() {
        return alarmCSN;
    }

    public void setAlarmCSN(String alarmCSN) {
        this.alarmCSN = alarmCSN;
    }

    public String getAlarmID() {
        return alarmID;
    }

    public void setAlarmID(String alarmID) {
        this.alarmID = alarmID;
    }

    public String getAlarmMO() {
        return alarmMO;
    }

    public void setAlarmMO(String alarmMO) {
        this.alarmMO = alarmMO;
    }

    public String getAlarmNotificationType() {
        return alarmNotificationType;
    }

    public void setAlarmNotificationType(String alarmNotificationType) {
        this.alarmNotificationType = alarmNotificationType;
    }

    public String getAlarmLastSeqNo() {
        return alarmLastSeqNo;
    }

    public void setAlarmLastSeqNo(String alarmLastSeqNo) {
        this.alarmLastSeqNo = alarmLastSeqNo;
    }

    public String getAlarmEventTime() {
        return alarmEventTime;
    }

    public void setAlarmEventTime(String alarmEventTime) {
        this.alarmEventTime = alarmEventTime;
    }

    public String getVnocAlarmID() {
        return vnocAlarmID;
    }

    public void setVnocAlarmID(String vnocAlarmID) {
        this.vnocAlarmID = vnocAlarmID;
    }
}

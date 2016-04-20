package com.coolbitx.coolwallet.entity;

/**
 * Created by wmgs_01 on 15/10/6.
 */
public class Card {

    private String mode;
    private String state;
    private String fwVersion;
    private String uid;
    private String cardId;
    private String cardName;
    private String deviceName;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFwVersion() {
        return fwVersion;
    }

    public void setFwVersion(String fwVersion) {
        this.fwVersion = fwVersion;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        if (cardName == null)
            cardName = "CoolWallet";
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String cardName) {
        this.deviceName = cardName;
    }


}

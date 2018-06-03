package com.cxf.sell.dataobject;

public class SellerActivity {
    private Byte activityId;

    private String sellerId;

    private Byte activityType;

    private String activityDescription;

    public Byte getActivityId() {
        return activityId;
    }

    public void setActivityId(Byte activityId) {
        this.activityId = activityId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public Byte getActivityType() {
        return activityType;
    }

    public void setActivityType(Byte activityType) {
        this.activityType = activityType;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription == null ? null : activityDescription.trim();
    }
}
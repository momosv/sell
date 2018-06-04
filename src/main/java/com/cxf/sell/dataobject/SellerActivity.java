package com.cxf.sell.dataobject;

import com.cxf.sell.dataobject.base.IBaseDBPO;

public class SellerActivity extends IBaseDBPO{
    private String activityId;

    private String sellerId;

    private Integer activityType;

    private String activityDescription;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    public String getActivityDescription() {
        return activityDescription;
    }

    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription == null ? null : activityDescription.trim();
    }

    @Override
    public String _getTableName() {
        return "seller_activity";
    }

    @Override
    public String _getPKColumnName() {
        return "activity_id";
    }

    @Override
    public String _getPKValue() {
        return activityId;
    }

    @Override
    public void _setPKValue(Object var1) {
        this.activityId= (String) var1;
    }
}
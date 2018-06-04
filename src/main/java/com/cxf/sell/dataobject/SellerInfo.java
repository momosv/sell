package com.cxf.sell.dataobject;

import com.cxf.sell.dataobject.base.IBaseDBPO;

import java.math.BigDecimal;

public class SellerInfo extends IBaseDBPO{
    private String sellerId;

    private String sellerName;

    private String sellerDescription;

    private Double sellerScore;

    private Double sellerServiceScore;

    private Double sellerFoodScore;

    private Double sellerRankRate;

    private Integer sellerMinPrice;

    private Integer sellerDeliveryPrice;

    private Short sellerRatingCount;

    private Integer sellerSellCount;

    private String sellerBulletin;

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId == null ? null : sellerId.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getSellerDescription() {
        return sellerDescription;
    }

    public void setSellerDescription(String sellerDescription) {
        this.sellerDescription = sellerDescription == null ? null : sellerDescription.trim();
    }

    public Double getSellerScore() {
        return sellerScore;
    }

    public void setSellerScore(Double sellerScore) {
        this.sellerScore = sellerScore;
    }

    public Double getSellerServiceScore() {
        return sellerServiceScore;
    }

    public void setSellerServiceScore(Double sellerServiceScore) {
        this.sellerServiceScore = sellerServiceScore;
    }

    public Double getSellerFoodScore() {
        return sellerFoodScore;
    }

    public void setSellerFoodScore(Double sellerFoodScore) {
        this.sellerFoodScore = sellerFoodScore;
    }

    public Double getSellerRankRate() {
        return sellerRankRate;
    }

    public void setSellerRankRate(Double sellerRankRate) {
        this.sellerRankRate = sellerRankRate;
    }

    public Integer getSellerMinPrice() {
        return sellerMinPrice;
    }

    public void setSellerMinPrice(Integer sellerMinPrice) {
        this.sellerMinPrice = sellerMinPrice;
    }

    public Integer getSellerDeliveryPrice() {
        return sellerDeliveryPrice;
    }

    public void setSellerDeliveryPrice(Integer sellerDeliveryPrice) {
        this.sellerDeliveryPrice = sellerDeliveryPrice;
    }

    public Short getSellerRatingCount() {
        return sellerRatingCount;
    }

    public void setSellerRatingCount(Short sellerRatingCount) {
        this.sellerRatingCount = sellerRatingCount;
    }

    public Integer getSellerSellCount() {
        return sellerSellCount;
    }

    public void setSellerSellCount(Integer sellerSellCount) {
        this.sellerSellCount = sellerSellCount;
    }

    public String getSellerBulletin() {
        return sellerBulletin;
    }

    public void setSellerBulletin(String sellerBulletin) {
        this.sellerBulletin = sellerBulletin == null ? null : sellerBulletin.trim();
    }

    @Override
    public String _getTableName() {
        return "seller_info";
    }

    @Override
    public String _getPKColumnName() {
        return "sellerId";
    }

    @Override
    public String _getPKValue() {
        return sellerId;
    }

    @Override
    public void _setPKValue(Object var1) {
        this.sellerId = (String) var1;
    }
}
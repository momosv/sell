package com.cxf.sell.dataobject;

import java.math.BigDecimal;

public class SellerInfo {
    private String sellerId;

    private String sellerName;

    private String sellerDescription;

    private BigDecimal sellerScore;

    private BigDecimal sellerServiceScore;

    private BigDecimal sellerFoodScore;

    private BigDecimal sellerRankRate;

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

    public BigDecimal getSellerScore() {
        return sellerScore;
    }

    public void setSellerScore(BigDecimal sellerScore) {
        this.sellerScore = sellerScore;
    }

    public BigDecimal getSellerServiceScore() {
        return sellerServiceScore;
    }

    public void setSellerServiceScore(BigDecimal sellerServiceScore) {
        this.sellerServiceScore = sellerServiceScore;
    }

    public BigDecimal getSellerFoodScore() {
        return sellerFoodScore;
    }

    public void setSellerFoodScore(BigDecimal sellerFoodScore) {
        this.sellerFoodScore = sellerFoodScore;
    }

    public BigDecimal getSellerRankRate() {
        return sellerRankRate;
    }

    public void setSellerRankRate(BigDecimal sellerRankRate) {
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
}
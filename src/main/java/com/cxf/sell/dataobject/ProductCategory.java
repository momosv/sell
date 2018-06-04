package com.cxf.sell.dataobject;

import com.cxf.sell.dataobject.base.IBaseDBPO;

import java.util.Date;

public class ProductCategory extends IBaseDBPO{
    private String categoryId;

    private String categoryName;

    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
    private String seller_id;//所属商家

    public String getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(String seller_id) {
        this.seller_id = seller_id;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String _getTableName() {
        return "product_category";
    }

    @Override
    public String _getPKColumnName() {
        return "category_id";
    }

    @Override
    public String _getPKValue() {
        return categoryId;
    }

    @Override
    public void _setPKValue(Object var1) {
        this.categoryId= (String)var1;
    }
}
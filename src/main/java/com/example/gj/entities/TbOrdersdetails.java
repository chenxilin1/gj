package com.example.gj.entities;

import java.util.Date;

public class TbOrdersdetails {
    private String ordersdetailsNo;

    private String ordersNo;

    private String goodsNo;

    private String goodsName;

    private String goodsinsp;

    private Float goodsPrice;

    private Integer goodsNumber;

    private Float total;

    private Date createTime;

    @Override
    public String toString() {
        return "TbOrdersdetails{" +
                "ordersdetailsNo='" + ordersdetailsNo + '\'' +
                ", ordersNo='" + ordersNo + '\'' +
                ", goodsNo='" + goodsNo + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsinsp='" + goodsinsp + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsNumber=" + goodsNumber +
                ", total=" + total +
                ", createTime=" + createTime +
                '}';
    }

    public String getOrdersdetailsNo() {
        return ordersdetailsNo;
    }

    public void setOrdersdetailsNo(String ordersdetailsNo) {
        this.ordersdetailsNo = ordersdetailsNo == null ? null : ordersdetailsNo.trim();
    }

    public String getOrdersNo() {
        return ordersNo;
    }

    public void setOrdersNo(String ordersNo) {
        this.ordersNo = ordersNo == null ? null : ordersNo.trim();
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public String getGoodsName() {

        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsinsp() {
        return goodsinsp;
    }

    public void setGoodsinsp(String goodsinsp) {
        this.goodsinsp = goodsinsp == null ? null : goodsinsp.trim();
    }

    public Float getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
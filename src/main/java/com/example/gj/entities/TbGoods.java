package com.example.gj.entities;

import java.util.Date;

public class TbGoods {
    private String goodsinsp;

    private String goodsName;

    private String goodsNo;

    private String auditType;

    private String stauts;

    private String cbename;

    private String cbecodeinsp;

    private Date createTime;

    public String getGoodsinsp() {
        return goodsinsp;
    }

    public void setGoodsinsp(String goodsinsp) {
        this.goodsinsp = goodsinsp == null ? null : goodsinsp.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public String getAuditType() {
        return auditType;
    }

    public void setAuditType(String auditType) {
        this.auditType = auditType == null ? null : auditType.trim();
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts == null ? null : stauts.trim();
    }

    public String getCbename() {
        return cbename;
    }

    public void setCbename(String cbename) {
        this.cbename = cbename == null ? null : cbename.trim();
    }

    public String getCbecodeinsp() {
        return cbecodeinsp;
    }

    public void setCbecodeinsp(String cbecodeinsp) {
        this.cbecodeinsp = cbecodeinsp == null ? null : cbecodeinsp.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
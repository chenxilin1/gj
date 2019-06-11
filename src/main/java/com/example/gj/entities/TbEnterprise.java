package com.example.gj.entities;

import java.util.Date;

public class TbEnterprise {
    private String cbecodeinsp;

    private String cbename;

    private String type;

    private String auditType;

    private String stauts;

    private String person;

    private Date createTime;

    public String getCbecodeinsp() {
        return cbecodeinsp;
    }

    public void setCbecodeinsp(String cbecodeinsp) {
        this.cbecodeinsp = cbecodeinsp == null ? null : cbecodeinsp.trim();
    }

    public String getCbename() {
        return cbename;
    }

    public void setCbename(String cbename) {
        this.cbename = cbename == null ? null : cbename.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
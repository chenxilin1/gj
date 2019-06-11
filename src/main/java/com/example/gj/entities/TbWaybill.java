package com.example.gj.entities;

import java.util.Date;

public class TbWaybill {
    private String waybillNo;

    private String wlqycodeinsp;

    private String wlqyname;

    private String sender;

    private String receiver;

    private String address;

    private Date createTime;

    public String getWaybillNo() {
        return waybillNo;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo == null ? null : waybillNo.trim();
    }

    public String getWlqycodeinsp() {
        return wlqycodeinsp;
    }

    public void setWlqycodeinsp(String wlqycodeinsp) {
        this.wlqycodeinsp = wlqycodeinsp == null ? null : wlqycodeinsp.trim();
    }

    public String getWlqyname() {
        return wlqyname;
    }

    public void setWlqyname(String wlqyname) {
        this.wlqyname = wlqyname == null ? null : wlqyname.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
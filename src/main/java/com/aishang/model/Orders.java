package com.aishang.model;

import java.util.Date;

public class Orders {
    private String oid;
    private String order_number;
    private double total;
    private String aid;
    private Integer state;
    private Date date;
    private String uid;

    @Override
    public String toString() {
        return "Orders{" +
                "oid='" + oid + '\'' +
                ", order_number='" + order_number + '\'' +
                ", total=" + total +
                ", aid='" + aid + '\'' +
                ", state=" + state +
                ", date=" + date +
                ", uid='" + uid + '\'' +
                '}';
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}

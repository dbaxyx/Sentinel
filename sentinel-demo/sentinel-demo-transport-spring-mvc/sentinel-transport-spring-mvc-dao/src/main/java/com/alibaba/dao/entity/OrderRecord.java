package com.alibaba.dao.entity;

import java.util.Date;

public class OrderRecord {
    private Integer id;

    private String orderNote;

    private String orderLogisticId;

    private Integer orderId;

    private Date createDate;

    private Date modifyDate;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNote() {
        return orderNote;
    }

    public void setOrderNote(String orderNote) {
        this.orderNote = orderNote == null ? null : orderNote.trim();
    }

    public String getOrderLogisticId() {
        return orderLogisticId;
    }

    public void setOrderLogisticId(String orderLogisticId) {
        this.orderLogisticId = orderLogisticId == null ? null : orderLogisticId.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
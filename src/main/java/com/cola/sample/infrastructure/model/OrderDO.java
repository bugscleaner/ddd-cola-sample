package com.cola.sample.infrastructure.model;

/**
 * @author : kenny
 * @since : 2023/8/13
 **/
public class OrderDO {
    private Long id;

    private String orderNumber;

    private Integer orderCategoryType;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderCategoryType() {
        return orderCategoryType;
    }

    public void setOrderCategoryType(Integer orderCategoryType) {
        this.orderCategoryType = orderCategoryType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}

package ua.jdroidcoder.persistent.dto;

import org.hibernate.validator.constraints.NotEmpty;
import ua.jdroidcoder.persistent.entity.OrdersEntity;

import java.util.Date;

/**
 * Created by jdroidcoder on 07.04.17.
 */
public class OrderDto {
    private Long id;
    @NotEmpty(message = "The address cannot be empty")
    private String pointA;
    @NotEmpty(message = "The destination cannot be empty")
    private String pointB;
    private Long time;
    @NotEmpty(message = "The user phone cannot be empty")
    private String userPhone;
    @NotEmpty(message = "The status cannot be empty")
    private String status;
    private String driverPhone;

    public OrderDto() {
    }

    public OrderDto(String pointA, String pointB, Long time, String userPhone, String status, Long id, String driverPhone) {
        this.id = id;
        this.pointA = pointA;
        this.pointB = pointB;
        this.time = time;
        this.userPhone = userPhone;
        this.status = status;
        this.driverPhone = driverPhone;
    }

    public String getPointA() {
        return pointA;
    }

    public void setPointA(String pointA) {
        this.pointA = pointA;
    }

    public String getPointB() {
        return pointB;
    }

    public void setPointB(String pointB) {
        this.pointB = pointB;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public OrdersEntity clone() {
        return new OrdersEntity(getPointA(), getPointB(), new Date(getTime()), getUserPhone(), getStatus(), getDriverPhone());
    }
}

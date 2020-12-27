package com.jiacool.ssm.POJO;

import java.util.Date;

public class Item {
    private int id;
    private String name;
    private float price;
    private Date datetime;
    private String detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "POJO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", datetime=" + datetime +
                ", detail='" + detail + '\'' +
                '}';
    }
}

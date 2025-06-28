package org.example.springboot.entity;

import java.sql.Timestamp;

public class Good {
    private String id;
    private String name;
    private int price;
    private String url;
    private Timestamp productiondate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Timestamp getProductiondate() {
        return productiondate;
    }

    public void setProductiondate(Timestamp productiondate) {
        this.productiondate = productiondate;
    }
}

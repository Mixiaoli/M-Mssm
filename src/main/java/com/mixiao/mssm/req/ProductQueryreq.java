package com.mixiao.mssm.req;

public class ProductQueryreq {
    private Long id;

    private String name;

    private Long category2Id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategory2Id() {
        return category2Id;
    }

    public void setCategory2Id(Long category2Id) {
        this.category2Id = category2Id;
    }

    @Override
    public String toString() {
        return "ProductQueryreq{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category2Id=" + category2Id +
                '}';
    }
}
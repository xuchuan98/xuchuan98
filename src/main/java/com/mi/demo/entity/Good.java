package com.mi.demo.entity;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_goods")
public class Good {
    @EmbeddedId
    private goodkeys gkey;//

    @Column(name = "type_id")
    private Integer type;//②

    @Column(name = "name")
    private String name;//


    @Column(name = "sale_price")
    private float sale;//

    @Column(name = "store_price")
    private float store;//⑥

    @Column(name = "content")
    private String content;//⑦

    @Column(name="image_file")
    private String image;//⑧






    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageFile() {
        return image;
    }

    public void setImageFile(String imageFile) {
        this.image = imageFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalePrice() {
        return sale;
    }

    public void setSalePrice(float salePrice) {
        this.sale = salePrice;
    }


    public float getStorePrice() {
        return store;
    }

    public void setStorePrice(float storePrice) {
        this.store = storePrice;
    }

    public Integer getTypeId() {
        return type;
    }

    public void setTypeId(Integer typeId) {
        this.type = typeId;
    }
}

package com.mi.demo.entity;

import javax.persistence.*;


@Entity
@Table(name = "t_goodstype")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private Integer typeid;//

    @Column(name = "type")
    private String type;//



    public Type(){}
    public Type(Integer id,String tp)
    {this.typeid=id;this.type=tp;}
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}

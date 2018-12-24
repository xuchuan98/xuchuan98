package com.mi.demo.entity;


import javax.persistence.*;
import javax.sql.rowset.serial.SerialJavaObject;


@Entity
@Table(name = "t_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cus_id")
    private Integer cusid;//

    @Column(name = "pwd")
    private String pwd;//②

    @Column(name = "cus_name")
    private String name;//

    @Column(name = "address")
    private String address;//④

    @Column(name = "tel")
    private String tel;//



    public Customer(){}
    public Customer(Integer cus, String pwd, String name, String address, String tel)
    {this.cusid=cus;this.pwd=pwd;this.name=name;this.address=address;this.tel=tel;}
    public String getAddress() {
        return address;
    }

    public String getPwd() {
        return pwd;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCusid() {
        return cusid;
    }

    public void setCusid(Integer good) {
        this.cusid = good;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

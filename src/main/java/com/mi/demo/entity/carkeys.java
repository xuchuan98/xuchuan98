package com.mi.demo.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class carkeys implements Serializable {
    @Column(name="cus_id")
    private Integer cusid;
    @Column(name="good_id")
    private Integer goodid;
    @Column(name="seller_id")
    private Integer sellerid;

    public carkeys(){}
    public carkeys(Integer cusid ,Integer goodid,Integer sellerid)
    {this.cusid=cusid;this.goodid=goodid;this.sellerid=sellerid;}

    @Override
    public String toString() {
        return "Carkeys: [cus_id=" + cusid +", good_id="
                +goodid+", seller_id="+sellerid+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof carkeys)) return false;
        carkeys car = (carkeys) o;
        return Objects.equals(cusid, car.cusid) &&
                Objects.equals(goodid, car.goodid) &&
                Objects.equals(sellerid, car.sellerid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cusid, goodid, sellerid);
    }

    public Integer getCusid() {
        return cusid;
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public void setCusid(Integer cusid) {
        this.cusid = cusid;
    }
}

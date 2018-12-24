package com.mi.demo.entity;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class goodkeys implements Serializable {

    @Column(name="good_id")
    private Integer goodid;

    @Column(name="seller_id")
    private Integer sellerid;

    public goodkeys(){}
    public goodkeys(Integer goodid,Integer sellerid)
    {this.goodid=goodid;this.sellerid=sellerid;}
    @Override
    public String toString() {
        return "goodkeys{" +
                "goodid=" + goodid +
                ", sellerid=" + sellerid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof goodkeys)) return false;
        goodkeys goodkeys = (goodkeys) o;
        return Objects.equals(goodid, goodkeys.goodid) &&
                Objects.equals(sellerid, goodkeys.sellerid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodid, sellerid);
    }
    public Integer getGoodid() {
        return goodid;
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }
}

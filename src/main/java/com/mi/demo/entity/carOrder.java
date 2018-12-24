package com.mi.demo.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="t_carorder")
public class carOrder {


    @EmbeddedId
    private carkeys ckey;//①


    @Column(name="order_time")
    private Date ordertime ;//②

    @Column(name="order_count")
    private Integer count;//

    @Column(name="cus_check")
    private Integer cuscheck;//④

    @Column(name="post_time")
    private Date posttime;//

    @Column(name="admin_check")
    private Integer admincheck;//⑥

    @Column(name="comment")
    private String comment;//last


    public carkeys getCkey() { return ckey; }

    public void setCkey(carkeys ckey) { this.ckey = ckey; }

    public Integer getAdmincheck() {
        return admincheck;
    }

    public carkeys getCarid() {return ckey;}

    public void setCarid(carkeys carid) {this.ckey = carid;}



    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }


    public Integer getCuscheck() {
        return cuscheck;
    }

    public void setCuscheck(Integer cuscheck) {
        this.cuscheck = cuscheck;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setAdmincheck(Integer admincheck) {
        this.admincheck = admincheck;
    }
}

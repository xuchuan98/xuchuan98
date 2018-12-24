package com.mi.demo.dao;


import com.mi.demo.entity.Good;
import com.mi.demo.entity.goodkeys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;


public interface GoodRepository extends JpaRepository<Good, goodkeys> {

    @Query(value = "select * from t_good where good_id=?1",nativeQuery = true)
    public ArrayList<Good> findBy_goodid(Integer id);
    @Query(value = "select * from t_good where seller_id=?1",nativeQuery = true)
    public ArrayList<Good> findBy_sellerid(Integer id);

    public  ArrayList<Good> findAll();
    public Good findByGkey(goodkeys gkey);

}

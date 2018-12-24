package com.mi.demo.dao;

import com.mi.demo.entity.carOrder;
import com.mi.demo.entity.carkeys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface carRepository extends JpaRepository<carOrder, carkeys> {
    @Query(value = "select * from t_carorder where cus_id=?1",nativeQuery = true)
    public ArrayList<carOrder> findBy_cusid(Integer id);

    public ArrayList<carOrder> findAll();
    public carOrder findByCkey(carkeys ckey);


}

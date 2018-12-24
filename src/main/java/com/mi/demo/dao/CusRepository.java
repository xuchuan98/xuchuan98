package com.mi.demo.dao;


import com.mi.demo.entity.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;


public interface CusRepository extends JpaRepository<Customer, Integer> {

    public ArrayList<Customer> findAll();


    @Query(value = "select * from t_customer where cus_id=?1",nativeQuery = true)
    public Customer findBy_id(Integer id);

}

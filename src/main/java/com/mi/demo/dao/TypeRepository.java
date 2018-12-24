package com.mi.demo.dao;

import com.mi.demo.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface TypeRepository extends JpaRepository<Type, Integer> {
    public ArrayList<Type> findAll();
    @Query("select t from Type t where t.type.id=?1")
    public Type findBy_id(Integer id);
}

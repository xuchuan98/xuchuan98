package com.mi.demo.controller;

import com.mi.demo.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;


@Controller
@RequestMapping("/type")
public class TypeController {
    @Autowired
    com.mi.demo.dao.TypeRepository TypeService;

    @RequestMapping(value = "/All.html")
    @ResponseBody
    public ArrayList<Type> getType(){
        ArrayList<Type> type=  TypeService.findAll();
        return type;
    }
    @RequestMapping(value = "/id.html")
    @ResponseBody
    public Type getType1(Integer id){
        if(!TypeService.existsById(id))
            return null;
        Type type1=  TypeService.findBy_id(id);
        return type1;
    }
    @RequestMapping(value = "/save.html")
    @ResponseBody
    public String saveGood(Integer id, String tp){
            TypeService.save(new Type(id,tp));
            return "success";
    }
    @RequestMapping(value = "/save1.html")
    @ResponseBody
    public String saveGood1( HttpSession session){

        Type type2=(Type) session.getAttribute("type");
        if(type2!=null){
            TypeService.save(type2);
            return "success";
        }
        return "failed";
    }
    @RequestMapping(value = "/delete.html")
    @ResponseBody
    public String delete(Integer id){
        TypeService.deleteById(id);
        if(TypeService.existsById(id))
            return "fali";
        else return "success" ;
    }
}

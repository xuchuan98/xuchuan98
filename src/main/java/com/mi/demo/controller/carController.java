package com.mi.demo.controller;


import com.mi.demo.dao.carRepository;
import com.mi.demo.entity.carOrder;

import com.mi.demo.entity.carkeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping("/car")
public class carController {
    @Autowired
    carRepository carDao;

    @RequestMapping(value = "/oAll.html")
    @ResponseBody
    public ArrayList<carOrder> getcar1(){
        ArrayList<carOrder> car1=carDao.findAll();
        return car1;
    }

    @RequestMapping(value = "/oKey.html")
    @ResponseBody
    public carOrder getcar21(Integer cus,Integer good,Integer seller){
        carOrder car2=carDao.findByCkey(new carkeys(cus,good,seller));
        return car2;
    }
    @RequestMapping(value = "/oKey1.html")
    @ResponseBody
    public carOrder getcar2(HttpSession session){
        //new carkeys(1,10001,100001)
        carkeys ckey=(carkeys)session.getAttribute("carkeys");
        carOrder car2= carDao.findByCkey(ckey);
        return car2;
    }
    @RequestMapping(value = "/oid.html")
    @ResponseBody
    public ArrayList<carOrder> getcar3(Integer id){

        ArrayList<carOrder> car3= carDao.findBy_cusid(id);
        return car3;
    }

    @RequestMapping(value = "/osave.html")
    @ResponseBody
    public String save( HttpSession session){

        carOrder car4=(carOrder) session.getAttribute("car");
        if(car4!=null){
            carDao.save(car4);
            return "success";
        }
        return "failed";
    }

    @RequestMapping(value = "/odelete.html")
    @ResponseBody
    public String delete(HttpSession session){
        carkeys ckey=(carkeys)session.getAttribute("carkeys");
        carDao.deleteById(ckey);
        if(carDao.existsById(ckey))
            return "fali";
        else return "success" ;
    }
}

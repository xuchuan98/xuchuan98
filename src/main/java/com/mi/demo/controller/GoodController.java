package com.mi.demo.controller;


import com.mi.demo.dao.GoodRepository;
import com.mi.demo.entity.Good;

import com.mi.demo.entity.goodkeys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;


@Controller
@RequestMapping("/good")
public class GoodController {
    @Autowired
    com.mi.demo.dao.GoodRepository GoodService;

    @RequestMapping(value = "/gAll.html")
    @ResponseBody
    public ArrayList<Good> getGood(){
        ArrayList<Good> good=  GoodService.findAll();
        return good;
    }
    @RequestMapping(value = "/gkey.html")
    @ResponseBody
    public Good getGood1(Integer goodid,Integer seller){
        goodkeys gkey=new goodkeys(goodid,seller);
        if(!GoodService.existsById(gkey))
            return null;
        Good good1=  GoodService.findByGkey(gkey);
        return good1;
    }
    @RequestMapping(value = "/goodid.html")
    @ResponseBody
    public ArrayList<Good> getGood2(Integer id){
        ArrayList<Good> good2=  GoodService.findBy_goodid(id);
        return good2;
    }
    @RequestMapping(value = "/seller.html")
    @ResponseBody
    public ArrayList<Good> getGood3(Integer id){
        ArrayList<Good> good3=GoodService.findBy_sellerid(id);
        return good3;
    }

    @RequestMapping(value = "/save1.html")
    @ResponseBody
    public String saveGood( HttpSession session){
        //good4.setSalePrice(83.7f);
        //session.setAttribute("good",good4);
        Good good4=(Good)session.getAttribute("good");
        if(good4!=null){
            GoodService.save(good4);
            return "success";
        }
        return "failed";
    }
    @RequestMapping(value = "/save.html")
    @ResponseBody
    public String saveGood1( Integer good,Integer seller){
        Good good4=GoodService.findByGkey(new goodkeys(good,seller));
        if(good4!=null){
            GoodService.save(good4);
            return "success";
        }
        return "failed";
    }
    @RequestMapping(value = "/delete.html")
    @ResponseBody
    public String delete(Integer good,Integer seller){
        goodkeys gkey=new goodkeys(good,seller);
        GoodService.deleteById(gkey);
        if(GoodService.existsById(gkey))
            return "fali";
        else return "success" ;
    }

}

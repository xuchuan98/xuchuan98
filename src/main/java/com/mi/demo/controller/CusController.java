package com.mi.demo.controller;

import com.mi.demo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
@RequestMapping("/cus")
public class CusController {
    @Autowired
    com.mi.demo.dao.CusRepository cusService;

    @RequestMapping(value = "/cAll.html")
    @ResponseBody
    public ArrayList<Customer> getGood(){
        ArrayList<Customer> cus=  cusService.findAll();
        return cus;
    }
    @RequestMapping(value = "/cid.html")
    @ResponseBody
    public Customer getGood1(Integer id){
        if(!cusService.existsById(id))
            return null;
        Customer cus1=  cusService.findBy_id(id);
        return cus1;
    }
    @RequestMapping(value = "/csave.html")
    @ResponseBody
    public String saveGood(Integer cus,String pwd,String name,String address,String tel){

            cusService.save(new Customer(cus,pwd,name,address,tel));
            return "success";

    }
    @RequestMapping(value = "/csave1.html")
    @ResponseBody
    public String saveGood1( HttpSession session){
        Customer cus2=(Customer) session.getAttribute("cus");
        if(cus2!=null){
            cusService.save(cus2);
            return "success";
        }
        return "failed";
    }
    @RequestMapping(value = "/cdelete.html")
    @ResponseBody
    public String delete(Integer id){
        cusService.deleteById(id);
        if(cusService.existsById(id))
            return "fali";
        else return "success" ;
    }
}

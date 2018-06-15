package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Liam Liu
 * @date 2018/5/28 10:44
 */

@RestController

public class HelloController {

    @Autowired

    private  GirlProperties girlProperties;

    //@RequestMapping(value = "/hello",method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public  String say(@RequestParam("id") Integer id){
        return "id:" + id;
        //return girlProperties.getCupSize();
    }
}

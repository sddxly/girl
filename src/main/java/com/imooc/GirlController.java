package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Liam Liu
 * @date 2018/5/30 16:34
 */
@RestController
public class GirlController {

    @Autowired
    private  GirlRepository girlRepository;

    @Autowired

    private  GirlService girlService;
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();

    }
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age){
         Girl girl = new Girl();
         girl.setCupSize(cupSize);
         girl.setAge(age);

         return girlRepository.save(girl);
    }

    @GetMapping(value = "/girls/{id}")
    public Optional<Girl> girlFindOne(@PathVariable("id") Integer id ){
        return girlRepository.findById(id);
    }

    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.deleteById(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @PostMapping (value = "/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }

    @GetMapping (value = "/girls/age")
    public List<Girl> girlListAge(){

        return girlRepository.findByAge(18);
    }

}

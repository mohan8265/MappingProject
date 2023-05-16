package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Laptop;
import com.geekster.MappingPractice.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping()
    public String addLaptop(@RequestBody Laptop laptop){
        return laptopService.addLaptop(laptop);
    }
    @GetMapping()
    public List<Laptop> getLaptops(){
        return laptopService.getLaptops();
    }
    @GetMapping("/{id}")
    public Laptop getLaptop(@PathVariable String id){
        return laptopService.getLaptop(id);
    }
    @PutMapping("/{id}")
    public String updateLaptop(@PathVariable String id,@RequestBody Laptop laptop){
        return laptopService.updateLaptop(id,laptop);
    }
    @DeleteMapping("/{id}")
    public String deleteLaptop(@PathVariable String id){
        return laptopService.deleteLaptop(id);
    }

}

package com.geekster.MappingPractice.controllers;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.services.AddressService;
import org.aspectj.lang.annotation.DeclareError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping()
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }
    @GetMapping()
    public List<Address> getAddresses(){
        return addressService.getAddresses();
    }
    @GetMapping("/{id}")
    public Address getAddress(@PathVariable String id){
        return addressService.getAddress(id);
    }
    @PutMapping("/{id}")
    public String updateAddress(@PathVariable String id,@RequestBody Address address){
        return addressService.updateAddress(id,address);
    }
    @DeleteMapping("/{id}")
    public String deleteAddress(@PathVariable String id){
        return addressService.deleteAddress(id);
    }
}

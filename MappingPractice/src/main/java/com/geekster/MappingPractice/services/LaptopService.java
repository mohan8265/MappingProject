package com.geekster.MappingPractice.services;

import com.geekster.MappingPractice.models.Laptop;
import com.geekster.MappingPractice.repositories.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
        return "laptop saved...";
    }

    public List<Laptop> getLaptops() {
        return laptopRepo.findAll();
    }

    public Laptop getLaptop(String id) {
        return laptopRepo.findById(id).get();
    }

    public String updateLaptop(String id, Laptop laptop) {
        laptopRepo.save(laptop);
        return "laptop updated...";
    }
    public String deleteLaptop(String id) {
        laptopRepo.deleteById(id);
        return "Laptop deleted...";
    }
}

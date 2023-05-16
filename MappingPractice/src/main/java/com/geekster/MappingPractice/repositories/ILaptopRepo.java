package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,String> {
}

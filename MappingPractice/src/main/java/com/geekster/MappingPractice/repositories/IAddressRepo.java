package com.geekster.MappingPractice.repositories;

import com.geekster.MappingPractice.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,String> {
}

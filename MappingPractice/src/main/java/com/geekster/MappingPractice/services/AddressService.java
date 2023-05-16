package com.geekster.MappingPractice.services;

import com.geekster.MappingPractice.models.Address;
import com.geekster.MappingPractice.repositories.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address added";
    }

    public List<Address> getAddresses() {
        return addressRepo.findAll();
    }

    public Address getAddress(String id) {
        return addressRepo.findById(id).get();
    }

    public String updateAddress(String id, Address address) {
        addressRepo.save(address);
        return "address updated";
    }

    public String deleteAddress(String id) {
        addressRepo.deleteById(id);
        return "address deleted";
    }
}

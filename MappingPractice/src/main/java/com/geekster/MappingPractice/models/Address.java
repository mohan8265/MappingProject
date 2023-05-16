package com.geekster.MappingPractice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    private String addressId;
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;
}

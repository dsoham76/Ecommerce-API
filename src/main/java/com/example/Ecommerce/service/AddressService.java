package com.example.Ecommerce.service;

import com.example.Ecommerce.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
}

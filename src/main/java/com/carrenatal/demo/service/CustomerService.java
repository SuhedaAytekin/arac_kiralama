package com.carrenatal.demo.service;

import com.carrenatal.demo.dto.CarDTO;
import com.carrenatal.demo.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    public void createOrUpdateCustomer(CustomerDTO customerDTO);

//    public List<CustomerDTO> getAllCustomer();

    public void deleteCustomer(Long c_id);

//    public CustomerDTO editCustomer(Long id);

}

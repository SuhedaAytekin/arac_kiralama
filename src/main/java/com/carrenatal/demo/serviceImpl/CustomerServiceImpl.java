package com.carrenatal.demo.serviceImpl;


import com.carrenatal.demo.dto.CustomerDTO;
import com.carrenatal.demo.model.Customer;
import com.carrenatal.demo.repository.CustomerRepository;
import com.carrenatal.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void createOrUpdateCustomer(CustomerDTO customerDto) {
        Customer customer = convertDtoToModel(customerDto);
        customerRepository.save(customer);
    }

//    @Override
//    public List<CustomerDTO> getAllCustomer() {
//        List<Customer> list = customerRepository.findAll();
//        List<CustomerDTO> customerList = list.stream()
//                .map(CustomerDTO::new).map
//                .collect(Collectors.toCollection(ArrayList::new));
//        return customerList;
//    }

    @Override
    public void deleteCustomer(Long c_id) {
        customerRepository.deleteById(c_id);
    }


//    @Override
//    public CustomerDTO editCustomer(Long id) {
//        Customer customer = customerRepository.getOne(id);
//        return convertModelToDTO(customer);
//    }
        private Customer convertDtoToModel(CustomerDTO customerDto) {
            Customer customer = new Customer();
            if (customerDto.getC_id() != null) {
                customer.setC_id(customerDto.getC_id());
            }
            //customer.setId(customerDto.getId());
            customer.setAd(customerDto.getAd());
            customer.setSoyad(customerDto.getSoyad());
            customer.setTc(customerDto.getTc());
            customer.setTelefon(customerDto.getTelefon());
            customer.setKiralanan_plaka(customerDto.getKiralanan_plaka());

            return customer;
        }

//        private CustomerDTO convertModelToDTO(Customer customer) {
//            CustomerDTO customerDTO = new CustomerDTO();
//            customerDTO.setId(customer.getId());
//            customerDTO.setAd(customer.getAd());
//            customerDTO.setSoyad(customer.getSoyad());
//            customerDTO.setTc(customer.getTc());
//            customerDTO.setTelefon(customer.getTelefon());
//            customerDTO.setKiralanan_plaka(customer.getKiralanan_plaka());
//
//            return customerDTO;
//        }
    }


package br.com.mastertech.couto.cliente.controller;


import br.com.mastertech.couto.cliente.models.dto.*;
import br.com.mastertech.couto.cliente.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public CreateCustomerResponse create(@RequestBody @Valid CreateCustomerRequest createCustomerRequest) {
        Customer customer = customerMapper.toCustomer(createCustomerRequest);

        customer = customerService.create(customer);

        return customerMapper.toCreateCustomerResponse(customer);
    }

    @GetMapping("/{id}")
    public GetCustomerResponse getById(@PathVariable Long id) {
        Customer customer = customerService.getById(id);

        return customerMapper.toGetCustomerResponse(customer);
    }

}

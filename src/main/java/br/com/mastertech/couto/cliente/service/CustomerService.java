package br.com.mastertech.couto.cliente.service;

import br.com.mastertech.couto.cliente.models.dto.Customer;
import br.com.mastertech.couto.cliente.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.mastertech.couto.cliente.exception.*;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getById(Long id) {
        Optional<Customer> byId = customerRepository.findById(id);

        if(!byId.isPresent()) {
            throw new CustomerNotFoundException();
        }

        return byId.get();
    }

}

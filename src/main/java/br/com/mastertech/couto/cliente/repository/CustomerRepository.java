package br.com.mastertech.couto.cliente.repository;

import br.com.mastertech.couto.cliente.models.dto.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}

package br.com.mastertech.couto.cliente.models.dto;


import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer toCustomer(CreateCustomerRequest createCustomerRequest) {
        Customer customer = new Customer();
        customer.setName(createCustomerRequest.getName());
        return customer;
    }

    public CreateCustomerResponse toCreateCustomerResponse(Customer customer) {
        CreateCustomerResponse createCustomerResponse = new CreateCustomerResponse();
        createCustomerResponse.setId(customer.getId());
        createCustomerResponse.setName(customer.getName());
        return createCustomerResponse;
    }

    public GetCustomerResponse toGetCustomerResponse(Customer customer) {
        GetCustomerResponse getCustomerResponse = new GetCustomerResponse();
        getCustomerResponse.setId(customer.getId());
        getCustomerResponse.setName(customer.getName());
        return getCustomerResponse;
    }

}

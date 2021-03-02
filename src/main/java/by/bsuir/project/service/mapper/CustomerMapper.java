package by.bsuir.project.service.mapper;

import by.bsuir.project.dto.CustomerDto;
import by.bsuir.project.model.Customer;
import by.bsuir.project.service.interfaces.MapperService;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper implements MapperService<Customer, CustomerDto> {

    @Override
    public Customer toEntity(CustomerDto customerDto) {
        return Customer.builder()
                .id(customerDto.getId())
                .name(customerDto.getName()).build();
    }

    @Override
    public CustomerDto toDto(Customer customer) {
        return CustomerDto.builder()
                .id(customer.getId())
                .name(customer.getName()).build();
    }
}

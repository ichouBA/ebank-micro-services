package net.ichou.customerservice.web;

import lombok.AllArgsConstructor;
import net.ichou.customerservice.entities.Customer;
import net.ichou.customerservice.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CustomerRestController {
  private CustomerRepository customerRepository;

  @GetMapping("/customers")
  private List<Customer> customerList(){
      return customerRepository.findAll();
  }

  @GetMapping("/customers/id")
  public Customer customerById(@PathVariable Long id){
      return customerRepository.findById(id).get();
  }
}

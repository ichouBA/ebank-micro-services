package net.ichou.customerservice;

import net.ichou.customerservice.config.GlobalConfig;
import net.ichou.customerservice.entities.Customer;
import net.ichou.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;

@EnableConfigurationProperties({GlobalConfig.class})
@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            List<Customer> customerList=List.of(
                    Customer.builder()
                            .firstName("ichou")
                            .lastName("youssef")
                            .email("ichou@gmail.com")
                            .build(),
                    Customer.builder()
                            .firstName("youssef")
                            .lastName("hassan")
                            .email("hassan@gmail.com")
                            .build()
            );
            customerRepository.saveAll(customerList);
        };
    };
}

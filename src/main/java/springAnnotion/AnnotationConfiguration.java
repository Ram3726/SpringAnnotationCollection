package springAnnotion;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfiguration {

    @Bean
    public Employee employee(){
        return new Employee();
    }

    @Bean
    public Company company(){

        return new Company(employee());
    }




}

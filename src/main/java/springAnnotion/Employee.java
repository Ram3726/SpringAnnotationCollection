package springAnnotion;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    public Employee(){
        System.out.println("Inside Employee constructor");
    }

    public void checkEmployee(){
        System.out.println("Employee method exist");
    }



}

package springAnnotion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExecutionMain {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);

        Company company = context.getBean(Company.class);

        company.checkCompany();


    }



}

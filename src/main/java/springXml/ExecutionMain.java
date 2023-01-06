package springXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionMain {

    public static void main(String[] args) {
       /* Employee employee = new Employee();
        Company company = new Company(employee);*/



        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Company company = (Company) context.getBean("company");
        company.checkCompany();





    }

}

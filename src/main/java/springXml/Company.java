package springXml;

public class Company {
    private Employee employee;





    public Company( Employee employee){
        System.out.println("inside company constructor");
        this.employee = employee;



    }

    public void checkCompany(){
        //System.out.println("company method");
        this.employee.checkEmployee();

    }


}

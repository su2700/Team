package stuff;

public class employee extends  stuff{
    double salary;
    date payDate;

    public void employeeManagement{
        System.out.println("This is employee Management");
    }
    private void getSalary(double salary, date payDate)
    {
        super(salary, payDate);
        System.out.println("you are salary is" + salary);
        System.out.println("payment date is" + salary);
    }
}

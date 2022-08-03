public class Main
{
    public static void main(String[] args)
    {

        Employee emp = new Employee("Kemal",2000,45,1985);
        Salary s = new Salary(emp);

        s.tString();


    }
}

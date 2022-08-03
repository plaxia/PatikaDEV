public class Salary {
   Employee emp;
   Salary(Employee emp)
   {
       this.emp=emp;

   }
    void Tax(Employee emp)
    {
      if(emp.salary<=1000)
      {
          System.out.println("Tax :"+emp.salary);
          emp.salary=emp.salary;
      }
      else
      {
          System.out.println("Tax :"+emp.salary*0.03);
          emp.salary=(emp.salary)*0.97;
      }
    }

    void Bonus(Employee emp)
    {
        int overTime;
       if(emp.workHours>40)
       {
           overTime=emp.workHours-40;
           System.out.println("Bonus: "+overTime*30);
           emp.salary+=overTime*30;
       }
       else {
          emp.salary=emp.salary;
       }
    }
    void raiseSalary(Employee emp)
    {
        if (2021-emp.hireYear<10)
        {
            emp.salary=emp.salary*1.05;
            System.out.println("Increase in Salary"+emp.salary*0.05);
            System.out.println("Total Salary: "+emp.salary);

        }
        else if ((2021 - emp.hireYear)<20&&(2021-emp.hireYear)>9)
        {
            emp.salary=emp.salary*1.1;
            System.out.println("Increase in Salary:"+emp.salary*0.1);
            System.out.println("Total Salary: "+emp.salary);

        } else if ((2021 - emp.hireYear)>19)
        {
            emp.salary=emp.salary*1.15;
            System.out.println("Increase in Salary :"+emp.salary*0.15);
            System.out.println("Total Salary: "+emp.salary);
        }
    }
    void tString()
    {

        System.out.println("Name:"+emp.name);
        System.out.println("Salary:"+emp.salary);
        System.out.println("Work Hours:"+emp.workHours);
        System.out.println("Start Year:"+emp.hireYear);
        Tax(emp);
        Bonus(emp);
        raiseSalary(emp);

    }

}

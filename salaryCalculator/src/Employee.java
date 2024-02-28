public class Employee {
    String name;
    int salary;
    int workhours;
    int hireyear;

    Employee (String name, int salary, int workhours, int hireyear) {
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireyear = hireyear;
    }

    //tax
    public double tax() {
        double taxAmount = 0.0;
        if (this.salary > 1000) taxAmount = this.salary * 0.03; return taxAmount;
    }

    //bonus haftalık toplam çalışma saatinden 40 çıkarıp kalanı ekstra saatlik ücret ile çarpıyoruz
    public double bonus() {
        double bonusA = 0.0;
        if (this.workhours > 40) bonusA = (this.workhours - 40) * 30.0; return bonusA;
    }

    //Maaş zam değeri
    public double raiseSalary(){
        double raisedSalary=0.0;
        if((2021-hireyear)<10) raisedSalary=this.salary*0.05;
        else if((2021-hireyear)<9 && (2021-hireyear)<20) raisedSalary=this.salary*0.1;
        else if((2021-hireyear)>19) raisedSalary=this.salary*0.15;
        return raisedSalary;
    }

    //çalışan bilgileri
    public String toString(){
        double salaryTaxBonus=this.salary-tax()+bonus();
        double totalSalary=salaryTaxBonus+raiseSalary();

        String employeeInfo = "";
        System.out.println("Name: " + this.name );
        System.out.println("Salary: " + this.salary+" TL");
        System.out.println("Hire Year: " + this.hireyear+" TL");
        System.out.println("Tax: " + tax() +" TL");
        System.out.println("Bonus: " + bonus() +" TL");
        System.out.println("Salary Increment: " + raiseSalary() +" TL");
        System.out.println("Salary includes tax and bonus: " + salaryTaxBonus +" TL");
        System.out.println("Total Salary: " + totalSalary +" TL");

        return employeeInfo;


    }




}

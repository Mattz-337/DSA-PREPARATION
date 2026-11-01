class Employee{
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("ID: "+id);
        System.out.println("NAME: "+name);
        System.out.println("SALARY: "+salary);
    }
}

class Manager extends Employee{
    String department;

    Manager(int id,String name,double salary,String department){
        super(id,name,salary);
        this.department = department;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("DEPARTMENT: "+department);
    }
}

class P3{
    public static void main(String[] args){
        Manager m1 = new Manager(101,"matthew",50000,"IT");
        m1.displayDetails();
    }
}
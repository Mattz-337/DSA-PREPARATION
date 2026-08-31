class employee {
    String name;
    int salary;

    employee(String name,int salary){
        this.name = name;
        this.salary = salary;
    }

}

class manager extends employee {
    int bonus;

    manager(String name,int salary,int bonus){
        super(name, salary);
        this.bonus = bonus;
    }
    int totalpay(){
        return salary + bonus;
    }
}


class main {
    public static void main(String[] args) {
        manager m = new manager("Matthew",10000,500);

        System.out.println("name: "+m.name);
        System.out.println("salary: "+m.salary);
        System.out.println("bonus: "+m.bonus);
        System.out.println("totalpay: "+m.totalpay());
    }
}

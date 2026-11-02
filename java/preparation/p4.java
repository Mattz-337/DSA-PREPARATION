class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void displayPerson(){
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
    }
}

class Student extends Person{
    int rollNo;

    Student(String name,int age,int rollNo){
        super(name, age);
        this.rollNo = rollNo;
    }
    void displayStudent(){
        displayPerson();
        System.out.println("ROLLNO: "+rollNo);
    }
}

interface Sports{
    void playSports();
}

interface Academics{
    void displayMarks();
}

class CollegeStudent extends Student implements Sports,Academics{
    String sports;
    int marks;

    CollegeStudent(String name,int age,int rollNo,String sports,int marks){
        super(name, age, rollNo);
        this.sports = sports;
        this.marks = marks;
    }

    public void playSports(){
        System.out.println("SPORTS: "+sports);
    }
    public void displayMarks(){
        System.out.println("MARKS: "+marks);
    }
}

class P4{
    public static void main(String[] args){
        CollegeStudent c1 = new CollegeStudent("matthew", 19, 25, "football", 100);
        c1.displayStudent();
        c1.playSports();
        c1.displayMarks();
    }
}
class Person {
    String name;

    Person(String name){
        this.name = name;
    }
}

class Student extends Person {
    int rollNumber;

    Student(String name,int rollNumber){
        super(name);
        this.rollNumber = rollNumber;
    }
}

class GraduateStudent extends Student {
    String researchTopic;

    GraduateStudent(String name,int rollNumber,String researchTopic){
        super(name, rollNumber);
        this.researchTopic = researchTopic;
    }
}

class main {
    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent("matthew", 25, "Java");

        System.out.println("Name: " + g.name);
        System.out.println("Roll Number: " + g.rollNumber);
        System.out.println("Research Topic: " + g.researchTopic);
    }
}
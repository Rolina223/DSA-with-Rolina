package OOPS;

class student{

    int age;
    String name;

    //Default constructor
    student(){
        name = "Rolina";
        age = 27;
    }

    //Parametrized constructor
    student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void changeName(String name){
        this.name = name;
    }

    void display(){
        System.out.println(name + " " + age );

    }


}

public class Constructor {

    public static void main(String[] args) {

        student s1 = new student();
        s1.display();

        student s2 = new student("Rolina" , 28);
        s2.display();

        s2.changeName("LIRO");
        s2.display();

        student s3 = new student("Roliza" , 29);
        s3.display();

    }

}

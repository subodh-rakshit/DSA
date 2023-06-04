public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "subodh";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // copy
        s2.password = "xyz";
        System.out.println("s2 created and printing");
        for(int i = 0; i < 3; i++){
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name);
        System.out.println(s2.roll);
        s1.marks[2] = 100;
        s1.name = "Rakshit";
        s1.roll = 987;
        System.out.println("s1 changed after creating s2 and changed the value of s1");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    // Shallow Copy Constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // Deep Copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    // Non parameterized constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called");
    }

    // Parameterized constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
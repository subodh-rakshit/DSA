// Find out the correct statement to assign name to object

// class Student{
//     String name;
//     int marks;
// }

// public class OOPS{
//     public static void main(String[] args) {
//         Student s = new Student();
//         // Fill here
//     }
// }

// Options:

// a. s->name = "aman";         -> this is for C++
// b. Student.name = "aman";    -> If it was a static variable then we could have directly accessed through class itself
// c. s.name = "aman";

class Student{
    String name;
    int marks;
}

public class PracticeQuestion1 {
    public static void main(String[] args) {
        Student s = new Student();

        // dot operator is used to assign some of the value
        s.name = "aman";
        System.out.println(s.name);
    }   
}

// Correct Answer : c
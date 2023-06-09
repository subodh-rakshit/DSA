// Which variable(s) can the class Person access in the following Code?

// class Person{
//     String name;
//     int weight;
// }

// class Student extends Person{
//     int rollNumber;
//     String schoolName;
// }

// Options: 
// a. name
// b. weight
// c. rollNumber
// d. schoolName

class Person {
    String name;
    int weight;
}

// Here we are using inheritance concept
class Student extends Person {
    int rollNumber;
    String schoolName;
}

public class PracticeQuestion2 {
    public static void main(String[] args) {

    }
}

// Correct Answer : a, b

// Now if was the question was for the Student class
// Then all the 4 were right
// Which of the following modifiers are not allowed in front of clas

// Options:
// a. private   -> if we make a class private then we cannot make an object of the private class inside another class and hence the parent class will become unusable
// b. protected -> we cannot make a class as protected as it will be unusable
// c. public    -> in a class public can be there because public can be accessed anywhere
// d. default   -> in a class if no modifier is assigned then it will take the default modifier

public class PracticeQuestion3 {
    
}

// Correct answer : a, b

// Now the mapping goes like this

//             private     default     protected       public  

// class       No          yes         no              yes
// nestedclass 
// constructor
// method
// field

// all will be yes other than class
// What will be the output of this code?

// class Book{
//     int price;
//     static int count;

//     public Book(int price){
//         this.price = price;
//         count++;
//     }
// }

// public class OOPS{
//     public static void main(String[] args) {
//         System.out.println(Book.count);
//         Book b1 = new Book(150);
//         Book b2 = new Book(250);
//         System.out.println(Book.count);
//     }
// }

// Options:

// a. Error
// b. 0 2
// c. 1 2
// d. 2 2

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}

public class PracticeQuestion8 {
    public static void main(String[] args) {
        System.out.println(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);
    }
}


// static variable can be accessed with the help of class variable
// so the correct answer will be 0 2

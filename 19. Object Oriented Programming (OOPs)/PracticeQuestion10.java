// What would be the output of the following code?

// class Test{
//     static int a = 10;
//     static int b;
//     static void changeB(){
//         b = a * 3;
//     }
// }

// class OOPS{
//     public static void main(String[] args) {
//         Test t = new Test();
//         t.changeB();
//         System.out.println(Test.a + Test.b);
//     }
// }


class Test{
    static int a = 10;
    static int b;               // Default value = 0;
    static void changeB(){
        b = a * 3;              // b = 30;
    }
}

public class PracticeQuestion10 {
    public static void main(String[] args) {
        Test t = new Test();
        t.changeB();
        System.out.println(Test.a + Test.b);    // 10 + 30 = 40
    }
}


// Correct Answers = 40
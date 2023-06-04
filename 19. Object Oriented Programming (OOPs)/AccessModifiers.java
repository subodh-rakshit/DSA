public class AccessModifiers {
    public static void main(String[] args) {
        // created a pen object called p1
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.println(p1.color);
        p1.color = "Red";
        System.out.println(p1.color);

        // creating object of BankAccount class
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "subodhrakshit";
        // myAcc.password = "abcdefghi"; // private property can't be updated

        // we can set the password by this way
        myAcc.setPassword("abcdefghij");

    }
}

// access modifiers in BankAccount class
class BankAccount {
    public String userName;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage; // cgpa

    void calculatePercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}
import java.util.*;

public class ArrayInputOutputUpdate{
  public static void main(String args[]){
    int marks[] = new int[100];

    Scanner sc = new Scanner(System.in);
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();
    marks[2] = sc.nextInt();

    System.out.println("Phy: "+marks[0]);
    System.out.println("Chem: "+marks[1]);
    System.out.println("Maths: "+marks[2]);
    marks[2] = 100;
    System.out.println(marks[2]);

    int percentage = (marks[0] + marks[1] + marks[3]) / 3;
    System.out.println("Percentage is: "+percentage);

    // Length of the array
    System.out.println("Length of marks array is: "+marks.length);
  }
}
import java.util.*;

public class PassOrFail{
  public static void main(String args[]){
    int marks = 67;

    String reportCard = (marks >= 33) ? "Pass" : "Fail";
    System.out.println(reportCard);
  }
}
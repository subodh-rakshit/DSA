public class BinaryToDecimal{

  public static void binToDec(int binaryNum){
    int myNumber = binaryNum;
    int pow = 0;
    int decNum = 0;

    while(binaryNum > 0){
      int lastDigit = binaryNum % 10;
      decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

      pow++;
      binaryNum = binaryNum / 10;
    }

    System.out.println("Decimal of "+myNumber+ " = "+decNum);
    
  }
  
  public static void main(String args[]){
    binToDec(101);
  }
}
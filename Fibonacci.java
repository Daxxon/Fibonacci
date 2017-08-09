public class Fibonacci {

  public static void main(String args[]){
    int currentNumber = 1;
    int prvsNumber = 0;
    int total = 0;
    int temp = 0;
    int evensOnly = 0;
    while(currentNumber < 4000000){
      total = total + currentNumber;
      temp = currentNumber;
      currentNumber = currentNumber + prvsNumber;
      prvsNumber = temp;
      if(currentNumber%2 == 0){
        evensOnly = evensOnly + currentNumber;
      }
    }    
    System.out.println("The current number is: " + prvsNumber);
    System.out.println("The total is: " + total);
    System.out.println("The total of only the even numbers in the sequence is: " + evensOnly);
  }
}

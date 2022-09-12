import java.util.Scanner;

public class q2 {
    
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.close();
    boolean flag = false;
 try {
    if (num<0) {
        throw new NegativeNumberNotAllowedException();
    }else{
        
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
     }
    }

 try{  
     if (!flag)
      System.out.println(num + " is a prime number.");
    else
      {
        System.out.println(num + " is not a prime number.");
        throw new NumberNotPrimeException();
      }
    }
    catch(NumberNotPrimeException e){
        System.out.println(e);
    }
 } catch (NegativeNumberNotAllowedException e) {
   System.out.println(e);
 }
    
  }
}

class NegativeNumberNotAllowedException extends Exception{
    NegativeNumberNotAllowedException(){
        System.out.println("entered number is negative");
    }
}

class NumberNotPrimeException extends Exception{
    NumberNotPrimeException(){
        System.out.println("entered number is not prime");
    }
}
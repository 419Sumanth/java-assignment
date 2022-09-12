import java.util.*;


class ArithmeticException extends Exception{
	
	public ArithmeticException(String s){
		
		super(s);
	}
}


// 1.ArithmeticException
class exception{
    public static void main(String args[])
        {
           Scanner sc = new Scanner(System.in);
            try {
                int a = 42, b = 0;
                if(b==0)
                throw new ArithmeticException("can't divide a number by 0");
                int c = a / b; 
                System.out.println("result = " + c);
            }
            catch(ArithmeticException e) {
                System.out.println(e);
            }

             System.out.println("enter an integer");
             int f=sc.nextInt();

            try{
                if(f%2==1)
                throw new oddnumberexception();
               }

            catch(oddnumberexception e){
                System.out.println(e);
            }

            System.out.println("enter an integer");
            int g=sc.nextInt();

            try{
                if(g%2==0)
                throw new evennumberexception();    
               }

            catch(evennumberexception e){
                System.out.println(e);
            }   

            
        }
}

class oddnumberexception extends Exception{
    oddnumberexception(){
        System.out.println("odd number should not come");
    }

}

class evennumberexception extends Exception{
    evennumberexception(){
        System.out.println("even number should not come");
    }
}
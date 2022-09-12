import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        sc.close();
    
        try {
            if(str.contains("sdmcet")){
                System.out.println("sdmcet found");
            }
            else{
                throw new SubStringNotFoundException();
            }
        } catch (SubStringNotFoundException e) {
            System.out.println(e);
        }
    }
    
}
class SubStringNotFoundException extends Exception{
    SubStringNotFoundException(){
        System.out.println("sdmcet not found");
    }
}
 
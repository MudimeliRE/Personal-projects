/*this programme will calculate an individual's age 
when they insert their year of birth and according to their age, it'll 
determine if they can only smoke, drink and smoke, or they are too young */
import java.util.Scanner;
public class AgeCalculator {

    
    public static void main(String[] args) { 
        Scanner sx= new Scanner(System.in);
        
        System.out.println("enter your Birth year:");
        int birth= sx.nextInt();
        
       int sum=(2024-birth);
       
       System.out.println("Your age is "+ sum);
       
       if (sum>=16 && sum<18){ System.out.print("You can only smoke");}
       
       if (sum>=18){ System.out.print("You can drink and smoke!!");}
       
       else {System.out.print("You're too young!!");
       
       
               
               }
        
        
        
    }
    
}

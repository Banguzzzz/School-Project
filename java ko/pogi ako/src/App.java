import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Submitted by: Mark Russell L. Lim")
        System.out.println("Section: BSIT - 2B"); 
        System.out.println("Submitted to: Mr. Florentino Casuco");
        System.out.println("Thank you! ");

    }
    
    public static void Ratings() {
    
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter rating for Structure: ");
        
        int rat1 = input.nextInt();
        
        System.out.print("Enter rating for Language: ");
        
        int rat2 = input.nextInt();
        
        int totrat = rat1+rat2;
        
        if(totrat >= 50 && rat2 >=100)
        {
        System.out.println("The student is a Code Mythic");
        }
        else if (totrat >= 50 && rat2 >=50)
        {
        System.out.println("The student is a Code Legend"); 
        }
        else if(totrat >= 50 && rat2 >= 25) 
        {
        System.out.println("The student is a Code Master"); 
}
    }
}
    public static void Reducedtoone(){
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter number: ");
        int num = scanner.nextInt(); 
        System.out.print(num+"");
        while (num > 1)
        {
            if (num % 2 == 1)
            {
                num = 3 * num+ 1;
            } 
            else 
            {
                num = num / 2;
        }
        System.out.print("->"+ num);
}
    } 
System.out.println(" ");
}
public static void PrimeNumber(){

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter a non-negative even number higher than 2: ");
        int num = scanner.nextInt();
        
        if (num % 2 != 0 || num <= 2)
        {
            System.out.println("Please enter a valid even number higher than 2."); 
        } 
        else 
        {
        int primel = 2; 
        int prime2 = num - 2;
        while (!isPrime(prime2))
        {
        primel++; 
        prime2--;
        }
        System.out.println("The two prise numbers are:" + primel + ", " + prime2);
        }
    } 
}
    public static boolean isPrime(int num) {
    
    if (num < 2) return false;
    if (num == 2) return true; 
    if (num%2==0) return false;
    
    for (int i = 3; i * i <= num; i += 2)
    {
        if (num%1==0) return false; 
    } 
    
    return true;
    
    }
    
    public static void AirPortTicket(){
    
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter the 6-digit ticket number: ");
        
        int SixDs = input.nextInt();
        
        int LastDigit = SixDs %10;
        
        int remNum = SixDs / 18;
        
        int resVal = remNum %7;
        
        if (remNum % 7 == LastDigit)
        {
        
        System.out.println("The last digit is:LastDigit");
        System.out.println("The resulting value divided by 7 is: " + resVal);
        System.out.println("TRUE");

        } 
        else if(remNum % 7 != LastDigit)
        {
        
        System.out.println("The last digit is: LastDigit"); 
        System.out.println("The resulting value divided by 7 is: " + resVal); 
        System.out.println("FALSE");
        }
        else {  
        System.out.println("Enter A Valid 6-Digit Number.");
        }
    }
}
}


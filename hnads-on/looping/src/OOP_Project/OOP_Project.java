package OOP_Project;
import java.util.Scanner;
public class OOP_Project {

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
    try (Scanner input = new Scanner(System.in)) {
        char choice1 = ' ',choice2 = ' ';
        do{
            System.out.println("============WELCOME TO OBJECT ORIENTED PROGRAMMING!!=============");
            System.out.println("================CHOOSE FROM THE FOLLOWING========================");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("1.)----------SEQUENTIAL----------------------------------------::");
            System.out.println("2.)----------SELECTION-----------------------------------------::");
            System.out.println("3.)----------LOOPING-------------------------------------------::");
            System.out.println("4.)----------EXIT----------------------------------------------::");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("Enter your choice here:___ " );
            choice1 = input.next().charAt(0);
            System.out.print("\033c");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            switch(choice1){
                case '1':
                sequential();
                break;
                case '2':
                Selection();
                break;
                case '3':
                Looping();
                break;
                case '4':
                System.out.println("Code Exit...");
                choice2 = 'N';
                break;
                default:
                System.out.println("Invalid Input!");
                System.out.println("Do you want to continue ? (Y) for yes if not press any key to continue");
                choice2 = input.next().charAt(0);
                System.out.print("\033c");
                break;                         
                }
            }
            while(choice2 == 'y' || choice2 == 'Y');
        }
    } 
    
    
    static void sequential()
    {
        try (Scanner input2 = new Scanner(System.in)) {
            boolean exit = false;
            char ans;
            do
            {

            System.out.println("================HI!!!! WELCOME TO SEQUENTIAL====================="); 
            System.out.println("=================CHOOSE FROM THE FOLLOWING=======================");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("A.)----------Area of Rectangle-------------------------------- ::");
            System.out.println("B.)----------Farenheit to Celsius----------------------------- ::");
            System.out.println("C.)----------Circle------------------------------------------- ::");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("Enter your choice:___ ");
            ans = input2.next().charAt(0);
            System.out.print("\033c");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

            switch(ans)
            {
                case 'a':
                case 'A':
                System.out.print("Enter the Lenght:___ ");
                double l = input2.nextDouble();
                System.out.print("Enter the Width:___ ");
                double w = input2.nextDouble();
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.print("\033c");
                
                double a = l*w;
                System.out.println("This is the area of a rectangle: " + a);
                break;

                case 'b':
                case 'B':
                System.out.print("Enter Fahrenheit:___ ");
                Double f = input2.nextDouble();
                double c = (f-32)*5/9;
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("The converted temperature of fahrenheit into celsius is: "+ c);
                break;

                case 'c':
                case 'C':
                System.out.print("Enter Radius:___ ");
                double r = input2.nextDouble();
                System.out.print("\033c");

                a = Math.PI * Math.pow(r, 2);
                c = 2* Math.PI * r;
                double d = 2 * r;
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("Area of a Circle: " + a);
                System.out.println("Circumference of a Circle: " + c);
                System.out.println("Diameter of a Circle: " + d);
                break;
                
                default: 
                System.out.println("INVALID INPUT!");
                break;
            }
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("To go back to Selection Choices (Y): "); 
            System.out.println("To go back to Main menu         (N): ");
            System.out.println("To end the code press any key   ( ): "); 
            System.out.print(":___ ");
            char choose = input2.next().charAt(0);
            System.out.print("\033c");

            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            if(choose == 'Y' || choose == 'y')
            {
                exit = true;
            }
            else if (choose == 'N' || choose == 'n')
            {
                menu();
            }
            else
            {
                exit = false;
            }
        }
        while(exit == true);
    }
}
 
 
    public static void Selection()
    {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean exit = true;
            do
            {
            System.out.println("================HI!!!! WELCOME TO SElECTION======================="); 
            System.out.println("=================CHOOSE FROM THE FOLLOWING=======================");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("1.)----------Determine if a number is ODD or EVEN------------- ::");
            System.out.println("2.)----------Check if a Year is a Leap Year------------------- ::");
            System.out.println("3.)----------Calculate shipping cost based on weight(in pounds)::");
            System.out.println("4.)----------Exit--------------------------------------------- ::");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            char choose = scanner.next().charAt(0);
            System.out.print("\033c");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");    
                if(choose == '1' || choose== '2' || choose == '3' || choose == '4')
                {
                    switch (choose){
                        case '1': 
                        {
                            System.out.print("Enter an Integer:___ ");
                            int number = scanner.nextInt();
                            System.out.print("\033c");
                            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                            if (number % 2 == 0)
                            {
                            System.out.println(number + " is even.");
                            }
                            else
                            {
                            System.out.println(number + " is odd.");
                            }
                            break;
                        }
                        case '2':
                        {
                            System.out.print("Enter a Year:___ ");
                            int year = scanner.nextInt();
                            System.out.print("\033c");
                            boolean isLeapYear = false;
                            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
                            {
                                isLeapYear = true;
                            }
                            if (isLeapYear)
                            {
                            System.out.println(year + " is a leap year.");
                            }
                            else
                            {
                            System.out.println(year + " is not a leap year.");
                            }
                            break;
                        }
                        case '3':
                        {
                            System.out.print("Enter the weight of the package in pounds:___ ");
                            double weight = scanner.nextDouble();
                            System.out.print("\033c");
                            double shippingCost;
                            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                            if (weight <= 10)
                            {
                                shippingCost = 250.00;
                            }
                            else
                            {
                                shippingCost = 400.00;
                            }
                            System.out.println("Shipping cost for a " + weight + " pound package: PHP " + shippingCost);
                            break;
                        }
                        case '4' :
                        {
                            exit = false;
                            break;
                        }
                        default :
                        {
                    
                    System.out.println("INVALID INPUT!");
                    break;
                        }
                    }
                }
                else
                {
                    
                    System.out.println("INVALID INPUT!");
                }
                    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("To go back to Selection Choices (Y): "); 
                    System.out.println("To go back to Main menu(N): ");
                    System.out.println("To end the code press any key: "); 
                    System.out.print(":___ ");
                    choose = scanner.next().charAt(0);
                    System.out.print("\033c");

                    if(choose == 'Y' || choose == 'y')
                    {
                        exit = true;
                    }
                    else if (choose == 'N' || choose == 'n')
                    {
                        menu();
                    }
                    else
                    {
                        exit = false;
                    }
            }
            while(exit == true);
        }
    }


    public static void Looping()
    {
        try (Scanner p = new Scanner(System.in)) {
            char choice3 = ' ',choice4 = ' ', choice5 = ' ';
            boolean exit2 = false;
            do
            {
            System.out.println("================HI!!!! WELCOME TO ITERATION======================"); 
            System.out.println("=================CHOOSE FROM THE FOLLOWING=======================");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("1.)----------First 10 Fibonacci Numbers------------------------::");
            System.out.println("2.)----------ATM SIMULATION------------------------------------::");
            System.out.println("3.)----------Multiplication Table of a given Number------------::");
            System.out.println("4.)----------Exit----------------------------------------------::");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("Enter your choice:___ ");
            choice3 = p.next().charAt(0);
            System.out.print("\033c");
            System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                if(choice3 == '1' || choice3 == '2' || choice3 == '3' || choice3 == '4')
                {
                    switch(choice3)
                    {
                        case '1' :
                        {
                            System.out.println("--FIBONACCI SEQUENCE--");
                            System.out.print("0, 1, ");
                            int x, sum, range = 1, domain = 0;
                            
                            for (x = 2; x <= 9; x++)
                            {
                                sum = domain + range;
                                System.out.print(sum + ", ");
                                domain = range;
                                range = sum;
                            }
                            break;
                        }
                        case '2' :
                        { 
                                System.out.println("Welcome to --ATM SIMULATION--");
                            double totalbalance = 0;
                            boolean iterate = false;
                            
                                System.out.println("Please Enter ATM Initial Balance:___  ");
                                totalbalance = p.nextDouble();
                                System.out.print("\033c");
                                
                                
                                
                            do
                            {
                                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                                System.out.println("ATM BALANCE:Php " + totalbalance);
                                System.out.println("How much do you want to withdraw? ");
                                System.out.print("Insert Amount:___ ");
                                double wdraw = p.nextDouble();
                                System.out.print("\033c");
                                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                                
                            if(wdraw >= 1 && wdraw <= totalbalance){
                                totalbalance = totalbalance - wdraw;                                                
                                System.out.println("Withdrawal Successful:");             
                                System.out.println("You Withdraw a total of:Php "+ wdraw);
                                System.out.println("Your remaining Balance is:Php "+ totalbalance);
                                
                            }
                            else
                            {   System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                                System.out.println("Invalid Withdrawal, No enough Balance:");
                                
                            }
                                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                                System.out.println("Do you want to withdraw again ? y for yes if not pres any key: ");
                                if(choice4 == 'y' || choice4 == 'Y'){
                                    if(totalbalance >=1){
                                        iterate = true;
                                    }
                                    else{
                                        iterate = false;
                                        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"); 
                                        System.out.println("Sorry your ATM Account is out of balance:");
                                    }
                                    }
                                    else
                                    {
                                        iterate = false;
                                    }
                                }
                                while (iterate == true);
                                break;
                            }
                            case '3' :
                            {
                                int m,x,mt;
                                System.out.print("Input a number to Multiply:___ ");
                                m = p.nextInt();
                                System.out.println("Multiplication Table of the number: "+ m);
                                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                                for(x=1;x<=10;x++)
                                {
                                    mt = m * x;
                                    System.out.println("::        "+ x + " * " + m + " = " + mt );
                                }
                                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                                break;
                            }
                            case '4' :
                            {
                                exit2 = false;
                                 break;
                                }
                                default :
                                {
                                    System.out.println("INVALID INPUT!");
                                }
                            }
                        }
                        else
                        {
                            System.out.println("INVALID INPUT!");
                        }   
                        System.out.println();
                        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                        System.out.println("To go back to Iteration Choices (Y): "); 
                        System.out.println("To go back to Main menu(N): ");
                        System.out.println("To end the code press any key: "); 
                        System.out.print(":___ ");
                        choice5 = p.next().charAt(0);
                
                        if(choice5 == 'Y' || choice5 == 'y')
                        exit2 = true;
                        else if (choice5 == 'N' || choice5 == 'n')
                        menu();
                        else
                        exit2 = false;
                    }
                    while (exit2 == true);
                }
            }
        }
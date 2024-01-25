package assignments;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
   do{
    System.out.println("Select 1 for #1 " + "\n" + "Select 2 for #2" + "\n" + "Select 3 for #3");

    Scanner sc = new Scanner(System.in);

    int choice;

    choice = sc.nextInt();

    switch (choice) {
      case 1:
        ass_1();
        break;

      case 2:
        ass_2();
        break;

      case 3:
        ass_3();
        break;
    }
    
    
    sc.close();
    
    }while(true);
  }

  public static void ass_1() {

    for (int i = 3; i != 0; i--) {

      for (int j = 1; j <= i; j++) {

        System.out.print(j);
      }

      System.out.println();
    }
  }

  public static void ass_2() {

    for (int i = 1; i <= 3; i++) {
      for (int j = 3; j >= i; j--) {
        
        if (i == 3) {

          j = 1;
        }
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void ass_3() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter S count :");

    int rows;

    rows = sc.nextInt();

    System.out.println("Enter Count : ");
    int num;

    num = sc.nextInt();

    for (int i = rows; i >= 0; i--) {

      for (int j = i - 1; j >= 0; j--) {

        System.out.print(num);
        num++;

        if (num > 9) {

          num = 1;
        }
      }

      System.out.println();
    }
    
    sc.close();
  }
  
}
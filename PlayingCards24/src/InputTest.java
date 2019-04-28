// guys simple input operator console only I wrote earlier. We can use this with the project needs tweaking. 


import java.util.Scanner;

public class InputTest
{
    public static void main(String args[])
    {
    	// variables
       int card1, card2,card3,card4, result;
       char ch;
       Scanner scan = new Scanner(System.in);
	   
       // ask for input and have the scanner gather
       System.out.print("Enter First Card Number : ");
       card1 = scan.nextInt();
       System.out.print("Enter Second Card Number : ");
       card2 = scan.nextInt();
       System.out.print("Enter Third Card Number : ");
       card3 = scan.nextInt();
       System.out.print("Enter Fourth Card Number : ");
       card4 = scan.nextInt();
       System.out.print("Enter Operator (+, -, *, /) : ");
       ch = scan.next().charAt(0);
	   
       // handle mathematical operators
       if(ch == '+')
       {
            result = card1 + card2 + card3 + card4;
            System.out.println("Result = " +result);
       }
       else if(ch == '-')
       {
            result = card1 - card2 -card3 - card4;
            System.out.println("Result = " +result);
       }
       else if(ch == '*')
       {
            result = card1 * card2 * card3 *card4;
            System.out.println("Result = " +result);
       }
       else if(ch == '/')
       {
            result = card1 / card2 / card3 / card4;
            System.out.println("Result = " +result);         
    	   
       }
       else
       {
            System.out.println("Wrong Operator !!!");
       }
            
    }
}
import java.util.Scanner;

public class Calculator {

private static Scanner scanner;

public static void main(String[] args) {
while (true)
{
scanner = new Scanner(System.in);
System.out.println("Select from the following choices-");
System.out.println("1 for Addition");
System.out.println("2 for Subtraction");
System.out.println("3 for Multiplication");
System.out.println("4 for Division");
System.out.println("5 for Power");
System.out.println("6 for Modulo");
System.out.println("0 for EXIT");
System.out.println("10 for Continue\n");
System.out.println("Enter your choice:");
int choice = scanner.nextInt();

if (choice >= 1 && choice <= 6) {
System.out.println("Enter the first number:");
double operand1 = scanner.nextInt();
System.out.println("Enter the second number:");
double operand2 = scanner.nextInt();
double output = 0;

switch (choice) {    
case 1:
output = operand1 + operand2;
break;

case 2:
output = operand1 - operand2;
break;

case 3:
output = operand1 * operand2;
break;

case 4:
output = operand1 / operand2;
break;

case 5:
output = Math.pow(operand1, operand2);
break;

case 6:
output = operand1 % operand2;
break;

}

System.out.println("Output result=" + output);
} else {
if (choice == 0) {
System.out.println("EXIT");
System.exit(0);
} else { if (choice == 10) {
   continue;
   
} else
System.out.println("You have entered wrong choice");
}
}
}
}
}

import java.util.Scanner;

public class project {

    public static void main(String[] args) {

        Scanner DI = new Scanner(System.in);

        int vari, num1 = 0, num2 = 0;

        do {
            System.out.println("<------ Welcome to Rajendra Chimala Calculator ----->");

            System.out.println("<============= Select any Operation =============>\n");
            System.out.println(" [1] Addition\n");
            System.out.println(" [2] Subtraction\n");
            System.out.println(" [3] Multiplication\n");
            System.out.println(" [4] Division\n");
            System.out.println(" [5] Addition\n");
            System.out.println(" [0] Exit\n");

            vari = Integer.parseInt(DI.nextLine());

            if (vari != 0) {
                System.out.println("Enter first number : \n");
                num1 = Integer.valueOf(DI.nextLine());
                System.out.println("Enter second number : \n");
                num2 = Integer.valueOf(DI.nextLine());

            }
            switch (vari) {

                case 0:
                    return;

                case 1:

                    System.out.println("The SUM is :  " + (num1 + num2));

                    break;

                case 2:
                    System.out.println("The SUB is :  " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("The MUL is :  " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("The DIV is :  " + (num1 / num2));

                    break;

                default:
                    System.out.println("Wromg Input !");
                    break;

            }
        } while (vari != 0);

    }

}

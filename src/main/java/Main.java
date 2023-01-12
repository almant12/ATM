import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     AtmService atmService = new AtmService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = scanner.nextLine();
        System.out.println("Enter the Password");
        String password = scanner.nextLine();

        if (atmService.verification(name, password) == true){
            System.out.println("Wellcome to Atm");
            while (true) {
                System.out.println("Choose one option \n" +
                        "1: DEPOSITE\n" +
                        "2: DRAW\n" +
                        "3: BALANCE\n" +
                        "4: EXIT");
                int ch = scanner.nextInt();
                if (ch == 1) {
                    System.out.println("Deposite your money");
                    int deposite = scanner.nextInt();
                    atmService.deposite(deposite);
                } else if (ch == 2) {
                    System.out.println("Draw your money");
                    int draw = scanner.nextInt();
                    atmService.withDraw(draw);
                } else if (ch == 3) {
                    System.out.println("balance of amount is "+atmService.balance());
                } else if (ch == 4) {
                    System.out.println("THANK YOU FOR SUPPORTING US \nGOODBYE");
                    System.exit(0);
                } else {
                    System.out.println("Choose the right option");
                }
            }
        }else{
                System.out.println("the name or password are incorrect");
        }
    }
}

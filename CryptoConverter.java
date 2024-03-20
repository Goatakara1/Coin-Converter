import java.util.Scanner;

public class CryptoConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to crypto converter.");
        System.out.println("Please select a number to convert:");

        System.out.println("Bitcoin,  1");
        System.out.println("Ethereum, 2");
        System.out.println("Solana,   3");
        System.out.println("BNB,      4");
        System.out.println("XRP,      5");
        System.out.println("Avalanche,6");
        
        int coin = scanner.nextInt();
        
        System.out.println("How much dollars do you have?");
        double dollar = scanner.nextDouble();
        
        double result = 0;

        switch (coin) {
            case 1:
                result = 64324.81 / dollar;
                break;

            case 2:
                result = 3301.17 / dollar;
                break;

            case 3:
                result = 181.96 / dollar;
                break;

            case 4:
                result = 530.33 / dollar;
                break;

            case 5:
                result = 0.6057 / dollar;
                break;

            case 6:
                result = 59.19 / dollar;
                break;

            default:
                System.out.println("Please enter a valid option.");
                return;
        }

        System.out.println("You have " + result + " of selected cryptocurrency.");
    }
}


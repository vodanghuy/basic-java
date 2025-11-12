import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        double weight;
        String tryAgain = "yes";
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert kgs to lbs");
        System.out.println("2: Convert lbs to kgs");
        do{
            System.out.print("Choose an option: ");
            // Stop user enter a letter
            while (!scanner.hasNextInt())
            {
                System.out.println("Invalid choice! Try again!");
                System.out.print("Choose an option: ");
                scanner.next();
            }
            option = scanner.nextInt();

            switch (option){
                case 1 -> {
                    System.out.print("Enter the weight in kgs: ");
                    weight = scanner.nextDouble();
                    weight *= 2.20462;
                    System.out.printf("The new weight in lbs is: %.2f\n", weight);
                }
                case 2 -> {
                    System.out.print("Enter the weight in lbs: ");
                    weight = scanner.nextDouble();
                    weight /= 2.20462;
                    System.out.printf("The new weight in kgs is: %.2f\n", weight);
                }
                default -> {
                    System.out.println("Invalid choice! Try again");
                    continue;
                }
            }
            scanner.nextLine();
            do {
                System.out.print("Try again? (YES/NO): ");
                tryAgain = scanner.nextLine();
                if(!tryAgain.equalsIgnoreCase("yes") && !tryAgain.equalsIgnoreCase("no"))
                {
                    System.out.println("Invalid choice! Try again!");
                }
            }while (!tryAgain.equalsIgnoreCase("yes") && !tryAgain.equalsIgnoreCase("no"));
        }while (tryAgain.equalsIgnoreCase("yes"));
        System.out.println("SEE YOU NEXT TIME!");
        scanner.close();
    }
}
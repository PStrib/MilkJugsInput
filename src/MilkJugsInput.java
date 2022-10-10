import java.util.Scanner;

public class MilkJugsInput {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter the capacity of your milk jugs (Numbers only, no litre symbol)");
        double capacity=scan.nextDouble();

        System.out.println("Enter how much milk you have (Numbers only, no litre symbol)");
        double totalMilk=scan.nextDouble();

        int filledJugs= (int) (totalMilk/capacity);

        System.out.println("You can completely fill "+filledJugs+" jug(s) with the milk you have.");
    }
}
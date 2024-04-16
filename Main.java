import java.util.Scanner;

public class Main {
    private String input;
    private int numberOfLoops;

    public void setInput(String input) {
        this.input = input;
    }

    public boolean isChoiceYes() {
        return input.equalsIgnoreCase("y");
    }

    public void setNumberOfLoops(int numberOfLoops) {
        this.numberOfLoops = numberOfLoops;
    }

    public String runProgram() {
        if (isChoiceYes()) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < numberOfLoops; i++) {
                result.append("Lap lap thu ").append(i + 1).append("\n");
            }
            return result.toString();
        } else {
            return "End.\n";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lệnh rẽ nhánh
        System.out.println("Ban muon chay vong lap? (y/n)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("y")) {
            // Vòng lặp
            System.out.println("Nhap so lan lap:");
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Lap lap thu " + (i + 1));
            }
        } else {
            System.out.println("End.");
        }

        scanner.close();
    }
}

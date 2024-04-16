import java.util.Scanner;

public class Main {
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

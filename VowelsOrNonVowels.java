import java.util.Scanner;

public class VowelsOrNonVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        

        System.out.println("Select an option:");
        System.out.println("1. Extract vowels");
        System.out.println("2. Extract non-vowels");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.println("Select an option for case:");
        System.out.println("1. Uppercase");
        System.out.println("2. Lowercase");
        System.out.print("Enter your choice: ");
        int caseChoice = scanner.nextInt();
		scanner.close();
		
        String output = "";
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (choice == 1) {
                if (vowels.indexOf(ch) != -1) {
                    if (caseChoice == 1) {
                        output += Character.toUpperCase(ch);
                    } else {
                        output += Character.toLowerCase(ch);
                    }
                }
            } else {
                if (vowels.indexOf(ch) == -1) {
                    if (caseChoice == 1) {
                        output += Character.toUpperCase(ch);
                    } else {
                        output += Character.toLowerCase(ch);
                    }
                }
            }
        }

        System.out.println("Output: " + output);
    }
}
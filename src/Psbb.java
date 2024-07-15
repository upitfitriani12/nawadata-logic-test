import java.util.Scanner;

public class Psbb {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of families : ");
        int numberOfFamilies = Integer.parseInt(scanner.nextLine());
        System.out.print("Input the number of members in the family (separated by a space) : ");
        String[] memberInput = scanner.nextLine().split(" ");
        if (memberInput.length != numberOfFamilies) {
            System.out.println("Input must be equal with count of family");
            scanner.close();
            return;
        }

        int[] familyMembers = new int[memberInput.length];
        for (int i = 0; i < memberInput.length; i++) {
            familyMembers[i] = Integer.parseInt(memberInput[i]);
        }
        int totalMembers = 0;
        for (int members : familyMembers) {
            totalMembers += members;
        }
        int minBus = (int) Math.ceil((double) totalMembers / 4);

        System.out.println("Minimum bus required is : " + minBus);
        scanner.close();
    }
}

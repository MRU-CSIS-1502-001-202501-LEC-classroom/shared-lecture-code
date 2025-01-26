import java.util.ArrayList;
import java.util.Scanner;

public class Grid {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> grid = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            System.out.print("Enter 3 nums: ");
            String numsAsText = kbd.nextLine();
            Scanner numScanner = new Scanner(numsAsText);

            int numOne = numScanner.nextInt();
            row.add(numOne);

            int numTwo = numScanner.nextInt();
            row.add(numTwo);

            int numThree = numScanner.nextInt();
            row.add(numThree);

            grid.add(row);

        }

        System.out.println(grid);


        int sum = 0;
        for (ArrayList<Integer> row : grid) {
            for (int num : row) {
                sum += num;
            }
        }

        System.out.println("Sum is: " + sum);
    }

}
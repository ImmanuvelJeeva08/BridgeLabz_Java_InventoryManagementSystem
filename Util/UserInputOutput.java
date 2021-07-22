/******************************************************************************************************************
 *
 * Get Input from the user and Perform Operation based on the Input
 *
 * @author : Immanuvel Jeeva
 * @Since  : 22-07-2021
 *
 *****************************************************************************************************************/
package Util;

import java.util.Scanner;

public class UserInputOutput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getUserChoice() {

        System.out.println("Enter option");
        System.out.println("Enter 1 to Add Inventory :");
        System.out.println("Enter 2 to Edit Inventory :");
        System.out.println("Enter 3 to Delete Inventory :");
        System.out.println("Enter 4 to Display Inventory :");
        System.out.println("Enter 5 to Calculate Total Weight :");
        System.out.println("Enter 6 to Calculate Total Price :");
        System.out.println("Enter 7 to Quit :" + "\n");

        return scanner.nextInt();
    }
}

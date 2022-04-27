/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputvalidation;

/**
 *
 * @author 4800590195
 */
import java.util.Scanner;

public class InputValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Checking Input by Kevin Bell \n");
        //variables
        Scanner computerKeyboardInput = new Scanner(System.in);
        long minimumInteger = -1, maximumInteger = -1, middleNumber = -1;
        while (minimumInteger < 0) {
            System.out.print("Please enter the minimum value: ");
            minimumInteger = computerKeyboardInput.nextInt();
        }
        while (maximumInteger < minimumInteger) {
            System.out.print("Please enter the maximum value: ");
            maximumInteger = computerKeyboardInput.nextInt();
        }
        while (maximumInteger > minimumInteger) {
            System.out.print("Please enter a value between " + minimumInteger + " and " + maximumInteger + ": ");
            middleNumber = computerKeyboardInput.nextInt();
            while (middleNumber > maximumInteger || middleNumber < minimumInteger) {
                System.out.print("Please enter a value between " + minimumInteger + " and " + maximumInteger + ": ");
                middleNumber = computerKeyboardInput.nextInt();
            }
            while (middleNumber < maximumInteger && middleNumber > minimumInteger) {
                System.out.println("Thank you for your input");
                break;
            }
            break;
        }
        System.out.println("Minimum: " + minimumInteger);
        System.out.println("Middle: " + middleNumber);
        System.out.println("Maximim: " + maximumInteger);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivefactorial;

/**
 *
 * @author A. Mjeks
 */
public class RecursiveFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int recursion = recurseFactorial(5);
        System.out.println("Recursive Result: " + recursion);
        
        int iterative = iterativeFactorial(5);
        System.out.println("Iterative Result: " + iterative);
    }

    public static int recurseFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
            
        } else{
            return number * recurseFactorial(number - 1);
        }
    }

    public static int iterativeFactorial(int number) {
        int result = 1;
        while (number > 1) {
            result *= number;
            number -= 1;
        }
        return result;
    }

}

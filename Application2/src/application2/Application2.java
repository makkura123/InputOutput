/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application2;
import java.util.Scanner;

/**
 *
 * @author Neele
 */
public class Application2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "Pete";
        System.out.printf("Hello %s what is your score? ", name);
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        System.out.printf("Your score is %d\n ", score);
    }
    
}

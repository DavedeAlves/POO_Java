/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioconstrutores;

import Entities.Account;
import java.util.Scanner;

/**
 *
 * @author Davede faiska
 */
public class ExercicioConstrutores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Account ac;
        
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char des = sc.next().charAt(0);
        
        if(des == 'y'){
            System.out.print("Enter initial deposit value: ");
            double depositInitial = sc.nextDouble();
            ac = new Account(number, name, depositInitial);
        } else{
            ac = new Account(number, name);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(ac);
        
        System.out.println();
        System.out.print("Enter a deposit value: ");
        ac.deposit(sc.nextDouble());
        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(ac);
        
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        ac.withdraw(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(ac);
        
        sc.close();
    }
    
}

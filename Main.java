/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal.pkg2;

/**
 *
 * @author Praktikum
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        a = scan.next();
        
        int input; 
        input = Integer.parseInt(a);
        
        BelahKetupat bk = new BelahKetupat();
        bk.setInput(input);
        
        bk.Display();
        
    }
    
}

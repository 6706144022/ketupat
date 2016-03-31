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
public class BelahKetupat {
    private int input;
    
    public BelahKetupat() {}
    
    public void setInput(int input){
        this.input = input;
    }
    
    public int getInput(){
        return input;
    }
    
    public void Display(){
        for(int x = input; x>=1; x--) {
            for(int y=x-1; y>=1; y--){
                System.out.print("0");
            }
            for(int z=1; z<=((input+1)-x)*2; z++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=input; i>=1; i--) {
            for(int k=1; k<=input-i; k++){
                System.out.print("0");
            }
            for(int j=i*2; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

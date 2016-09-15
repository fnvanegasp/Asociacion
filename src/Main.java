/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Wheel ld1=new Wheel(10, "Mic");
        Wheel ld2=new Wheel(10, "Mic");
        Wheel lt1=new Wheel(10, "Mic");
        Wheel lt2=new Wheel(10, "Mic");
        
        Wheel[] front = {ld1,ld2};
        Wheel[] rear = {lt1,lt2};
        
        Car carro = new Car("Ferrari", front, rear);
        
        System.out.println(carro);
    }
    
}

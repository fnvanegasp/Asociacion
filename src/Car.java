/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Car {
    private String marca;
    
    Wheel[] front;
    Wheel[] rear;
    Engine m;
    
    public Car(String marca, Wheel[] front, Wheel[] rear) {
        this.marca = marca;
        this.front = front;
        this.rear = rear;
        
        this.m = new Engine();
        
        this.m.setAxle(rear);
        for(int i = 0; i < this.rear.length; i++){
            this.rear[i].setAxle(m);
        }
    }

    @Override
    public String toString() {
        return "Car{" + "marca=" + marca + ", front=" + front + ", rear=" + rear + ", m=" + m + '}';
    }
    


}

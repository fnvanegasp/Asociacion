/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Wheel {
    private float diametro;
    private String marca;
    Engine axle = null;

    public Wheel(float diametro, String marca) {
        this.diametro = diametro;
        this.marca = marca;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAxle(Engine axle) {
        this.axle = axle;
    }

    @Override
    public String toString() {
        return "Wheel{" + "diametro=" + diametro + ", marca=" + marca + ", axle=" + axle + '}';
    }
    
    
}

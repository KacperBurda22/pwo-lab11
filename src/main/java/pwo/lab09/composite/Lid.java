/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.composite;

/**
 *
 * @author kacpe
 */
public class Lid extends WaterSystem {
    private boolean closed = true;

    public void fill() {
        super.fill();
        System.out.println("Zamykam pokrywę");
    }

    public void afterFill() {
        super.afterFill();
        closed = true;
    }

    public void drain() {
        super.drain();
        System.out.println("Otwieram pokrywę");
    }

    public void afterDrain() {
        super.afterDrain();
        closed = false;
    }
}

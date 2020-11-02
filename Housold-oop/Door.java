/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package household;


public class Door {
    private double doorPrice;
    private double doorSize;
    private Brand brand;

    public double getDoorPrice() {
        return doorPrice;
    }

    public void setDoorPrice(double doorPrice) {
        this.doorPrice = doorPrice;
    }

    public double getDoorSize() {
        return doorSize;
    }

    public void setDoorSize(double doorSize) {
        this.doorSize = doorSize;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    
}

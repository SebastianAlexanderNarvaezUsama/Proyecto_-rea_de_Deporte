/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymarket;

/**
 *
 * @author Asus
 */
public class Product {
    String Productname;
    int Code, Quantity;
    float Price;

    public Product(String Productname, int Code, int Quantity, float Price) {
        this.Productname = Productname;
        this.Code = Code;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public String getProductname() {
        return Productname;
    }

    public void setProductname(String Productname) {
        this.Productname = Productname;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

}
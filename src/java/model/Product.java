/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author user
 */
public class Product {
    
    private double price;
    private String taxType;
    private double taxValue;
    private double grossAfterTax;
    
    public Product(double price,String taxType){
        this.price = price;
        this.taxType = taxType;
        this.taxValue = 0;
        this.grossAfterTax = 0;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getTaxType(){
        return taxType;
    }
    
    public void calculateTaxValue(){
        if(taxType.equals("sales")){taxValue = 0.04;}
        else if(taxType.equals("good")){taxValue = 0.06;}
        else if(taxType.equals("services")){taxValue = 0.03;} 
    }
    
    public double getTaxValue(){
        calculateTaxValue();
        return taxValue;
    }
  
    public void calculateGrossAfterTax(){
        calculateTaxValue();
        this.grossAfterTax=price*taxValue + price;
    }
    
    public double getGrossAfterTax(){
        calculateGrossAfterTax();
        return grossAfterTax;
    }
}

/*
Classe produto referente ao Program1.java
*/

//package Vetores;

public class Produto{

    private String name;
    private double price;

    //construtor com os argumentos
    public Produto(String name, double price){
	this.name = name;
	this.price = price;
    }

    //getters e setters
    public String getName() {
	return name;
    }
    public void setName() {
	this.name = name;
    }

    public double getPrice() {
	return price;
    }
    public void setPrice(){
	this.price = price;
    }

}

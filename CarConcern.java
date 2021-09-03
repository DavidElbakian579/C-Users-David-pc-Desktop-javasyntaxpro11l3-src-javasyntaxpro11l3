/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro11l3;

/**
 *
 * @author David-pc
 */
public class CarConcern {
    /*
    Жажда скорости
    Почувствуй себя автоконструктором и найди решение, как сделать так, чтобы завод снова заработал. 
    Для этого тебе нужно добавить инициализацию полей в конструкторах соответствующими параметрами. 
    Если параметр отсутствует, то нужно инициализировать поле значением по умолчанию. 
    Для поля year это текущий год (4321), для поля color — Оранжевый.
    */
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this.color = "Оранжевый";
        this.model = model;
        this.year = year;
    }

    public CarConcern(String model) {
        this.year = 4321;
        this.color = "Оранжевый";
        this.model = model;
    }
}

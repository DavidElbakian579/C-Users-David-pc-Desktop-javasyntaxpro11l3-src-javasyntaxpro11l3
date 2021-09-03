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
public class Building {
    /*
    Многосерийный предприниматель
    Постройка здания планировалась под ресторан и успешно завершилась, но спустя некоторое время собственники решили переделать его под барбершоп. 
    Нам нужно сделать так, что бы здание было универсальным, и его назначение можно было менять, не создавая нового.
    Для этого создай метод initialize, который будет устанавливать значение полю type (определять тип здания), а конструктор убери.
    */
    private String type;
    public void initialize(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}

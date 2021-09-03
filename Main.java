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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Кто тут наследник?
        Эта задача нужна для понимания того, как вызывается конструктор базового класса (родителя).
        У тебя есть классы ElectricCar, GasCar, HybridCar, которые наследуют класс Car.
        Тебе нужно в конструкторах наследников класса Car передать тип автомобиля в конструктор базового класса (родителя), 
        используя super("тип автомобиля"). Для этого в классе Solution в методе main создай 3 объекта: HybridCar, GasCar и ElectricCar.

        Вывод должен быть следующий (последовательность может быть любая):
        Привет. Я ElectricCar
        Привет. Я GasCar
        Привет. Я HybridCar
        */
        HybridCar hybridCar = new HybridCar();
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author User
 */
public class Start {

    public static void main(String[] args) {

        DefenceObservable observable = new DefenceObservable();
        MainForm mainForm = new MainForm(observable);
        observable.addObserver(new Helicopter(mainForm));
        observable.addObserver(new Submarine(mainForm));
        observable.addObserver(new Tank(mainForm));

    }
}

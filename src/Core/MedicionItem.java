/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Jonathan Rodriguez, Juan Vallejos
 */
public abstract class MedicionItem extends Observable implements Observer {

    public ArrayList<Observer> observers = new ArrayList<Observer>();

    public MedicionItem() {

    }

    @Override
    public abstract void update(Observable o, Object arg);

    public abstract void addObservable(Observer observer);

    public abstract void notifyObservers();

}

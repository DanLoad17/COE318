/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

import java.util.ArrayList; //import by java debug to make it viable

/**
 *
 * @author zelen
 */
public class Circuit {
    ArrayList<Resistor>ress = new ArrayList<Resistor>(); //cretae array list
    private static Circuit instance = null;
 
    
    public static Circuit getInstance(){
        if(instance == null) //done according to manual - creates new circuit from the get-go
            instance = new Circuit();
        return instance;
    }
    

    void add(Resistor r){
        ress.add(r); // adds r value to ress (array) (the resistance)
    }
 
    private Circuit(){}  //in lab manual     

    @Override
    public String toString(){
        String summ ="";
        for(int i = 0; ress.size() > i; i++){ //while in possible parameters (size of array)
            summ += ress.get(i) + "\n"; //string together summ, which is resistance with the "" string.
        }
        return summ;
    }
}

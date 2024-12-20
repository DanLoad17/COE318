/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author zelen
 */
import java.util.ArrayList;

public class AnalogCircuit {

private ArrayList<Object> circuit = new ArrayList<Object>();
private static String arrayStr;
private static AnalogCircuit instance = null;
public static String voltStr;

public static AnalogCircuit getInstance() { //Create new Circuit if none exist
if (instance == null) {
instance = new AnalogCircuit();
}
return instance;
}

public void add( Resistor r) { //Add resistor to array
circuit.add(r);
}

public void addVoltage (Voltage v) { //Add voltage source to array
circuit.add(v);
}

private AnalogCircuit(){
}

@Override
public String toString(){
arrayStr= "";
int i =0;
while(i < circuit.size()) //strings together while there is a circuit to string
{
arrayStr = arrayStr + (circuit.get(i).toString() + "\n");
i = i+1;
}
return (arrayStr);
}

  
}

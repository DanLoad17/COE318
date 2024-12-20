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
public class Voltage {

private double volts;
private int n1, n2;
private static int x = 1;
private int id;


public Voltage(int node1, int node2, double voltage) {

    id = x;
    x = x+1;
    n1 = node1;
    n2 = node2;
    this.volts = voltage;
}

public int[] getNodes() {
int nodes[] = new int[2]; //set the node array position variables
nodes[0] = n1;
nodes[1] = n2;
return nodes;
}

@Override
public String toString() { //strings the voltage display output (in the specified format)
String voltVal;
voltVal = "V";
voltVal = voltVal + id + " " + n1 + " " + n2 + " " + "DC" + " " + volts;
return voltVal;
}
}


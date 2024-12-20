/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author zelen
 */
public class Resistor {

private double resist;
private int node1, node2;
private static int x = 1;
private int id;



public Resistor(int n1, int n2, double resistance ) {
this.resist = resistance;
id = x;
x++;
node1 = n1;
node2 = n2;
}

public int[] getNodes() {
int nodes[] = new int[2];
nodes[0] = node1;
nodes[1] = node2;
return nodes;
}


@Override
public String toString() {
String result;
result = "R";
result = result + id + " " + node1 + " " + node2 + " " + resist;
return result;
}
}

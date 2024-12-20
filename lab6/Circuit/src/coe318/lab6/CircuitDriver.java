/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6; //All copied from the lab document given

public class CircuitDriver
{
   public static void main(String s[])
   {
       Node nodes[] = new Node[10];
       for(int c = 0; c < nodes.length; c++)
           nodes[c] = new Node();
       Resistor r1 = new Resistor(10, nodes[0], nodes[4]);
       Resistor r2 = new Resistor(20, nodes[7], nodes[3]);
       Resistor r3 = new Resistor(-15, nodes[5], nodes[1]);
       System.out.println("\n Resistor Information ");
       System.out.println(r1);
       System.out.println(r2);
       Circuit cir = Circuit.getInstance();    
       cir.add(r1);
       cir.add(r2);
       System.out.println("\n Circuit Information ");
       System.out.println(cir);
   }
}



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
import java.util.Scanner;

public class UserMain {
    private static int v1, v2;
    private static double value;

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        AnalogCircuit ana = AnalogCircuit.getInstance();
        String scan = "";
        System.out.println("You may begin entering values: \n");
        while (input != null){ //while there is an input, this runs
            scan = input.nextLine();   
            String circar [] = scan.split(" "); //what splits values
            if (circar.length > 4){ //more than 4 values inputted, this is an illegal ergument
                scan = "";
                throw new IllegalArgumentException("Invalid. Enter 'v' or 'r' followed by  2 nodes and value \n"); //illegal arg. exception
            }
            if (scan.equals("spice") || scan.equals("Spice")){
                System.out.println("\n");
                System.out.println(ana.toString()); //if "spice" is entered, prints out our circuit components and values
            }
            if (scan.startsWith("r") || scan.startsWith("R")) {
                v1 = Integer.parseInt(circar[1]);
                v2 = Integer.parseInt(circar[2]);
                value = Double.parseDouble(circar[3]);
                Resistor re = new Resistor(v1, v2, value);
                ana.add(re); //takes values and adds them to AnalogCircuit
            }
                
            if (scan.startsWith("v") || scan.startsWith("V")) {
                v1 = Integer.parseInt(circar[1]);
                v2 = Integer.parseInt(circar[2]);
                value = Double.parseDouble(circar[3]);
                Voltage vo = new Voltage (v1, v2, value);
                ana.addVoltage(vo); //takes values and adds them to AnalogCircuit
            }

            if (scan.equals("end") || scan.equals("End")) //end is inputed, ends the running of file
                break;
            }
            System.out.println("Done");
}
}

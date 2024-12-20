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
    int resNum;
    double resVal;
    static int count;
    Node[] nodesSum = new Node[2];
    
    
    public Resistor(double resistance, Node node1, Node node2){
       resNum = ++count; // increase count by 1 and make that the res #
       try{ //requested by debugging
       if(resistance < 0)//Problem with range of R. 
           throw new IllegalArgumentException();
       else // No problem, assign resistance value
          this.resVal = resistance; 
       }
       
       catch(IllegalArgumentException iRes){ //When R < 0, print the problem
           System.out.print("Negative resistance is not allowed");
               }
        nodesSum[0] = node1;
        nodesSum[1] = node2; //set values
    }
    public Node[] getNodes(){
        return nodesSum;
    }

    @Override
    public String toString(){ //done according to order required in lab manual
        return("R" + resNum + " " + nodesSum[0] + " " + nodesSum[1] + " " + resVal);
    }
}

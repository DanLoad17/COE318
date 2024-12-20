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
public class Node {
    static int nextNode; //can be used independently
    int numNode;
    
    Node(){
    numNode = nextNode++; // make nextnode value the numnode value, then increase nextnode by 1
    }
    

    @Override
    public String toString(){
        return numNode + "";
    }
}

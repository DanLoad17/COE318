/**
 *
 * @author Your Name
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    int mod;
    int counting = 0;       //Variable Initialization
    Counter leftCount;
    
    public Counter(int modulus, Counter left) {
        this.mod = modulus;
        this.leftCount = left;
        
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return mod;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        if (leftCount == null){
            return null;
        }
        else{
            return leftCount;
        }
        
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return this.counting;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.counting = digit;
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        setDigit(getDigit() + 1);   //Increase digit value by 1 
        
        if (this.counting == this.getModulus()){
            setDigit(0);    //If digit has same value as modulus, 
                            //revert it back to 0
        
            if (this.getLeft() != null)
                this.getLeft().increment();
        }   //Above if sees if there is a left value, if there is, increment 
            // that value as needed - resets to 0 when max value reached.
    }
    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        int soln = getDigit();
        if (this.leftCount == null){// As long as there is no left value, it 
            return this.counting;   // will return that value
        }
        else {  //If there is leftCount value, it uses lab manual formula
                //in order to get the solution (resursive formula of c)
            soln = soln + getModulus() * this.getLeft().getCount();
            return soln;
        }
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}

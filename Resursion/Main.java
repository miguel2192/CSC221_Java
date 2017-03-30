/*
 * Luke Cavanaugh, Miguel Rodriguez
 * Professor Schlegel
 * This program computes the tower of a number
 * as well as prints the Nth number in the "3-fib" sequence.
 */

public class Main {

    /**
     * This method will compute the power tower of a number. 
     * It takes the base, exponent, and tower as parameters
     * Double is used as opposed to Int because of exponent risk.
     * For code compaction for this assignment we will only be accepting
     * positive doubles greater or equal to "1". 
     */
    
    public static double tower(double base, double pow, double height){
        if (height < 1)
            return 1;
        else 
            /*This raises the power to the height and then whatever the result is 
            * we raise it to the base and we add the recusirve call. */
            return Math.pow(base , Math.pow(pow, height)) + tower(base, pow, height-1);
    }
     /**
     * This method will compute the Nth number in the "3-fib" sequence. 
     * It takes the number, n, as a parameter. 
      * For code compaction for this assignment we will only be accepting
     * positive ints greater or equal to "1". 
     */
    
    public static int threeFib(int n){
        if(n==1 || n==2 || n==3){
            return 1;
        } 
        else {
        
            /*Cascading fibonacci  algorithm */
            return threeFib(n-1)+threeFib(n-2)+threeFib(n-3);        
        }
}
    
    
    public static void main(String[] args) {
        
        //run tower and print results
        System.out.println(tower(2,4,3));
        //run threeFib and print results
        System.out.println(threeFib(6));
    }
    
}



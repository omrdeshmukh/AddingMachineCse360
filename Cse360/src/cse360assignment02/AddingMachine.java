package cse360assignment02;
/*Assignment-1
* */

/*This is the adding machine class*/
public class AddingMachine {
    private int total;
    private String history;

    /*This is the constructor function for Adding machine*/
    public AddingMachine ()
    {
        history = "0";
        total = 0;  // not needed - included for clarity
    }

    /*This function returns the total value*/
    public int getTotal ()
    {
        return total;
    }

    /*This function adds a value to the total*/
    public void add (int value)
    {
        history = history + "+" + value;
        total = value + total;
    }

    /*This function subtracts a value from the total*/
    public void subtract (int value)
    {
        history = history + "-" + value;
        total = total - value;
    }

    /*This function returns the history of transactions*/
    public String toString () {
        return history;
    }

    /*This function resets the values of total and history*/
    public void clear() {
        total = 0;
        history = "0";
    }
}

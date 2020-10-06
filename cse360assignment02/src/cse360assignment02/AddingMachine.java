package cse360assignment02;
/**
 * Stephen Bailey, CSE 360, Assignment 1
 * AddingMachine.java
 * GitHub repository: https://github.com/Pumperknuckle/cse-360-Assignment-1
 * 
 * The AddingMachine program allows for adding or subtracting based on input
 *
 * @author 		Stephen Bailey
 * @version		1.1
 * @since		2020-10-5
 */
public class AddingMachine {
  private int total;
  private String history = "0";
  /**
   * The constructor AddingMachine initializes total variable
   *
   * @param  		none
   * @return      	none
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  /**
   * The method getTotal gets current total 
   *
   * @return      	int total
   */
  public int getTotal () {
    return total;
  }
  /**
   * The method add adds passed value to total
   *
   * @param			int value
   * @return      	int total
   */
  public void add (int value) {
	  total += value;
	  history += " + " + value;
  }
  /**
   * The method subtract subtracts passed value to total
   *
   * @param			int value
   * @return      	int total
   */
  public void subtract (int value) {
	  total -= value;
	  history += " - " + value;
  }
  /**
   * The method toString prints the history of changes
   *
   * @return      	String string
   */
  public String toString () {
	  System.out.print(history);
    return "";
  }
  /**
   * The method removes history and resets total to 0
   *
   */
  public void clear() {
	  total = 0;
	  history = "0";
  }
}
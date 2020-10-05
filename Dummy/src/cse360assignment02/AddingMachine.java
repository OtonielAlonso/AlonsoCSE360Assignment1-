/**
 * This class implements an adding machine,
 * @author otonielalonso
 * @version 1.1
 */





package cse360assignment02;



public class AddingMachine {
	/**
	 * Create a private total to keep track of total
	 * StringBuffer list will be used for our toString
	 */
  private int total;
  StringBuffer list; 
  
  /**
   * 
   * @param total the total value to be manipulated and returned in functions
   */
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    list = new StringBuffer("0");
  }
  /**
   * This returns this total value
   * @return this current total value
   */
  public int getTotal () {
	  
    return total;
  }
  
  /**
   * This will add the int value passed through it
   * @param total plus this value
   * We then add this value to our history list
   */
  public void add (int value) {
	  
	  total = total + value; 
	  list.append(" + " + value);
	   
	  
	  
  }
  /**
   * This will subtract the int value passed through it
   * @param total subtracted by value
   * We then add this value to our list
   */
  public void subtract (int value) {
	  
	  total = total - value;
	  list.append(" - " + value);
  }
  /**
   * This will create a toString
   * @return toString created
   */
  public String toString () {
    return list.toString();
  }

  /**
   * This will delete the 'history' of our list
   * It will begin at 1 since we want to always initialize the history at 0
   * We then reset the total value back to 0 to start over
   */
  public void clear() {
	  
	  list.delete(1, list.length());
	  total = 0; 
	  
	  
	  
  }
}
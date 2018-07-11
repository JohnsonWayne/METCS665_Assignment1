package edu.bu.met.cs665.assignment1;

import java.time.LocalDate;

/**
 * This Class represents a Beverage.
 * 
 * @author Wayne
 *
 */
public class Beverage {
	
	/**
	 * 
	 * A Beverage with empty attributes.
	 * 
	 */

	public Beverage() {}
	
	
	  /**
	   * Create a Beverage object using drink type, 
	   * 
	   * @param bevType type of beverage as a string
	   * @param sugars number of sugars as an Integer
	   * @param milkAmt quantity of milk as an Integer
	   */
	  public Beverage(String bevType, Integer sugars, Integer milkAmt) {
	    super();
	    this.bevType = bevType;
	    this.sugars = sugars;
	    this.milkAmt = milkAmt;
	  }

	  private String bevType;
	  private Integer sugars;
	  private Integer milkAmt;
	  
	  


	  /*
	   * Getter method for the beverage type.
	   * @return
	   */
	  public String getBevType() {
	    return bevType;
	  }

	  /**
	   * Setter method for beverage type string.
	   * 
	   * @param bevType Type of beverage
	   */
	  public void setBeverage(String bevType) {
	    this.bevType = bevType;
	  }

	  /**
	   * Getter method for number of sugars.
	   * 
	   * @return
	   */
	  public Integer getSugars() {
	    return sugars;
	  }

	  /**
	   * Setter method for the number of sugars.
	   * 
	   * @param sugars number of sugars as an Integer
	   */
	  public void setSugars(Integer sugars) {
	    this.sugars = sugars;
	  }

	  /**
	   * Getter Method for the amount of milk.
	   * 
	   * @return
	   */
	  public Integer getMilkAmt() {
	    return milkAmt;
	  }

	  /**
	   * Setter method for amount of milk.
	   * 
	   * @param milkAmt amount of milk as an Integer
	   */
	  public void setMilkAmt(Integer milkAmt) {
	    this.milkAmt = milkAmt;
	  }
	  
}

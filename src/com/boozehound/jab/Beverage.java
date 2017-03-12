package com.boozehound.jab;

public class Beverage {
	private int id;//surrogate and primary key for database
	private String beverageName;//name of alcoholic drink
	private String ingredient0;//first ingredient
	private String ingredient1;//second ingredient
	private String ingredient2;//third ingredient
	private double measurement0;//measurement of first ingredient
	private double measurement1;//measurement of second ingredient
	private double measurement2;//measurement of third ingredient
	
	/**
	 * default constructor
	 */
	public Beverage(){
	}
	
	/**
	 * 
	 * @param beverageName sets beverage name
	 * @param ingredient0 sets first ingredient
	 * @param measurement0 sets measurement of first ingredient
	 * @param ingredient1 sets second ingredient
	 * @param measurement1 sets measurement of second ingredient
	 * @param id sets id for primary key
	 * Constructor to create a beverage object used for queries with 2 ingredients
	 **/
	public Beverage(String beverageName, String ingredient0, double measurement0, String ingredient1, 
			double measurement1)
	{	
		super();
		this.beverageName = beverageName;
		this.ingredient0 = ingredient0;
		this.measurement0 = measurement0;
		this.ingredient1 = ingredient1;
		this.measurement1 = measurement1;
	}
	
	/**
	 * 
	 * @param beverageName sets beverage name
	 * @param ingredient0 sets first ingredient
	 * @param measurement0 sets measurement of first ingredient
	 * @param ingredient1 sets second ingredient
	 * @param measurement1 sets measurement of second ingredient
	 * @param ingredient2 sets third ingredient
	 * @param measurement2 sets measurement of third ingredient
	 * @param id sets id for primary key
	 * Constructor to create a beverage object used for queries with 3 ingredients 
	 **/
	public Beverage(String beverageName, String ingredient0, double measurement0, String ingredient1, 
			double measurement1, String ingredient2, double measurement2)
	{	
		super();
		this.beverageName = beverageName;
		this.ingredient0 = ingredient0;
		this.measurement0 = measurement0;
		this.ingredient1 = ingredient1;
		this.measurement1 = measurement1;
		this.ingredient2 = ingredient2;
		this.measurement2 = measurement2;
	}

	/**
	 * @return the beverageName
	 */
	public String getBeverageName() {
		return beverageName;
	}

	/**
	 * @return the first ingredient
	 */
	public String getIngredient0() {
		return ingredient0;
	}

	/**
	 * @return the second ingredient
	 */
	public String getIngredient1() {
		return ingredient1;
	}

	/**
	 * @return the third ingredient
	 */
	public String getIngredient2() {
		return ingredient2;
	}

	/**
	 * @return the measurement of first ingredient
	 */
	public double getMeasurement0() {
		return measurement0;
	}

	/**
	 * @return the measurement of the second ingredient
	 */
	public double getMeasurement1() {
		return measurement1;
	}

	/**
	 * @return the measurement of the second agreement
	 */
	public double getMeasurement2() {
		return measurement2;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param beverageName the beverageName to set
	 */
	public void setBeverageName(String beverageName) {
		this.beverageName = beverageName;
	}

	/**
	 * @param ingredient0 the first ingredient to set
	 */
	public void setIngredient0(String ingredient0) {
		this.ingredient0 = ingredient0;
	}

	/**
	 * @param ingredient1 the second ingredient to set
	 */
	public void setIngredient1(String ingredient1) {
		this.ingredient1 = ingredient1;
	}

	/**
	 * @param ingredient2 the third ingredient to set
	 */
	public void setIngredient2(String ingredient2) {
		this.ingredient2 = ingredient2;
	}

	/**
	 * @param measurement0 the measurement of the first ingredient to set
	 */
	public void setMeasurement0(int measurement0) {
		this.measurement0 = measurement0;
	}

	/**
	 * @param measurement1 the measurement of the second ingredient to set
	 */
	public void setMeasurement1(int measurement1) {
		this.measurement1 = measurement1;
	}

	/**
	 * @param measurement2 the measurement of the third ingredient to set
	 */
	public void setMeasurement2(int measurement2) {
		this.measurement2 = measurement2;
	}
	
	/**
	 * @return a string with all pertinent information regarding the beverage
	 */
	public String toString(){
		return beverageName + "(" + id + ") has " + ingredient0 +"(" + measurement0 +"), " + ingredient1 +"(" 
				+ measurement1 +"), and" + ingredient2 +"(" + measurement2 +"), ";
	}
	
}
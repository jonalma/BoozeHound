package com.boozehound.jab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class Bartender extends Activity{
	List<Map<String, String>> cocktailList = new ArrayList<Map<String,String>>();
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bartenderlay);	

		//initialize list
		initList();
		ListView lv = (ListView) findViewById(R.id.listView1);
		
		//The list will initially be sorted alphabetically using comparator
		Comparator<Map<String, String>> mapComparator = new Comparator<Map<String, String>>() {
			public int compare(Map<String, String> m1, Map<String, String> m2) {
				return m1.get("cocktail").compareTo(m2.get("cocktail"));
			}//end compare method
		}; //end comparator
		
		Collections.sort(cocktailList, mapComparator);
				
		//Creates simple adaptor and sets list to simple adaptor
		SimpleAdapter simpleAdpt = new SimpleAdapter(this, cocktailList, android.R.layout.simple_list_item_1, new String[] {"cocktail"}, new int[] {android.R.id.text1});
		lv.setAdapter(simpleAdpt);
		
		//Create Text Box
		final EditText ingredients = (EditText)findViewById(R.id.ingredientsText);
		ingredients.setFocusable(false);
		
		//Create onClickListener for each list item
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id){
				
				//get text 
				String item = ((TextView)view).getText().toString();
				
				double price1 = 0,  price2 = 0, total = 0; 
				double tequilaPr = 15.99, whiskeyPr = 17.99, vodkaPr= 22.99, rumPr = 25.99, ginPr = 18.99;
				DecimalFormat Currency = new DecimalFormat("$0.00");
				
				if(item.equals("Paloma")){
					price1 = tequilaPr; price2 = 2;
					total = price1+price2;
					ingredients.setText("Ingredients: \nTequlia: ~ "+Currency.format(price1)+
										"\nGrape Fruit Soda: ~ "+Currency.format(price2)+
										"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Whiskey Ginger")){
					price1 = whiskeyPr; price2 = 1.25;
					total = price1+price2;
					ingredients.setText("Ingredients: \nWhiskey: ~ "+Currency.format(price1)+
										"\nGinger Ale: ~ "+Currency.format(price2)+
										"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Gimlet")){
					price1 = ginPr; price2 = .99;
					total = price1+price2;
					ingredients.setText("Ingredients: \nGin: ~ "+Currency.format(price1)+
										"\nSweet Lime Juice: ~ "+Currency.format(price2)+
										"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Greyhound")){
					price1 = vodkaPr; price2 = 1.25;
					total = price1+price2;
					ingredients.setText("Ingredients: \nVodka: ~ "+Currency.format(price1)+
							"\nGrapefruit Juice: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Seven & Seven")){
					price1 = whiskeyPr; price2 = 1.49;
					total = price1+price2;
					ingredients.setText("Ingredients\nSeagram's 7 Whiskey: ~ "+Currency.format(price1)+
							"\n7-Up: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Gin & Tonic")){
					price1 = ginPr; price2 = .99;
					total = price1+price2;
					ingredients.setText("Ingredients: \nGin: ~ "+Currency.format(price1)+
										"\nTonic Water: ~ "+Currency.format(price2)+
										"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Beton")){
					price1 = 19.99; price2 = .99;
					total = price1+price2;
					ingredients.setText("Ingredients: \nBecherovka: ~ "+Currency.format(price1)+
							"\nTonic Water: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Cuba Libre")){
					price1 = rumPr; price2 = 1.49;
					total = price1+price2;
					ingredients.setText("Ingredients: \nRum: ~ "+Currency.format(price1)+
							"\nCoke: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Pimm's Cup")){
					price1 = 19.75; price2 = 1.25;
					total = price1+price2;
					ingredients.setText("Ingredients: \nPimm's No. 1: ~ "+Currency.format(price1)+
							"\nGinger Ale: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Screwdriver")){
					price1 = vodkaPr; price2 = .99;
					total = price1+price2;
					ingredients.setText("Ingredients: \nVodka: ~ "+Currency.format(price1)+
							"\nOrange Juice: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("St. German & Champagne")){
					price1 = 19.50; price2 = 7.99;
					total = price1+price2;
					ingredients.setText("Ingredients: \nSt. Germain: ~ "+Currency.format(price1)+
							"\nChampagne: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Bourbon Peach Tea")){
					price1 = 21.99; price2 = .99;
					total = price1+price2;
					ingredients.setText("Ingredients: \nBourbon: ~ "+Currency.format(price1)+
							"\nPeach Iced Tea: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Dark & Stormy")){
					price1 = rumPr; price2 = 4.99;
					total = price1+price2;
					ingredients.setText("Ingredients: \nRum: ~ "+Currency.format(price1)+
							"\nGinger Beer: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Rum & Root Beer")){
					price1 = rumPr; price2 = 1.49;
					total = price1+price2;
					ingredients.setText("Ingredients: \nRum: ~ "+Currency.format(price1)+
							"\nRoot Beer: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Whiskey & Lemonade")){
					price1 = whiskeyPr; price2 = .99;
					total = price1+price2;
					ingredients.setText("Ingredients: \nWhiskey: ~ "+Currency.format(price1)+
							"\nLemonade: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Whiskey & Ginger Ale")){
					price1 = whiskeyPr; price2 = 1.25;
					total = price1+price2;
					ingredients.setText("Ingredients: \nWhiskey: ~ "+Currency.format(price1)+
							"\nGinger Ale: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Gin & Grapefruit Juice")){
					price1 = ginPr; price2 = 2;
					total = price1+price2;
					ingredients.setText("Ingredients: \nGin: ~ "+Currency.format(price1)+
							"\nGrapefruit Juice: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Southern Comfort and Peach Schnapps")){
					price1 = 15.99; price2 = 14.99;
					total = price1+price2;
					ingredients.setText("Ingredients: \nSouthern Comfort: ~ "+Currency.format(price1)+
							"\nPeach Schnapps: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Beermosa")){
					price1 = 6.99; price2 = .99;
					total = price1+price2;
					ingredients.setText("Ingredients: \nAny beer: ~ "+Currency.format(price1)+
							"\nOrange Juice: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				else if(item.equals("Whipped Cream Vodka & OJ")){
					price1 = vodkaPr; price2 = .99;
					total = price1+price2;
					ingredients.setText("Ingredients: \nVodka: ~ "+Currency.format(price1)+
							"\nOrange Juice: ~ "+Currency.format(price2)+
							"\nTotal Price: ~ "+Currency.format(total));
				}
				
				
					
			}// end onItemClick method

		}); //end setter
		
		
		
	}

	private void initList() {
		cocktailList.add(createCocktail("cocktail", "Paloma"));
		cocktailList.add(createCocktail("cocktail", "Whiskey Ginger"));
		cocktailList.add(createCocktail("cocktail", "Gimlet"));
		cocktailList.add(createCocktail("cocktail", "Greyhound"));
		cocktailList.add(createCocktail("cocktail", "Seven & Seven"));
		cocktailList.add(createCocktail("cocktail", "Gin & Tonic"));
		cocktailList.add(createCocktail("cocktail", "Beton"));
		cocktailList.add(createCocktail("cocktail", "Cuba Libre"));
		cocktailList.add(createCocktail("cocktail", "Pimm's Cup"));
		cocktailList.add(createCocktail("cocktail", "Screwdriver"));
		cocktailList.add(createCocktail("cocktail", "St. German & Champagne"));
		cocktailList.add(createCocktail("cocktail", "Bourbon Peach Tea"));
		cocktailList.add(createCocktail("cocktail", "Dark & Stormy"));
		cocktailList.add(createCocktail("cocktail", "Rum & Root Beer"));
		cocktailList.add(createCocktail("cocktail", "Whiskey & Lemonade"));
		cocktailList.add(createCocktail("cocktail", "Whiskey & Ginger Ale"));
		cocktailList.add(createCocktail("cocktail", "Gin & Grapefruit Juice"));
		cocktailList.add(createCocktail("cocktail", "Southern Comfort and Peach Schnapps"));
		cocktailList.add(createCocktail("cocktail", "Beermosa"));
		cocktailList.add(createCocktail("cocktail", "Whipped Cream Vodka & OJ"));
	}
	
	
	private HashMap<String, String> createCocktail(String key, String name) {
		HashMap<String, String> cocktail = new HashMap<String, String>();
		cocktail.put(key, name);
		return cocktail;
	}


}

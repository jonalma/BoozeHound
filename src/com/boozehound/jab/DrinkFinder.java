package com.boozehound.jab;

import android.os.Bundle;
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

public class DrinkFinder extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.drinkfinderlay);

		final Beverage [] bevarray = {
				new Beverage("BoilerMaker", "Whiskey", 1, "Beer", 1),
				new Beverage("Sake Bomb", "Sake", 1, "Beer", 1),    
				new Beverage("Vesper Martini", "Gin", 3, "Vodka", 1, "Kina Lillet", .5),
				new Beverage("Brass Monkey", "Rum", 1, "Vodka", 1, "Orange Juice", 4),
				new Beverage("Matador", "Tequila", 1, "Pineapple Juice", 3, "Lime", .5 ),
				new Beverage("Kamikaze", "Vodka", 1, "Triple Sec", 1, "Lime Juice", 1 ),
				new Beverage("Rob Roy", "Scotch", 3, "Vermouth", 1.5, "Angostura Bitters", 1)
		};

		//Create and declare an edit text box
		final EditText textbox = (EditText)findViewById(R.id.editText1);
		textbox.setFocusable(false);

		final Button whiskeyButton = (Button) findViewById(R.id.button1);  // whiskey button
		final Button sakeButton = (Button) findViewById(R.id.button3); // sake button
		final Button ginButton = (Button) findViewById(R.id.button4); // gin button
		final Button rumButton = (Button) findViewById(R.id.button5); // rum button
		final Button tequilaButton = (Button) findViewById(R.id.button2); // tequila button
		final Button vodkaButton = (Button) findViewById(R.id.button6); // vodka button
		final Button scotchButton = (Button) findViewById(R.id.button7); // scotch button

		Button [] buttonarray = {whiskeyButton,sakeButton,ginButton,rumButton,tequilaButton,
				vodkaButton,scotchButton};

		for(final Button button:buttonarray){
			button.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					//gets text that is in the button
					String item = button.getText().toString(); 
					//clear edit text box after each button click
					textbox.setText("");
					
					for(Beverage b:bevarray){
						// if ingredient button clicked equals possible ingredient in Beverage array
						if(b.getIngredient0().equals(item) || b.getIngredient1().equals(item)){
							if(b.getIngredient2() == null){
								textbox.append("Name: "+b.getBeverageName()+
										"\nIngredients: \n  "+b.getIngredient0()+", "+b.getMeasurement0()+
										"\n  "+b.getIngredient1()+", "+b.getMeasurement1()+"\n\n");
							}
							
							if((b.getIngredient0().equals(item) || b.getIngredient1().equals(item)) && 
									b.getIngredient2() != null	){
								textbox.append("Name: "+b.getBeverageName()+
									"\nIngredients: \n  "+b.getIngredient0()+", "+b.getMeasurement0()+
									"\n  "+b.getIngredient1()+", "+b.getMeasurement1()+
									"\n  "+b.getIngredient2()+", "+b.getMeasurement2()+"\n\n");
							}
						}//end if
					}//end for

				}//end onClick method
			}); // end setonclicklistener method
		}//end for loop		
	} //end oncreate method
	
}// end class



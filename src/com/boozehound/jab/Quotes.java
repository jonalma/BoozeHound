package com.boozehound.jab;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Quotes extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quotelay);
		
		final String [] quotearray = new String [16]; // allocate 15 quotes
		quotearray[0]="“Always do sober what you said you'd do drunk. That will teach you to keep your mouth shut.”" +
				"\n\n - Ernest Hemingway";
		quotearray[1]="“I drink to make other people more interesting.”" +
				"\n\n - Ernest Hemingway";
		quotearray[2]="“A lady came up to me one day and said 'Sir! You are drunk', to which I replied " +
				"'I am drunk today madam, and tomorrow I shall be sober but you will still be ugly.” " +
				"\n\n - Winston Churchill";
		quotearray[3]="“In wine there is wisdom, in beer there is Freedom, in water there is bacteria.”" +
				"\n\n - Benjamin Franklin";
		quotearray[4]="“First you take a drink, then the drink takes a drink, then the drink takes you.” " +
				"\n\n - F. Scott Fitzgerald";
		quotearray[5]="“Beer is proof that God loves us and wants us to be happy.”" +
				"\n\n - Benjamin Franklin";
		quotearray[6]="“It’s a great advantage not to drink among hard drinking people.” " +
				"\n\n -  F. Scott Fitzgerald";
		quotearray[7]="“Alcohol may be man's worst enemy, but the bible says love your enemy.” " +
				"\n\n - Frank Sinatra";
		quotearray[8]="“Good people drink good beer.” " +
				"\n\n - Hunter S. Thompson";
		quotearray[9]="“Drink because you are happy, but never because you are miserable.” " +
				"\n\n - G.K. Chesterton";
		quotearray[10]="“Everybody's got to believe in something. I believe I'll have another beer.” " +
				"\n\n - W.C. Fields";
		quotearray[11]="“They say the only people who tell the truth are drunkards and children. Guess " +
				"which one I am.” " +
				"\n\n - Stephen Colbert";
		quotearray[12]="“Always remember, that I have taken more out of alcohol than alcohol has taken out of me.” " +
				"\n\n - Winston Churchill";
		quotearray[13]="“Alcohol gives you infinite patience for stupidity.”" +
				"\n\n - Sammy Davis, Jr. ";
		quotearray[14]="“Beer is proof that God loves us and wants us to be happy.”" +
				"\n\n - Benjamin Franklin";
		
		// Declare MultiLine text boxes
		final EditText quote1 = (EditText)findViewById(R.id.quote1text);
		final EditText quote2 = (EditText)findViewById(R.id.quote2text);
				
		int randnum1 = 0; int randnum2 = 0;
		while(randnum1==randnum2){
			randnum1 = genRandNum();
			randnum2 = genRandNum();
		}
		
		//Set text boxes with quotes
		quote1.setText(quotearray[randnum1]);
		quote2.setText(quotearray[randnum2]);
		
		//Allows uneditable
		quote1.setKeyListener(null); 
		quote2.setKeyListener(null);
		
		//Does not allow focus
		quote1.setFocusable(false);
		quote2.setFocusable(false);
		
		final Button refreshbutton = (Button) findViewById(R.id.refresh); // refresh button 
		refreshbutton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {			
				int new1 = 0, new2 = 0;
				while(new1==new2){//refresh to generate two new quotes
						new1 = genRandNum();
						new2 = genRandNum();
				}						
				quote1.setText(quotearray[new1]);
				quote2.setText(quotearray[new2]);
			}
		});
	}//end onCreate method
	
	public int genRandNum(){
		int randnum = 0;
		Random randomGenerator = new Random();
		return randnum = randomGenerator.nextInt(15);	
	}
	
	
}//end class

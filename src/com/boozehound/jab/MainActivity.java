package com.boozehound.jab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final Button discoverButton = (Button) findViewById(R.id.Button01);  // discover button
		final Button bartenderButton = (Button) findViewById(R.id.button1); // bartender button
		final Button quoteButton = (Button) findViewById(R.id.button2); // quote button
		final Button gamesButton = (Button) findViewById(R.id.button3); // games button
		final Button sniffButton = (Button) findViewById(R.id.Button02); // sniff button
		final Button finderButton = (Button) findViewById(R.id.button4); // finder button
		
		finderButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//listener for your bartender page
				Intent i = new Intent(MainActivity.this, DrinkFinder.class);
				startActivity(i);
			}
		});
		
		discoverButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//listener for discover page
				Intent i = new Intent(MainActivity.this, DiscoverPage.class);
				startActivity(i);
			}
		});
		
		bartenderButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//listener for bartender page
				Intent i = new Intent(MainActivity.this, Bartender.class);
				startActivity(i);
			}
		});
		
		quoteButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//listener for quote page
				Intent i = new Intent(MainActivity.this, Quotes.class);
				startActivity(i);
			}
		});
		
		gamesButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//listener for drinking games page
				Intent i = new Intent(MainActivity.this, Games.class);
				startActivity(i);
			}
		});
		
		sniffButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				//listener for sniff page
				Intent i = new Intent(MainActivity.this, Sniff.class);
				startActivity(i);
			}
		});


	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
 
}

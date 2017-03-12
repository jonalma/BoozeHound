package com.boozehound.jab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class DiscoverPage extends Activity{
	List<Map<String, String>> discoverlist = new ArrayList<Map<String,String>>();
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.discoverpagelayout);	
		
		initList(); // initialize list with boozey's favorite spots
		ListView lv = (ListView) findViewById(R.id.discoverList);
		SimpleAdapter simpleAdpt = new SimpleAdapter(this, discoverlist, android.R.layout.simple_list_item_1, new String[] {"spot"}, new int[] {android.R.id.text1});
		lv.setAdapter(simpleAdpt); 
		
        lv.setOnItemClickListener(new OnItemClickListener() {
        	public void onItemClick(AdapterView<?> parent, View view, int position, long id){
        		
        		String item = ((TextView)view).getText().toString();
        		Intent viewIntent = new Intent("android.intent.action.VIEW",
        				  Uri.parse("http://www.google.com/search?q=long+beach+ca+"+item+"&rlz=1Y3YYEK_enUS554US554" +
        				  		"&oq=long+beach+ca+"+item+"&aps=chrome.69i57j69i61l3&clinet=chrome-mobile&sorceid=chrome" +
        				  		"-mobile&espv=1&ieUTF-8"));
        					  startActivity(viewIntent);
        	}
        });
	}
	
	/**
	 * Initialize list view
	 */
	private void initList() {
		discoverlist.add(createSpot("spot", "BevMo!"));
		discoverlist.add(createSpot("spot", "Holden's Liquor Bay"));
		discoverlist.add(createSpot("spot", "Benson Liquor Store"));
		discoverlist.add(createSpot("spot", "Liquor Locker"));
		discoverlist.add(createSpot("spot", "Marc's Liquor"));
		discoverlist.add(createSpot("spot", "Tommy's on Broadway"));
		discoverlist.add(createSpot("spot", "Liquorland"));
		discoverlist.add(createSpot("spot", "Stearns Liquor"));
		discoverlist.add(createSpot("spot", "Liquor Town"));
		discoverlist.add(createSpot("spot", "Eddie's Liquor Center"));
	}

	private HashMap<String, String> createSpot(String key, String name) {
		HashMap<String, String> place = new HashMap<String, String>();
		place.put(key, name);
		return place;
	}

}

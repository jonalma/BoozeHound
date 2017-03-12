package com.boozehound.jab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;
 

public class Games extends Activity{
	ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameslay);
 
        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);
 
        // preparing list data
        prepareListData();
 
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
 
        // setting list adapter
        expListView.setAdapter(listAdapter);
    }
 
    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
 
        // Adding child data
        listDataHeader.add("Edward 40 Hands");
        listDataHeader.add("Flip Cup");
        listDataHeader.add("Beer Pong");
        listDataHeader.add("Quarters");
        listDataHeader.add("King's Cup");
        listDataHeader.add("Power Hour");
        listDataHeader.add("Three Man");
 
        // Adding child data
        List<String> fortyHands = new ArrayList<String>();
        fortyHands.add("AKA: 80 Ounces to Freedom and the 40 Challenge\n\n"+
        
        			"Rules: Players duct tape a 40-ounce beer to each of their hands and may not free their " +
        			"hands until their beers are empty. Need to check a text on your phone? Too bad. Need to use " +
        			"the bathroom? That's really too bad. House rules differ as to whether players must drink BOTH " +
        			"bottles before removing the tape, or whether they can free one hand at a time. And punishment " +
        			"for those who can't finish also varies but can include the player having to pour the beer all " +
        			"over themselves.\n\n"+
        			
        			"History: Possibly created after a crafty drinker saw the 1990 Johnny Depp classic Edward " +
        			"Scissorhands and thought, But what if his hands were booze?!\n\n"+

					"What you'll need: 40s, tape, a strong bladder\n\n"+

        			"Tips: Don't drink any other liquids before playing this game, use the bathroom " +
        			"before you start, and pace yourself.");
 
        List<String> flipcup = new ArrayList<String>();
        flipcup.add("AKA: Cups, Taps, Flippy Cup, Tippy Cup\n\n"+

					"Rules: Two teams with an equal number of players stand on opposite sides of a table. " +
					"In front of each player is a plastic cup with a set amount of beer (the amount varies by " +
					"house rules-and who poured it). At the beginning, the first member on each team drinks his " +
					"or her beer. They then place their empty cup at the edge of the table, face-up, and using a " +
					"quick, one-touch motion, attempt to flip the cup over so that it lands face-down on the " +
					"table. When a player successfully flips his cup, the turn passes to the next player on his team." +
					" The first team to successfully flip all their cups is the winner.\n\n"+ 

					"History: According to some drinking game aficionados, the game was invented by college " +
					"students in Hoboken, New Jersey, in 1987. Whatever its origins, the game has spread and now " +
					"includes pay-to-play tournaments around the country, even the World Series of Flip Cup.\n\n"+

					"What you'll need: At least six players, plastic cups, a table that you don't care that much " +
					"about, beer\n\n"+

					"Tips: Ensure that your opponent has a challenge flipping his cup by 'accidentally' spilling " +
					"a little beer on his side of the table so his cup is tougher to flip.");
      
        List<String> beerpong = new ArrayList<String>();
        beerpong.add("AKA: Beirut Rules: Two two-to-four player teams take turns throwing pingpong balls at a " +
        		"triangle of cups on their opponents' side of the table. If a ball lands in a cup, the contents " +
        		"are consumed by the other team and the cup is placed aside or reinserted, empty, into the " +
        		"triangle. If a member of the opposing team throws a ball into an empty cup, they must drink one " +
        		"of their own cups. The first to eliminate all of the opponent's cups is the winner.\n\n"+

				"History: The game may have its origins in a beer pong played with paddles by the fraternities" +
				" of Dartmouth in the 1950s and 1960s. Some communities in the U.S. have attempted to ban the " +
				"game from being played outdoors for health concerns, both over binge drinking and the spread " +
				"of diseases such as herpes and mononucleosis.\n\n"+

				"What you'll need: Between four and eight people, plastic cups, beer, pingpong balls, a table\n\n"+

        		"Tips: Keep your fingers dry. If house rules don't ban them, employ distractions to fluster " +
        		"your opponents.");
        
        List<String> quarters = new ArrayList<String>();
        quarters.add("AKA: Moose (variation that includes bouncing quarters into an ice tray)\n\n"+

					 "Rules: A cup (either empty or filled with alcohol) is placed in the middle of a table, " +
					 "at least 10 inches away from all the players. Players take turns bouncing a quarter off " +
					 "the table and into the cup. If successful, the player makes another player drink and gets " +
					 "to take another turn (variations include the player to the left of the shooter drinking). " +
					 "Players determine in advance how much constitutes a 'drink'.\n\n"+

					"History: Unknown but is one of the oldest drinking games and remains popular today\n\n"+

					"What you'll need: Hard table, quarter, cups, beer (or other alcohol)\n\n"+

        			"Tips: If your house rules call for the shooter to choose the drinker, beware of revenge-don't "+
        			"choose the same player to drink every time you're shooting.");
        
        List<String> kingscup = new ArrayList<String>();
        kingscup.add("Shuffle a full deck of cards and scatter them in a pile in the middle of your table. " +
        		"One player goes at a time picking one card. They flip over their card, displaying it to " +
        		"everyone. Each card has a different rule as follows:\n\n"+
        	"Ace: Take one drink\n\n"+
        	"2: Take Two\n\n"+
        	"3: Take Three\n\n"+
        	"4: Questions – You look at the person of your choice and ask them a question, they must answer your " +
        	"question with a question and it keeps going until someone screws up. Ex. What is going on? " +
        	"Why do you touch yourself? You don’t have to question the person who questioned you either. " +
        	"Make sure to make eye contact.\n\n"+
        	"5: Give five drinks\n\n"+
        	"6: I never. This is where the person who flipped the card says something they "+
        	"have never done and anyone who has must drink.\n\n"+
        	"7: Thumbmaster – This person puts their thumb down on the table whenever they want and " +
        	"the last one to put theirs down drinks. The thumbmaster can do this as many times " +
        	"as he wants until the next seven is picked.\n\n"+
        	"8: Categories – The first person gives a topic/category and in rotation, everyone else must " +
        	"give a kind. Ex: Toothpaste, Crest, Colgate, Mentadent, etc.\n\n"+
        	"9: Rhyme – Everyone must give a word that rhymes with yours. Ex: Shoe…glue…you…etc…\n\n"+
        	"10: Social – Everyone drinks\n\n"+
        	"Jack: guys drink\n\n"+
        	"Queen: girls drink\n\n"+
        	"King: Waterfall – This can be extremely hard, depending on your group of drinkers. It goes in order " +
        	"first being the one who picked the card and so on. The first person drinks as much beer as they " +
        	"can continuously and the 2nd person can’t stop until they stop, the 3rd person can’t stop until " +
        	"the 2nd person and so on. If you have big drinkers at the beginning, it is really difficult.");
        
        List<String> powerhour = new ArrayList<String>();
        powerhour.add("AKA: Variation includes Century Club (a shot a minute for 100 minutes)\n\n"+

				"Rules: The rules are simple: Drink 60 shots of beer in one hour-one shot per minute. " +
				"Many websites exist to help players through the game by creating a one-hour playlist; " +
				"simply drink when you hear a new song. House rules can penalize players for not finishing.\n\n"+

				"History: Some claim the game originated in upstate New York.\n\n"+

				"What you'll need: About six beers per person, shot glasses\n\n"+

				"Tips: As you'll be drinking the equivalent of a six pack in one hour, just try to stay " +
				"on your feet (or in your seat).");
        
        List<String> threeman = new ArrayList<String>();
        threeman.add("AKA: Mr. Three, Hat Man\n\n"+
        			"Rules: Each person takes a roll at the dice; the first to roll a 1 and a 2 is designated " +
        			"the Three Man, and any time a 3 comes up, the Three Man has to drink. Other actions are " +
        			"assigned to different dice totals, including making the players to the left and right of " +
        			"the roller drink and making everybody drink. If another player rolls a 1 and a 2, they " +
        			"become the Three Man. In some house rules, if the Three Man himself rolls a 1 and a 2, he " +
        			"gets to choose who becomes the next Three Man. In some variations, the Three Man is forced " +
        			"to wear a special hat (often an empty beer case).\n\n"+

					"What you'll need: A pair of dice, at least six people (larger groups mean less drinking)\n\n"+

					"Tips: Learn the rules of the house and try to retain you motor control as you get drunker.");
       
        listDataChild.put(listDataHeader.get(0), fortyHands); // Header, Child data
        listDataChild.put(listDataHeader.get(1), flipcup);
        listDataChild.put(listDataHeader.get(2), beerpong);
        listDataChild.put(listDataHeader.get(3), quarters);
        listDataChild.put(listDataHeader.get(4), kingscup);
        listDataChild.put(listDataHeader.get(5), powerhour);
        listDataChild.put(listDataHeader.get(6), threeman);
    }
}
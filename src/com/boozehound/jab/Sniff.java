package com.boozehound.jab;

import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;

public class Sniff extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        /** Create a new layout to display the view */
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        
        /** Create a new textview array to display the results */
        TextView name[] = null, status[], reviewlink[],street[], city[], state[] ,zip[], phone[];

        try {
        	// convert php xml to java
            URL url = new URL("http://beermapping.com/webservice/loccity/b661871d7e981a1c9efcbbb7036377ae/long+beach,ca");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new InputSource(url.openStream()));
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("location");

            /** Assign textview array length by arraylist size */
            name = new TextView[nodeList.getLength()];
            status = new TextView[nodeList.getLength()];
            reviewlink = new TextView[nodeList.getLength()];
            street = new TextView[nodeList.getLength()];
            city = new TextView[nodeList.getLength()];
            state = new TextView[nodeList.getLength()];
            zip = new TextView[nodeList.getLength()];
            phone = new TextView[nodeList.getLength()];
            
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                name[i] = new TextView(this);
                status[i] = new TextView(this);
                reviewlink[i] = new TextView(this);
                street[i] = new TextView(this);
                city[i] = new TextView(this);
                state[i] = new TextView(this);
                zip[i] = new TextView(this);
                phone[i] = new TextView(this);
                
                Element fstElmnt = (Element) node;
                NodeList nameList = fstElmnt.getElementsByTagName("name");
                Element nameElement = (Element) nameList.item(0);
                nameList = nameElement.getChildNodes();
                
                NodeList statusList = fstElmnt.getElementsByTagName("status");
                Element statusElement = (Element) statusList.item(0);
                statusList = statusElement.getChildNodes();
                
                NodeList reviewlinkList = fstElmnt.getElementsByTagName("reviewlink");
                Element reviewElement = (Element) reviewlinkList.item(0);
                reviewlinkList = reviewElement.getChildNodes();
                
                NodeList streetList = fstElmnt.getElementsByTagName("street");
                Element streetElement = (Element) streetList.item(0);
                streetList = streetElement.getChildNodes();
                
                NodeList cityList = fstElmnt.getElementsByTagName("city");
                Element cityElement = (Element) cityList.item(0);
                cityList = cityElement.getChildNodes();
                
                NodeList stateList = fstElmnt.getElementsByTagName("state");
                Element stateElement = (Element) stateList.item(0);
                stateList = stateElement.getChildNodes();
                
                NodeList zipList = fstElmnt.getElementsByTagName("zip");
                Element zipElement = (Element) zipList.item(0);
                zipList = zipElement.getChildNodes();
                
                NodeList phoneList = fstElmnt.getElementsByTagName("phone");
                Element phoneElement = (Element) phoneList.item(0);
                phoneList = phoneElement.getChildNodes();
                
                name[i].setBackgroundColor(Color.parseColor("#93C3EB"));
                name[i].setSingleLine(false);
                
                if(i==0){
                name[i].setText(" Provided by BeerMapping.com API\n" +
                				"\n Name: " + ((Node) nameList.item(0)).getNodeValue() +
                				"\n Status: " + ((Node) statusList.item(0)).getNodeValue()+
                				"\n " + ((Node) streetList.item(0)).getNodeValue()+
                				"\n " + ((Node) cityList.item(0)).getNodeValue()+
                				", " + ((Node) stateList.item(0)).getNodeValue()+
                				", " + ((Node) zipList.item(0)).getNodeValue()+
                				"\n Phone: " + ((Node) phoneList.item(0)).getNodeValue()+"\n");
                }
                
                if(i!=0){
                	name[0].append("\n Name: " + ((Node) nameList.item(0)).getNodeValue() +
            				"\n Status: " + ((Node) statusList.item(0)).getNodeValue()+
            				"\n " + ((Node) streetList.item(0)).getNodeValue()+
            				"\n " + ((Node) cityList.item(0)).getNodeValue()+
            				", " + ((Node) stateList.item(0)).getNodeValue()+
            				", " + ((Node) zipList.item(0)).getNodeValue()+
            				"\n Phone: " + ((Node) phoneList.item(0)).getNodeValue()+"\n");
                }
                
                //name[0].setMovementMethod(new ScrollingMovementMethod());

            }
        } catch (Exception e) {
            System.out.println("XML Pasing Excpetion = " + e);
        }
        
        name[0].setMovementMethod(new ScrollingMovementMethod());
        layout.addView(name[0]);
        /** Set the layout view to display */
        setContentView(layout);
        
    	
    }
	
}

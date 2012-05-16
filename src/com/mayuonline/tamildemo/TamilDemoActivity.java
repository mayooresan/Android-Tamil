package com.mayuonline.tamildemo;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class TamilDemoActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //initializing tf instance with Bamini font
        Typeface tf = Typeface.createFromAsset(getAssets(),
        "font/Bamini.ttf");
        
        //Initializing TextView and setting the typeface created
        TextView tamilTextView = (TextView)findViewById(R.id.textView1);
        tamilTextView.setTypeface(tf);
        
        //Tamil Unicode text goes here.
        String tamilString = "வணக்கம் அன்ரொயிட்";
        
        //creating intance of TamilFotnUtil Class
        TamilFontUtil tfUtil = new TamilFontUtil();
        
        //Convert Tamil font encording using the utility.
        String tamilStringEncoded =  tfUtil.convertTamilString(tamilString);
        
        //Setting the text in the TextView
        tamilTextView.setText(tamilStringEncoded);
        
        
        
        
    }
}
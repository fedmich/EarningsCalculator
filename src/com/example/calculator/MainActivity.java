package com.example.calculator;

import java.text.NumberFormat;
import java.util.Locale;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	TextView tWeek;
	TextView tMonth;
	TextView tYear;
	
	EditText numBox;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Log.d("Fed", "creating");
        numBox = (EditText) findViewById(R.id.editNumber);
        
        tWeek = (TextView) findViewById(R.id.txtWeek);
        tMonth = (TextView) findViewById(R.id.txtMonth);
        tYear = (TextView) findViewById(R.id.txtYear);
        
        Log.d("Fed", "created");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    public void calculate(View v){
    	Log.d("Fed", "calculating");
    	int num = 0;
    	
    	if(! numBox.getText().toString().equals("") ) {
    		num = Integer.parseInt((String) numBox.getText().toString() );
    	}

	tWeek.setText("$" + (NumberFormat.getIntegerInstance( Locale.US ).format (num * 7)));
	tMonth.setText("$" + (NumberFormat.getIntegerInstance( Locale.US ).format (num * 30)));
	tYear.setText("$" + (NumberFormat.getIntegerInstance( Locale.US ).format (num * 365)));
    	
    }
    
}

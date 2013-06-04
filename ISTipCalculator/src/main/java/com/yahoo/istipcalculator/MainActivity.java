package com.yahoo.istipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn10Pct = (Button)findViewById(R.id.btn10pct);
        Button btn15Pct = (Button)findViewById(R.id.btn15pct);
        Button btn20Pct = (Button)findViewById(R.id.btn20pct);
        final EditText editText = (EditText)findViewById(R.id.editText);
        final TextView textView = (TextView)findViewById(R.id.textView);

        btn10Pct.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(editText.getText() == null || editText.getText().toString().equals("")) {
                    textView.setText("Please enter amount above!");
                } else {
                    float checkAmount = Float.parseFloat(editText.getText().toString());
                    textView.setText("You should tip: " + String.format("%.2f%n", checkAmount * 0.1));
                }
            }
        });
        btn15Pct.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(editText.getText() == null || editText.getText().toString().equals("")) {
                    textView.setText("Please enter amount above!");
                } else {
                    float checkAmount = Float.parseFloat(editText.getText().toString());
                    textView.setText("You should tip: " + String.format("%.2f%n", checkAmount * 0.15));
                }
            }
        });
        btn20Pct.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(editText.getText() == null || editText.getText().toString().equals("")) {
                    textView.setText("Please enter amount above!");
                } else {
                    float checkAmount = Float.parseFloat(editText.getText().toString());
                    textView.setText("You should tip: " + String.format("%.2f%n", checkAmount * 0.2));
                }
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

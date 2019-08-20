package com.davidwang.iridiumsix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private String mTopUnit;
    private double mTopAmount;
    private String mBottomUnit;
    private double mBottomAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Attach spinner views to member variables
        Spinner topSpinner = (Spinner) findViewById(R.id.top_spinner);
        Spinner bottomSpinner = (Spinner) findViewById(R.id.bottom_spinner);
        EditText topText = (EditText) findViewById(R.id.top_text);
        EditText bottomText = (EditText) findViewById(R.id.bottom_text);

        // Create and set adapters for spinners
        // The same one can be used as you compare distance units to distance units, etc.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.distance_units, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        topSpinner.setAdapter(adapter);
        bottomSpinner.setAdapter(adapter);

        topSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                // An item was selected. You can retrieve the selected item using
                // parent.getItemAtPosition(pos)
                mTopUnit = parent.getItemAtPosition(pos).toString();
            }

            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });
        bottomSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                // An item was selected. You can retrieve the selected item using
                // parent.getItemAtPosition(pos)
                mBottomUnit = parent.getItemAtPosition(pos).toString();
            }

            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        topText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // leave empty
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // we will use this
                // grab new value, save as amount

                //call convert() from here
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        bottomText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // leave empty
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // we will use this
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}

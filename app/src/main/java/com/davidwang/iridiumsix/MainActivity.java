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
    private String mBottomUnit;

    private Spinner topSpinner;
    private Spinner bottomSpinner;
    private EditText topText;
    private EditText bottomText;

    private Converter converter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Attach spinner views to member variables
        topSpinner = (Spinner) findViewById(R.id.top_spinner);
        bottomSpinner = (Spinner) findViewById(R.id.bottom_spinner);
        topText = (EditText) findViewById(R.id.top_text);
        bottomText = (EditText) findViewById(R.id.bottom_text);

        // Create and set adapters for spinners
        // The same one can be used as you compare distance units to distance units, etc.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.distance_units, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        topSpinner.setAdapter(adapter);
        bottomSpinner.setAdapter(adapter);

        // Declare Converter object
        converter = new Converter();

        topSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                // An item was selected. You can retrieve the selected item using
                // parent.getItemAtPosition(pos)
                mTopUnit = parent.getItemAtPosition(pos).toString();
            }

            public void onNothingSelected(AdapterView<?> parent) { }
        });
        bottomSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                // An item was selected. You can retrieve the selected item using
                // parent.getItemAtPosition(pos)
                mBottomUnit = parent.getItemAtPosition(pos).toString();
            }

            public void onNothingSelected(AdapterView<?> parent) { }
        });

        topText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // grab new value, save as 'amount'
                String text = topText.getText().toString();
                double finalValue = Double.parseDouble(text);
                bottomText.setText(""+converter.convert(mTopUnit, mBottomUnit, finalValue));
            }

            @Override
            public void afterTextChanged(Editable s) { }
        });
        bottomText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // grab new value, save as 'amount'
                String text = bottomText.getText().toString();
                double finalValue = Double.parseDouble(text);
                topText.setText(""+converter.convert(mBottomUnit, mTopUnit, finalValue));
            }

            @Override
            public void afterTextChanged(Editable s) { }
        });
    }
}

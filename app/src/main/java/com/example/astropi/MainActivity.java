package com.example.astropi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner aperture_dropdown = (Spinner) findViewById(R.id.aperture_dropdown);
        Spinner exposure_dropdown = (Spinner) findViewById(R.id.exposure_dropdown);
        Spinner iso_dropdown = (Spinner) findViewById(R.id.iso_dropdown);

        final Button select_settings = findViewById(R.id.select_settings);
        select_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (select_settings.getText() == "Testing 321") {
                    select_settings.setText("Testing 123");
                }else {
                    select_settings.setText("Testing 321");
                }
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        aperture_dropdown.setAdapter(adapter);
        exposure_dropdown.setAdapter(adapter);
        iso_dropdown.setAdapter(adapter);
    }
}

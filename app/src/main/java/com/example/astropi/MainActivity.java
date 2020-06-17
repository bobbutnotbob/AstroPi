package com.example.astropi;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar action_bar = findViewById(R.id.action_bar);
        setSupportActionBar(action_bar);

        final Spinner aperture_dropdown = findViewById(R.id.aperture_dropdown);
        final Spinner exposure_dropdown = findViewById(R.id.exposure_dropdown);
        final Spinner iso_dropdown = findViewById(R.id.iso_dropdown);

        final Button select_settings = findViewById(R.id.select_settings);
        select_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = aperture_dropdown.getSelectedItem().toString() + exposure_dropdown.getSelectedItem().toString() + iso_dropdown.getSelectedItem().toString();
                select_settings.setText(result);
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        aperture_dropdown.setAdapter(adapter);
        exposure_dropdown.setAdapter(adapter);
        iso_dropdown.setAdapter(adapter);
    }
}

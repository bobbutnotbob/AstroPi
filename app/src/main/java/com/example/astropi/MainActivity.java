package com.example.astropi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner aperture_dropdown = (Spinner) findViewById(R.id.aperture_dropdown);
        Spinner exposure_dropdown = (Spinner) findViewById(R.id.exposure_dropdown);
        Spinner iso_dropdown = (Spinner) findViewById(R.id.iso_dropdown);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        aperture_dropdown.setAdapter(adapter);
        exposure_dropdown.setAdapter(adapter);
        iso_dropdown.setAdapter(adapter);
    }

    public void sendMessage(View view) {
        // Do someth
    }
}

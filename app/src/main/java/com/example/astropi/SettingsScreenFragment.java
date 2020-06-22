package com.example.astropi;
import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsScreenFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            // Load the preferences from an XML resource
            setPreferencesFromResource(R.xml.settings_screen, rootKey);
        }

}
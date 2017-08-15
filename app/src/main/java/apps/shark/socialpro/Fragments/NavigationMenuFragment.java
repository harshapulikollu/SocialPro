package apps.shark.socialpro.Fragments;

/**
 * Created by Harsha on 6/19/2017.
 */

import android.os.Bundle;
import android.preference.PreferenceFragment;
import apps.shark.socialpro.R;

public class NavigationMenuFragment extends PreferenceFragment {

    @Override
    public void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.navigation_menu_settings);
    }
}
package apps.shark.socialpro.Ui;

/**
 * Created by Harsha on 6/19/2017.
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import apps.shark.socialpro.R;

public final class Theme {
    private static Theme AppTheme;
    private static SharedPreferences mPreferences;

    public Theme(final Context context) {
        mPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    }

    private static Theme getInstance(final Context context) {
        if (AppTheme == null) {
            AppTheme = new Theme(context.getApplicationContext());
        }
        return AppTheme;
    }

    private String setTheme() {
        return mPreferences.getString("app_theme", "MaterialFBook");
    }

    public static int getColor(final Context context) {
        int Attr;
        Attr = R.attr.colorPrimary;
        final TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(Attr, outValue, true);
        return outValue.data;
    }

    public static void getTheme(final Context ctxt) {
        final boolean MFB = Theme.getInstance(ctxt).setTheme().equals("MFB");
        final boolean Pink = Theme.getInstance(ctxt).setTheme().equals("Pink");
        final boolean Grey = Theme.getInstance(ctxt).setTheme().equals("Grey");
        final boolean Green = Theme.getInstance(ctxt).setTheme().equals("Green");
        final boolean Red = Theme.getInstance(ctxt).setTheme().equals("Red");
        final boolean Lime = Theme.getInstance(ctxt).setTheme().equals("Lime");
        final boolean Yellow = Theme.getInstance(ctxt).setTheme().equals("Yellow");
        final boolean Purple = Theme.getInstance(ctxt).setTheme().equals("Purple");
        final boolean LightBlue = Theme.getInstance(ctxt).setTheme().equals("LightBlue");
        final boolean Black = Theme.getInstance(ctxt).setTheme().equals("Black");
        final boolean Orange = Theme.getInstance(ctxt).setTheme().equals("Orange");
        final boolean GooglePlayGreen = Theme.getInstance(ctxt).setTheme().equals("GooglePlayGreen");
        if (MFB)
            ctxt.setTheme(R.style.Social);
        if (Pink)
            ctxt.setTheme(R.style.Pink);
        if (Grey)
            ctxt.setTheme(R.style.Grey);
        if (Green)
            ctxt.setTheme(R.style.Green);
        if (Red)
            ctxt.setTheme(R.style.Red);
        if (Lime)
            ctxt.setTheme(R.style.Lime);
        if (Yellow)
            ctxt.setTheme(R.style.Yellow);
        if (Purple)
            ctxt.setTheme(R.style.Purple);
        if (LightBlue)
            ctxt.setTheme(R.style.LightBlue);
        if (Black)
            ctxt.setTheme(R.style.Black);
        if (Orange)
            ctxt.setTheme(R.style.Orange);
        if (GooglePlayGreen)
            ctxt.setTheme(R.style.GooglePlayGreen);
    }
}


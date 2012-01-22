package org.androidaalto.introtoandroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_view);
        String pressTime = getIntent().getExtras().getString("PRESS_TIME");
        Toast.makeText(this, pressTime, Toast.LENGTH_LONG).show();
    }

}

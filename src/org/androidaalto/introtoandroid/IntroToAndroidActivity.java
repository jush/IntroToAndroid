package org.androidaalto.introtoandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Toast;

public class IntroToAndroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        /* The following lines are not needed since we define onClick property in main.xml
        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pressMeClicked(v);
            }
        });
        */
    }
    
    public void pressMeClicked(View view) {
        Toast.makeText(this, "Button pressed", Toast.LENGTH_LONG).show();
        Time pressTime = new Time();
        pressTime.setToNow();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("PRESS_TIME",pressTime.toString());
        startActivity(intent);
    }
}
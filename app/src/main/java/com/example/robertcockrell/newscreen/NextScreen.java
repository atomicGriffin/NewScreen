package com.example.robertcockrell.newscreen;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class NextScreen extends ActionBarActivity {
    Intent intent;
    TextView NewText;
    String string;
    RelativeLayout bg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_screen);
        bg = (RelativeLayout) findViewById(R.id.bg);
        intent = getIntent();
        NewText=(TextView) findViewById(R.id.NewText);

        if (intent != null) {
            string = intent.getStringExtra("saveText");
        }
        NewText.setText(string);
        NewText.setTextColor(0xFFBAD455);
        bg.setBackgroundColor(0xFFFFC814);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_next_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

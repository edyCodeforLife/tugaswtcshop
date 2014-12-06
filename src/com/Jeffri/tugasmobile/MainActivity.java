package com.Jeffri.tugasmobile;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void openCelcius(View v){
		Intent i = new Intent(getApplicationContext(),CelciusActivity.class);
		startActivity(i);
	}
    
    public void openCounter(View w){
		Intent j = new Intent(getApplicationContext(),CounterExtremeActivity.class);
		startActivity(j);
	}
    
    public void openAvib(View x){
		Intent k = new Intent(getApplicationContext(),NewAvibActivity.class);
		startActivity(k);
	}
}

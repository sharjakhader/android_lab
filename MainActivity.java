package com.sharja.backgroundcolor;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;
import android.widget.CompoundButton;

public class MainActivity extends Activity {
	
	ToggleButton t;
	RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(ToggleButton)findViewById(R.id.toggleButton1);
        rl=(RelativeLayout)findViewById(R.id.relativelayout);
        t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
				// TODO Auto-generated method stub
				if(t.isChecked()){
				rl.setBackgroundColor(android.graphics.Color.BLACK);
				}else{
					rl.setBackgroundColor(android.graphics.Color.WHITE);
				}
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

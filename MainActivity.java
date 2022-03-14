package com.sharja.radiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;




public class MainActivity extends Activity {
	
	   RadioButton rm,rf;
	   RadioGroup rg;
	   TextView t;

	   @Override
     protected void onCreate(Bundle savedInstanceState) {    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rm=(RadioButton)findViewById(R.id.rdMale);
        rf=(RadioButton)findViewById(R.id.rdFemale);
        t=(TextView)findViewById(R.id.txtGender);
        rg=(RadioGroup)findViewById(R.id.rdGender);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
        	
        	@Override
        	public void onCheckedChanged(RadioGroup group,int checkedid){
        		if(rm.isChecked())
        		{
        			t.setText("you are a man");
        		}
        		if(rf.isChecked())
        		{
        			t.setText("you are now a women");
        		}
        		
        		}
        	});
        }
}


   

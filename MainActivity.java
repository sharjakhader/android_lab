package com.jasmin.dateandtime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.btnDialog);
        b.setOnClickListener(new OnClickListener() {
        	
        	@Override
        	public void onClick(View v) {
        		ShowDateTimeDialog DT=new ShowDateTimeDialog();
        		DT.show(getFragmentManager(),null);
        		
        	}
        });
    }
    
   
    public class ShowDateTimeDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
       Calendar c = Calendar.getInstance();
       SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyy HH:mm:ss");
       String strDate= sdf.format(c.getTime());
       AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
       builder.setTitle("Date and Time");
       builder.setMessage(strDate);
       builder.setNeutralButton("OK", null);
       return builder.create();
    }
    }
}
       
    
    


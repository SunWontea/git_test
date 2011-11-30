package com.tistory.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Git_testActivity extends Activity implements OnClickListener{
	private Button btn;
	private TextView txt;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btn = (Button)findViewById(R.id.button1);
        txt = (TextView)findViewById(R.id.textView1);
        
        btn.setOnClickListener(this);
        
        
    }
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button1:
			txt.setText("Change Text");
			break;
		}
		
	}
}
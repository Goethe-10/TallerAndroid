package taller.android.colorview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	private OptionsColorView mCustomView;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		mCustomView = (OptionsColorView)findViewById(R.id.my_options_view);
	}
	
	public void onButtonClick(View v) {
		EditText et = (EditText)findViewById(R.id.text_et);
		mCustomView.setText(et.getText().toString());
	}
}

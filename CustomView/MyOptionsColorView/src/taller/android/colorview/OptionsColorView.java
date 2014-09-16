package taller.android.colorview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OptionsColorView extends LinearLayout {
	public OptionsColorView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		TypedArray a =
				context.obtainStyledAttributes(attrs, 
						R.styleable.OptionsColorView, 0, 0);
		
		LayoutInflater inflater = LayoutInflater.from(context);
		inflater.inflate(R.layout.options_color_view, this, true);
		
		String text = a.getString(R.styleable.OptionsColorView_textString);
		TextView textView = (TextView)findViewById(R.id.text);
		textView.setText(text);
		
		int color = a.getColor(R.styleable.OptionsColorView_optionsColor, 
				android.R.color.holo_blue_light);
		
		View v = findViewById(R.id.color);
		v.setBackgroundColor(color);
		
		a.recycle();
	}
	
	public void setText(String newText) {
		TextView textView = (TextView)findViewById(R.id.text);
		textView.setText(newText);
	}
	
	public void setColor(int color) 
	{
		View v = findViewById(R.id.color);
		v.setBackgroundColor(color);
	}
	
}

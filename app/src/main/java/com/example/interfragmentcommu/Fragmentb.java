package com.example.interfragmentcommu;



import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragmentb extends Fragment {
	TextView text;
	String data;
	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState) {
		  View view=inflater.inflate(R.layout.activity_fragmentb, container,false);
		  if(savedInstanceState==null){
				
			}
			else{
				data=savedInstanceState.getString("text");
			    TextView myText=(TextView)view.findViewById(R.id.textView1);
		        myText.setText(data);}
		  
		  return view;
	}

	/* (non-Javadoc)
	 * @see android.support.v4.app.Fragment#onActivityCreated(android.os.Bundle)
	 */
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		text=(TextView)getActivity().findViewById(R.id.textView1);
	}
	@Override
	public void onSaveInstanceState(Bundle outState) {
	super.onSaveInstanceState(outState);
	outState.putString("text", data);
	}
	public void changeText(String data){
		this.data=data;
		text.setText(data);
	}
}

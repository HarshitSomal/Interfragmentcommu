package com.example.interfragmentcommu;


import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fraga extends Fragment implements View.OnClickListener{

	Button b;
	int count;
	Communicator comm;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if(savedInstanceState==null){
			count=0;
		}
		else{
			count=savedInstanceState.getInt("count",0);
		}
	}


	@Override
	public View onCreateView(LayoutInflater inflater,
		   ViewGroup container, Bundle savedInstanceState) {
		   return inflater.inflate(R.layout.activity_fraga, container,false);
	}

	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		comm=(Communicator) getActivity();
		b=(Button)getActivity().findViewById(R.id.button1);
		b.setOnClickListener(this);
	}

	
	@Override
	public void onSaveInstanceState(Bundle outState) {
	super.onSaveInstanceState(outState);
	outState.putInt("counter", count);
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		count++ ;
		comm.respond("The button was clicked"+count+"times");
	}

	
}

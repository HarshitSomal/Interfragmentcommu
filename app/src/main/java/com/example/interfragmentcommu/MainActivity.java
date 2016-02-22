package com.example.interfragmentcommu;



import android.support.v7.app.ActionBarActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

	@Override
	public void respond(String data) {
	FragmentManager manager= getFragmentManager();
	Fragmentb f2=(Fragmentb) manager.findFragmentById(R.id.fragment2);
		f2.changeText(data);
	}


   
}

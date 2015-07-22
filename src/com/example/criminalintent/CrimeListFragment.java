package com.example.criminalintent;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CrimeListFragment extends ListFragment {

	private ArrayList<Crime> mCrimes;
	private String TAG="CrimeListFragment";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		getActivity().setTitle(R.string.crimes_tittle);
		mCrimes=Crimelab.get(getActivity()).getCrimes();
		
		ArrayAdapter<Crime> adapter=new ArrayAdapter<Crime>(getActivity(), android.R.layout.simple_list_item_1,mCrimes);
		setListAdapter(adapter);
		
		
	}
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		Crime c=(Crime)(getListAdapter()).getItem(position);
		Log.d(TAG, c.getTittle()+"was clicked!");
	}

}

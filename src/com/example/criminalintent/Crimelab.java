package com.example.criminalintent;

import java.util.ArrayList;
import java.util.UUID;

import android.R.integer;
import android.content.Context;

public class Crimelab {

	private ArrayList<Crime> mCrimes;
	private static Crimelab sCrimelab;
	private Context mAppContext;
	
	private Crimelab(Context appContext)
	{
		this.mAppContext=appContext;
		mCrimes=new ArrayList<Crime>();
		for(int i=0;i<100;i++)
		{
			Crime c=new Crime();
			c.setTittle("Crime #"+i);
			c.setSolved(i%2==0);
			mCrimes.add(c);
		}
	}
	
	public ArrayList<Crime> getCrimes()
	{
		return mCrimes;
	}
	
	public Crime getCrime(UUID id)
	{
		for(Crime c:mCrimes)
		{
			if(c.getId().equals(id))
				return c;
		}
		return null;
	}
	
	public static Crimelab get(Context c)
	{
		if(sCrimelab==null)
		{
			sCrimelab=new Crimelab(c.getApplicationContext());
		}
		return sCrimelab;
	}
}

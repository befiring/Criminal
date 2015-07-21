package com.example.criminalintent;

import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;

public class Crimelab {

	private ArrayList<Crime> mCrimes;
	private static Crimelab sCrimelab;
	private Context mAppContext;
	
	private Crimelab(Context appContext)
	{
		this.mAppContext=appContext;
		mCrimes=new ArrayList<Crime>();
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
	
	private static Crimelab get(Context c)
	{
		if(sCrimelab==null)
		{
			sCrimelab=new Crimelab(c.getApplicationContext());
		}
		return sCrimelab;
	}
}

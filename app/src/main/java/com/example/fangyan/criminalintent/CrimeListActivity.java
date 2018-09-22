package com.example.fangyan.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeListActivity extends SingleCrimeActivity {
    @Override
    public Fragment createFragment(){
        return new CrimeListFragment();
    }
}

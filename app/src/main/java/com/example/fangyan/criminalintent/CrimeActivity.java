package com.example.fangyan.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

public class CrimeActivity extends SingleCrimeActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeFragment();
    }

}

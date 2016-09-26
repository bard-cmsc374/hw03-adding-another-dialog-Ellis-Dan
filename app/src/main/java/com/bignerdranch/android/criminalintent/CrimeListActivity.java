package com.bignerdranch.android.criminalintent;

/**
 * Created by Dan_Ellis on 9/25/16.
 */

import android.support.v4.app.Fragment;
public class CrimeListActivity extends SingleFragmentActvity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

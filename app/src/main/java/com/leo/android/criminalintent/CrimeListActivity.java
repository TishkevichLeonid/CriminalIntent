package com.leo.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by leonidtiskevic on 15.04.17.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}


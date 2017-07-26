package com.framgia.feastival.screen.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.framgia.feastival.R;
import com.framgia.feastival.databinding.ActivityMainBinding;
import com.framgia.feastival.screen.BaseActivity;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * Main Screen.
 */
public class MainActivity extends BaseActivity {

    private MainContract.ViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewModel = new MainViewModel();

        MainContract.Presenter presenter =
                new MainPresenter(mViewModel);
        mViewModel.setPresenter(presenter);

        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel((MainViewModel) mViewModel);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
            .findFragmentById(R.id.map);
        mViewModel.setMapFragment(mapFragment);
        
    }

    @Override
    protected void onStart() {
        super.onStart();
        mViewModel.onStart();
    }

    @Override
    protected void onStop() {
        mViewModel.onStop();
        super.onStop();
    }
}

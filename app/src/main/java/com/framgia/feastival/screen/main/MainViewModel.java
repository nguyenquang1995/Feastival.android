package com.framgia.feastival.screen.main;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Exposes the data to be used in the Main screen.
 */
public class MainViewModel implements MainContract.ViewModel, OnMapReadyCallback {

    private MainContract.Presenter mPresenter;
    private SupportMapFragment mMapFragment;
    private GoogleMap mMap;

    public MainViewModel() {
    }

    @Override
    public void onStart() {
        mMapFragment.getMapAsync(this);
        mPresenter.onStart();
    }

    @Override
    public void onStop() {
        mPresenter.onStop();
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
    }

    @Override
    public void setMapFragment(SupportMapFragment mapFragment) {
        mMapFragment = mapFragment;
    }
}

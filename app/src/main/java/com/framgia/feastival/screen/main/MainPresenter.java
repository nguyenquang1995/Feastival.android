package com.framgia.feastival.screen.main;

import com.framgia.feastival.data.source.RestaurantDataSource;

/**
 * Listens to user actions from the UI ({@link MainActivity}), retrieves the data and updates
 * the UI as required.
 */
final class MainPresenter implements MainContract.Presenter {
    private static final String TAG = MainPresenter.class.getName();
    private final MainContract.ViewModel mViewModel;
    private RestaurantDataSource mRestaurantRepository;

    public MainPresenter(MainContract.ViewModel viewModel,
                         RestaurantDataSource restaurantRepository) {
        mViewModel = viewModel;
        mRestaurantRepository = restaurantRepository;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }
}

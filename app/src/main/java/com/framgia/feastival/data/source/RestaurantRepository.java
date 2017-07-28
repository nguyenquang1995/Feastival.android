package com.framgia.feastival.data.source;

import com.framgia.feastival.data.source.model.RestaurantsResponse;
import com.framgia.feastival.data.source.remote.RestaurantRemoteDataSource;

import io.reactivex.Observable;

/**
 * Created by tmd on 07/07/2017.
 */
public class RestaurantRepository implements RestaurantDataSource {
    
    private RestaurantDataSource mRemoteDataSource;

    public RestaurantRepository(
        RestaurantDataSource remoteDataSource) {
        this.mRemoteDataSource = remoteDataSource;
    }

    @Override
    public Observable<RestaurantsResponse> getRestaurants() {
        return mRemoteDataSource.getRestaurants();
    }
}

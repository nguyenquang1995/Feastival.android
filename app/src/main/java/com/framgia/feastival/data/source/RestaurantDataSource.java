package com.framgia.feastival.data.source;

import com.framgia.feastival.data.source.model.RestaurantsResponse;

import rx.Observable;

/**
 * Created by tmd on 07/07/2017.
 */
public interface RestaurantDataSource {
    Observable<RestaurantsResponse> getRestaurants();
}

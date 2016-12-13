package com.example.guest.myrestaurants.util;

import com.example.guest.myrestaurants.models.Restaurant;

import java.util.ArrayList;

/**
 * Created by Guest on 12/13/16.
 */
public interface OnRestaurantSelectedListener {
    public void onRestaurantSelected(Integer position, ArrayList<Restaurant> restaurants);
}

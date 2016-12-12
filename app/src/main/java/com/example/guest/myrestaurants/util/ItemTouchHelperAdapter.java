package com.example.guest.myrestaurants.util;

/**
 * Created by Chance on 12/12/16.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);
}

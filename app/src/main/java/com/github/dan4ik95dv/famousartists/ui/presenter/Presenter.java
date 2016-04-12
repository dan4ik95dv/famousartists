package com.github.dan4ik95dv.famousartists.ui.presenter;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public interface Presenter<V> {
    void attachView(V view);

    void detachView();
}

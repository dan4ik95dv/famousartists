package com.github.dan4ik95dv.famousartists.ui.activity;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */

public abstract class BaseActivity extends RxAppCompatActivity {
    private CompositeSubscription subscription = new CompositeSubscription();

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
        subscription.unsubscribe();
    }

    public void watch(Subscription sub) {
        subscription.add(sub);
    }
}
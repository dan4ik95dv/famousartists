package com.github.dan4ik95dv.famousartists.ui.fragment;

import com.trello.rxlifecycle.components.support.RxFragment;

import butterknife.ButterKnife;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Daniil Celikin on 16.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class BaseFragment extends RxFragment {
    private CompositeSubscription subscription = new CompositeSubscription();

    public void watch(Subscription sub) {
        subscription.add(sub);
    }


    @Override
    public void onDestroyView() {
        ButterKnife.unbind(this);
        subscription.unsubscribe();
        super.onDestroyView();
    }


}

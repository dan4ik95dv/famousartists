package com.github.dan4ik95dv.famousartists.ui.fragment;

import android.content.Intent;

import com.github.dan4ik95dv.famousartists.model.contest.ArtistContest;
import com.github.dan4ik95dv.famousartists.ui.activity.MoreActivity;
import com.trello.rxlifecycle.components.support.RxFragment;

import org.parceler.Parcels;

import butterknife.ButterKnife;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by Daniil Celikin on 16.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public abstract class BaseFragment extends RxFragment {
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

    public void getArtist(Integer artistId) {
        getArtist(artistId, null);
    }

    public void getArtist(Integer artistId, ArtistContest artistContest) {
        if (artistId != null) {
            Intent intent = new Intent(getActivity(), MoreActivity.class);
            if (artistContest != null)
                intent.putExtra(com.github.dan4ik95dv.famousartists.constant.Intent.ARTIST_CONTEST, Parcels.wrap(artistContest));
            intent.putExtra(com.github.dan4ik95dv.famousartists.constant.Intent.ARTIST_ID, artistId);
            startActivity(intent);
        }
    }
}

package com.github.dan4ik95dv.famousartists.ui.presenter;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.github.dan4ik95dv.famousartists.app.App;
import com.github.dan4ik95dv.famousartists.io.bus.RxBus;
import com.github.dan4ik95dv.famousartists.model.yandex.artist.response.ArtistResponse;
import com.github.dan4ik95dv.famousartists.ui.adapter.AlbumsAdapter;
import com.github.dan4ik95dv.famousartists.ui.view.ArtistAlbumsMvpView;
import com.github.dan4ik95dv.famousartists.ui.widget.ItemClickSupport;

import javax.inject.Inject;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Daniil Celikin on 25.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class ArtistAlbumsPresenter implements Presenter<ArtistAlbumsMvpView> {
    private static final String TAG = "PromotionAddressesPres";

    @Inject
    RxBus rxBus;

    private ArtistAlbumsMvpView artistAlbumsMvpView;

    private Context context;
    private AlbumsAdapter mAlbumsAdapter;

    public ArtistAlbumsPresenter(Context context) {
        this.context = context;
        App.getInstance().getClientComponent().inject(this);
    }

    RecyclerView.AdapterDataObserver mAdapterDataObserver = new RecyclerView.AdapterDataObserver() {
        @Override
        public void onChanged() {
            super.onChanged();
            artistAlbumsMvpView.hideProgress();
        }
    };

    public void init() {
        mAlbumsAdapter = new AlbumsAdapter(context);
        mAlbumsAdapter.registerAdapterDataObserver(mAdapterDataObserver);
    }



    public AlbumsAdapter getAdapter() {
        return mAlbumsAdapter;
    }

    @Override
    public void attachView(ArtistAlbumsMvpView view) {
        this.artistAlbumsMvpView = view;
        subscribeOnEvents();
    }

    @Override
    public void detachView() {
        this.artistAlbumsMvpView = null;
    }

    ItemClickSupport.OnItemLongClickListener onItemLongClickListener = new ItemClickSupport.OnItemLongClickListener() {
        @Override
        public boolean onItemLongClicked(RecyclerView recyclerView, int position, View v) {
            return false;
        }
    };
    ItemClickSupport.OnItemClickListener onItemClickListener = new ItemClickSupport.OnItemClickListener() {
        @Override
        public void onItemClicked(RecyclerView recyclerView, int position, View v) {

        }
    };
    SwipeRefreshLayout.OnRefreshListener refreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {

        }
    };

    public ItemClickSupport.OnItemLongClickListener getOnItemLongClickListener() {
        return onItemLongClickListener;
    }

    public SwipeRefreshLayout.OnRefreshListener getRefreshListener() {
        return refreshListener;
    }

    public ItemClickSupport.OnItemClickListener getOnItemClickListener() {
        return onItemClickListener;
    }

    void subscribeOnEvents() {
        artistAlbumsMvpView.getFragment().watch(rxBus.toObservable()
                .compose(artistAlbumsMvpView.getFragment().bindToLifecycle())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Action1<Object>() {
                    @Override
                    public void call(Object o) {
                        // TODO: 25.04.2016
                    }
                }));
    }

    public void fillView(ArtistResponse artistResponse) {
        if (artistResponse != null) {
            if (artistResponse.getAlbums() != null && artistResponse.getAlbums().size() > 0) {
                mAlbumsAdapter.setAlbumList(artistResponse.getAlbums());
            } else {
                artistAlbumsMvpView.noAlbums();
            }
            artistAlbumsMvpView.hideProgress();
        }
    }
}

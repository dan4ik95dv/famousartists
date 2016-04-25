package com.github.dan4ik95dv.famousartists.ui.presenter;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;

import com.github.dan4ik95dv.famousartists.app.App;
import com.github.dan4ik95dv.famousartists.constant.Client;
import com.github.dan4ik95dv.famousartists.io.adapter.SuggestionsAdapter;
import com.github.dan4ik95dv.famousartists.io.client.RestMusicSuggest;
import com.github.dan4ik95dv.famousartists.model.yandex.suggestions.Suggestion;
import com.github.dan4ik95dv.famousartists.model.yandex.suggestions.response.Suggestions;
import com.github.dan4ik95dv.famousartists.ui.activity.MainActivity;
import com.github.dan4ik95dv.famousartists.ui.view.MainMvpView;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;

import javax.inject.Inject;

import io.realm.Realm;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Daniil Celikin on 12.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class MainPresenter implements Presenter<MainMvpView> {
    private static final String TAG = "MainPresenter";

    private MainMvpView mainMvpView;
    @Inject
    Realm realm;

    @Inject
    RestMusicSuggest restMusicSuggest;

    MainActivity activity;
    SuggestionsAdapter adapter;

    public MainPresenter(Context context) {
        App.getInstance().getClientComponent().inject(this);
        activity = (MainActivity) context;
        adapter = new SuggestionsAdapter(context, new ArrayList<Suggestion>(), null, false);
        attachView((MainMvpView) context);
    }

    MaterialSearchView.OnQueryTextListener onQueryTextSearchListener = new MaterialSearchView.OnQueryTextListener() {
        @Override
        public boolean onQueryTextSubmit(String query) {
            getSuggestions(query);
            return false;
        }

        @Override
        public boolean onQueryTextChange(String newText) {
            getSuggestions(newText);
            return false;
        }
    };

    private void getSuggestions(String newText) {
        activity.watch(
                restMusicSuggest.getSuggestions(newText)
                        .compose(activity.<Suggestions>bindToLifecycle())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.newThread())
                        .unsubscribeOn(Schedulers.io())
                        .subscribe(new Action1<Suggestions>() {
                            @Override
                            public void call(final Suggestions suggestions) {
                                adapter.setSuggestions(suggestions);
                            }
                        }, new Action1<Throwable>() {
                            @Override
                            public void call(Throwable throwable) {
                                // TODO: 25.04.2016
                            }
                        }));
    }


    AdapterView.OnItemClickListener searchSuggestionAdapterClickItemListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Suggestion suggestion = adapter.getItem(position);
            if (suggestion != null) {
                switch (suggestion.getType()) {
                    case Client.Search.Type.ARTIST:
                        activity.getArtist(suggestion.getId());
                        break;
                }
                mainMvpView.hideSearch();
            }
        }
    };

    public AdapterView.OnItemClickListener getSearchSuggestionAdapterClickItemListener() {
        return searchSuggestionAdapterClickItemListener;
    }

    public MaterialSearchView.OnQueryTextListener getOnQueryTextSearchListener() {
        return onQueryTextSearchListener;
    }

    public SuggestionsAdapter getSuggestionsAdapter() {
        return adapter;
    }

    @Override
    public void attachView(MainMvpView view) {
        this.mainMvpView = view;
    }


    @Override
    public void detachView() {
        this.mainMvpView = null;
    }
}

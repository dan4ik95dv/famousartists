package com.github.dan4ik95dv.famousartists.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.dan4ik95dv.famousartists.R;
import com.github.dan4ik95dv.famousartists.di.component.fragment.DaggerSettingsComponent;
import com.github.dan4ik95dv.famousartists.di.module.fragment.SettingsModule;
import com.github.dan4ik95dv.famousartists.ui.presenter.SettingsPresenter;
import com.github.dan4ik95dv.famousartists.ui.view.SettingsMvpView;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Daniil Celikin on 21.04.2016.
 * https://github.com/dan4ik95dv/famousartists
 */
public class SettingsFragment extends BaseFragment implements SettingsMvpView {

    @Inject
    SettingsPresenter presenter;

    @Bind(R.id.coordinatorLayout)
    CoordinatorLayout coordinatorLayout;

    public static SettingsFragment newInstance() {
        return new SettingsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerSettingsComponent.builder().settingsModule(new SettingsModule(getContext())).build().inject(this);
        presenter.attachView(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public SettingsFragment getFragment() {
        return this;
    }

    @Override
    public void updateFragment() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
        presenter.detachView();
    }
}

package com.mamunsw.mosi.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mamunsw.mosi.Model.SinopsisModel;
import com.mamunsw.mosi.R;

import butterknife.BindView;
import retrofit2.Call;

public class NewsFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View findView = inflater.inflate(R.layout.fragment_news, container, false);



        return findView;
    }
}

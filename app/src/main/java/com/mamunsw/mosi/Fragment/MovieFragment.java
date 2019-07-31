package com.mamunsw.mosi.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.mamunsw.mosi.API.ClientAPI;
import com.mamunsw.mosi.API.RestAPI;
import com.mamunsw.mosi.Adapters.SinopsisAdapter;
import com.mamunsw.mosi.Model.SinopsisModel;
import com.mamunsw.mosi.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MovieFragment extends Fragment {

    @BindView(R.id.rclySinopsis)
    RecyclerView recyclerView;

    public MovieFragment(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.fragment_movie, container, false);
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this,view);
        tampildata();
        return view;
    }
    void tampildata(){
         RestAPI service = ClientAPI.getClient().create(RestAPI.class);
        Call<SinopsisModel> call= service.getdataAll();
        call.enqueue(new Callback<SinopsisModel>() {
            @Override
            public void onResponse(Call<SinopsisModel> call, Response<SinopsisModel> response) {
                Toast.makeText(getActivity().getApplicationContext(),"total ="+response.body().getTotal_result(), Toast.LENGTH_LONG).show();
                LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity().getApplicationContext());
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setHasFixedSize(true);
                SinopsisAdapter resepMasakanAdapter=new SinopsisAdapter(getActivity().getApplicationContext(),response.body().getResults());
                recyclerView.setAdapter(resepMasakanAdapter);
            }

            @Override
            public void onFailure(Call<SinopsisModel> ceall, Throwable t) {

            }
        });
    }
}

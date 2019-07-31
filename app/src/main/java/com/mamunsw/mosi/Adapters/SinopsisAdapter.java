package com.mamunsw.mosi.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.mamunsw.mosi.Model.Result;
import com.mamunsw.mosi.R;

import java.util.List;

public class SinopsisAdapter extends RecyclerView.Adapter<SinopsisViewHolder>{

    private Context context;
    private List<Result> resultSinopsisList;

    public SinopsisAdapter(Context context, List<Result> resultPahlawanList){
        this.context = context;
        this.resultSinopsisList = resultPahlawanList;
    }
    @NonNull
    @Override
    public SinopsisViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_sinopsis, viewGroup, false);
        return new SinopsisViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SinopsisViewHolder pahlawanViewHolder, int i) {
        Result resultPahlawan = resultSinopsisList.get(i);
        pahlawanViewHolder.txtJudul.setText(((Result) resultPahlawan).getJudulfilm());
        pahlawanViewHolder.txtGenre.setText(((Result) resultPahlawan).getJudulfilm());
        pahlawanViewHolder.txtDurasi.setText(((Result) resultPahlawan).getJudulfilm());
        Glide.with(context)
                .load(""+resultPahlawan.getGambarfilm())
                .apply(new RequestOptions().override(100,100).centerCrop())
                .into(pahlawanViewHolder.imgSinopsis);
        pahlawanViewHolder.setItem(resultSinopsisList);
    }

    @Override
    public int getItemCount() {
        return resultSinopsisList.size();
    }

}

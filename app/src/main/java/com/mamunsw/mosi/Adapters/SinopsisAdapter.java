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

    public SinopsisAdapter(Context context, List<Result> resultSinopsisList){
        this.context = context;
        this.resultSinopsisList = resultSinopsisList;
    }
    @NonNull
    @Override
    public SinopsisViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_sinopsis, viewGroup, false);
        return new SinopsisViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SinopsisViewHolder sinopsisViewHolder, int i) {
        Result resultSinopsis = resultSinopsisList.get(i);
        sinopsisViewHolder.txtJudul.setText(((Result) resultSinopsis).getJudulfilm());
        sinopsisViewHolder.txtGenre.setText(((Result) resultSinopsis).getGenrefilm());
        sinopsisViewHolder.txtDurasi.setText(((Result) resultSinopsis).getDurasifilm());
        Glide.with(context)
                .load(""+resultSinopsis.getGambarfilm())
                .apply(new RequestOptions().override(100,100).centerCrop())
                .into(sinopsisViewHolder.imgSinopsis);
        sinopsisViewHolder.setItem(resultSinopsisList);
    }

    @Override
    public int getItemCount() {
        return resultSinopsisList.size();
    }

}

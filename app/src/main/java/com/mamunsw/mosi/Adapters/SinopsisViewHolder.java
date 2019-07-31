package com.mamunsw.mosi.Adapters;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mamunsw.mosi.FullSinopsisActivity;
import com.mamunsw.mosi.Model.Result;
import com.mamunsw.mosi.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SinopsisViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.imgSinopsis)
    ImageView imgSinopsis;

    @BindView(R.id.txtJudul)
    TextView txtJudul;

    @BindView(R.id.txtGenre)
    TextView txtGenre;
    @BindView(R.id.txtDurasi)
    TextView txtDurasi;
    private List<Result> resultSinopsisList = new ArrayList<>();

    public SinopsisViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
    public void setItem(List<Result> item){
        resultSinopsisList = item;

    }
    @OnClick()
    void click(@NonNull View itemView){
        int posisiion = getAdapterPosition();
        String gambarff = resultSinopsisList.get(posisiion).getGambarfilm();
        String judulff = resultSinopsisList.get(posisiion).getJudulfilm();
        String genreff = resultSinopsisList.get(posisiion).getGenrefilm();
        String durasiff = resultSinopsisList.get(posisiion).getDurasifilm();
        String sinopsisff = resultSinopsisList.get(posisiion).getSinopsisfilm();



        Intent intent = new Intent(itemView.getContext(), FullSinopsisActivity.class);
        intent.putExtra("gambarff", gambarff);
        intent.putExtra("judulff", judulff);
        intent.putExtra("genreff", genreff);
        intent.putExtra("durasiff", durasiff);
        intent.putExtra("sinopsisff", sinopsisff);

        itemView.getContext().startActivity(intent);
    }
}

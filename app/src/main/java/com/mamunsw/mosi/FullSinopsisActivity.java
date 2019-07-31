package com.mamunsw.mosi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FullSinopsisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.full_sinopsis);

        ButterKnife.bind(this);

        String gambar_film = getIntent().getExtras().getString("gambarff");
        String judul_film = getIntent().getExtras().getString("judulff");
        String genre_film = getIntent().getExtras().getString("genreff");
        String sinopsis_film= getIntent().getExtras().getString("sinopsisff");
        String durasi_film = getIntent().getExtras().getString("durasiff");

        ImageView gambarf = (ImageView)findViewById(R.id.imgFullSinopsis);
        TextView judulf = (TextView)findViewById(R.id.txtJudulFilm);
        TextView genref = (TextView)findViewById(R.id.txtGenreFilm);
        TextView durasif = (TextView)findViewById(R.id.txtDurasiFilm);
        TextView sinopsisf = (TextView)findViewById(R.id.txtFullSinopsis);



        judulf.setText(judul_film);
        genref.setText(genre_film);
        durasif.setText(durasi_film);
        sinopsisf.setText(sinopsis_film);

        Glide.with(this)
                .load(""+gambar_film)
                .apply(new RequestOptions().override(100,100).centerCrop())
                .into(gambarf);
    }

    @OnClick(R.id.imgbtnArrow)
    public void back(){
        Intent in = new Intent(FullSinopsisActivity.this, MenuActivity.class);
        in.putExtra("source", "detail");
        startActivity(in);
    }
}

package com.example.enes.cinemaapp.activity.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.enes.cinemaapp.R;
import com.example.enes.cinemaapp.data.model.Cast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CastAdapter extends RecyclerView.Adapter<CastAdapter.MyCastHolder> {

    public Context context;
    public List<Cast> cList;

    public CastAdapter(Context context, List<Cast> cList) {
        this.context = context;
        this.cList = cList;
    }


    @NonNull
    @Override
    public MyCastHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cast_card, parent, false);

        return new MyCastHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCastHolder holder, int position) {
        Cast cast=cList.get(position);

        holder.tvCharacter.setText(cast.getCharacter());
        holder.tvName.setText(cast.getName());

        Glide.with(context).load(cast.getProfilePath()).into(holder.tvProfilePic);
    }

    @Override
    public int getItemCount() {
        return cList.size();
    }

    public class MyCastHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.person_character) TextView tvCharacter;
        @BindView(R.id.person_name) TextView tvName;
        @BindView(R.id.person_profile_pic) ImageView tvProfilePic;


        public MyCastHolder(View view) {
            super(view);
            ButterKnife.bind(this,view);
        }
    }
}

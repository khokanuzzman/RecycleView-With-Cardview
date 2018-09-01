package com.example.khokan.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.zip.Inflater;

/**
 * Created by USER on 9/1/2018.
 */

public class GithubAdapter extends RecyclerView.Adapter<GithubAdapter.GithubViewHolder> {

    private Context context;
    private User[] data;

    public GithubAdapter(Context context, User[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public GithubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.githum_user_list_design,parent,false);
        return new GithubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GithubViewHolder holder, int position) {
        User user = data[position];
        holder.userTitle.setText(user.getLogin());
        Glide.with(holder.userImage.getContext()).load(user.getAvatarUrl()).into(holder.userImage);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class GithubViewHolder extends RecyclerView.ViewHolder{
        ImageView userImage;
        TextView userTitle;


        public GithubViewHolder(View itemView) {
            super(itemView);

            userImage = itemView.findViewById(R.id.userImage);
            userTitle = itemView.findViewById(R.id.userTitle);

        }
    }
}

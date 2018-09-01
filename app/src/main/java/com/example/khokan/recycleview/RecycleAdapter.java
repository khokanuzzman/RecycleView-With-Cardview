package com.example.khokan.recycleview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by USER on 9/1/2018.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RecycleHolder> {

    private String[] data_title;
    private String[] data_desc;

    public RecycleAdapter(String[] title, String[] desc) {
        this.data_title = title;
        this.data_desc = desc;
    }

    @NonNull
    @Override
    public RecycleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_items,parent,false);

        return new RecycleHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleHolder holder, int position) {
            String title = data_title[position];
            String desc =  data_desc[position];

            holder.title.setText(title);
            holder.description.setText(desc);
    }

    @Override
    public int getItemCount() {
        return data_title.length;
    }

    public class RecycleHolder extends RecyclerView.ViewHolder{

        private TextView title,description;
        public RecycleHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.cardtitle);
            description=itemView.findViewById(R.id.description);
        }
    }
}

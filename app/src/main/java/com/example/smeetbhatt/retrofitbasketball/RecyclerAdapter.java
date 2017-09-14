package com.example.smeetbhatt.retrofitbasketball;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by smeetbhatt on 12/09/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Basketball> basketball;
    private Context context;

    public RecyclerAdapter(List<Basketball> basketball, Context context) {
        this.basketball = basketball;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.raw_layout,parent,false);

            return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.Name.setText(basketball.get(position).getName());
        holder.Rank.setText(Integer.toString(basketball.get(position).getRank()));
        Glide.with(context).load(ApiClient.BASE_URL+basketball.get(position).getImage_path()).into(holder.img);


    }

    @Override
    public int getItemCount() {
        return basketball.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView Name;
        TextView Rank;

        public MyViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            Name = (TextView) itemView.findViewById(R.id.name);
            Rank = (TextView) itemView.findViewById(R.id.rank);

        }
    }
}

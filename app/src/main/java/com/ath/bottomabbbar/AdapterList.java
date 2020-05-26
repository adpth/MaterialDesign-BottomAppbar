package com.ath.bottomabbbar;

import android.content.Context;
import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.AdapterListHolder> {

    private Context context;
    private List<Modal> list;

    public AdapterList(Context context, List<Modal> list)
    {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public AdapterListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.listview,parent,false);
        return new AdapterListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterListHolder holder, final int position) {
        holder.pinfo.setText(list.get(position).getInfo());
        holder.pname.setText(list.get(position).getTitle());
        holder.img.setImageResource(list.get(position).getImage());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),DetailActivity.class);
                intent.putExtra("info",list.get(position).getInfo());
                intent.putExtra("name",list.get(position).getTitle());
                intent.putExtra("image",list.get(position).getImage());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class AdapterListHolder extends RecyclerView.ViewHolder {

        TextView pname;
        TextView pinfo;
        ImageView img;
        LinearLayout linearLayout;

        public AdapterListHolder(@NonNull View itemView) {
            super(itemView);

            pname = itemView.findViewById(R.id.name);
            pinfo = itemView.findViewById(R.id.info);
            img = itemView.findViewById(R.id.image);
            linearLayout = itemView.findViewById(R.id.LinearLayout);

        }

    }
}

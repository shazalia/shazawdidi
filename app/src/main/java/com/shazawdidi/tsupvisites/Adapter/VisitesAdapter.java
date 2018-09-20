package com.shazawdidi.tsupvisites.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.shazawdidi.tsupvisites.R;
import com.shazawdidi.tsupvisites.model.Visites;

import java.util.List;

public class VisitesAdapter extends RecyclerView.Adapter<VisitesAdapter.VisitesViewHolder> {

    private List<Visites> visites;
    private int rowLayout;
    private Context context;


    public static class VisitesViewHolder extends RecyclerView.ViewHolder {
        LinearLayout visitesLayout;
        TextView visitTitle;
        TextView VisitDate;
        TextView description;
        TextView TicketNo;


        public VisitesViewHolder(View v) {
            super(v);
            visitesLayout = v.findViewById( R.id.visites_layout);
            visitTitle = v.findViewById(R.id.visitTitle);
            VisitDate = v.findViewById(R.id.VisitDate);
            description = v.findViewById(R.id.description);
            TicketNo = v.findViewById(R.id.TicketNo);
        }
    }

    public VisitesAdapter(List<Visites> movies, int rowLayout, Context context) {
        this.visites = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @NonNull
    @Override
    public VisitesAdapter.VisitesViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new VisitesViewHolder(view);
    }


    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull VisitesViewHolder holder, final int position) {
        holder.visitTitle.setText(visites.get(position).getVisitTitle());
        holder.VisitDate.setText(visites.get(position).getVisitDate());
        holder.description.setText(visites.get(position).getDescription());
        holder.TicketNo.setText(visites.get(position).getTicketNo().toString());
    }

    @Override
    public int getItemCount() {
        return visites.size();
    }
}
package com.wow.diseasediagnosis.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.wow.diseasediagnosis.R;
import com.wow.diseasediagnosis.model.Disease;

import java.util.ArrayList;

public class DiseaseAdapter extends RecyclerView.Adapter<DiseaseAdapter.ViewHolder> {
    private ArrayList<Disease> mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ViewHolder(TextView tv) {
            super(tv);
            textView = tv;
        }
    }

    public DiseaseAdapter() {
        mDataSet = new ArrayList<>();
    }

    public void setDataSet(ArrayList<Disease> dataSet) {
        mDataSet = dataSet;
        notifyDataSetChanged();
    }

    @Override
    public DiseaseAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.disease_view, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int i) {
        holder.textView.setText(mDataSet.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}

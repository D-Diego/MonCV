package com.example.mon_cv_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ProjetBaseAdapter extends BaseAdapter {
    private ArrayList<Projet> projets;
    private Context context;

    public ProjetBaseAdapter(ArrayList<Projet> projets,  Context context) {
            this.projets = projets;
            this.context = context;
    }

    @Override
    public int getCount() {
        return projets.size();
    }

    @Override
    public Object getItem(int position) {
        return projets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.item_projet, parent, false);
        }
        TextView textViewProjetNom= convertView.findViewById(R.id.textViewProjetNom);
        textViewProjetNom.setText(projets.get(position).getNomProjet());

        TextView textViewProjetDescription= convertView.findViewById(R.id.textViewProjetDescription);
        textViewProjetDescription.setText(projets.get(position).getDescriptionProjet());

        return convertView;
    }
}

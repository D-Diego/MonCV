package com.example.mon_cv_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.ConversationAction;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class LangageBaseAdapter extends BaseAdapter {
    private ArrayList<Langages> langages;
    private Context context;

    public LangageBaseAdapter(ArrayList<Langages> langages, Context context){
        this.langages = langages;
        this.context = context;
    }
    @Override
    public int getCount() {
        return langages.size();
    }

    @Override
    public Object getItem(int position) {
        return langages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_langages, parent, false);
        }
        TextView textViewMyLangage= convertView.findViewById(R.id.textViewMyLangage);
        textViewMyLangage.setText(langages.get(position).getLangages());

        RatingBar ratingBarMylangage= convertView.findViewById(R.id.ratingBarMylangage);
        ratingBarMylangage.setRating(langages.get(position).getRatingLangages());
        return convertView;
    }
}

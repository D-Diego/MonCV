package com.example.mon_cv_app;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CompetenceActivity extends AppCompatActivity {
     public void onCreate (Bundle saveInstancesState) {
         super.onCreate(saveInstancesState);
         setContentView(R.layout.page_competence);

         ArrayList<Langages> langages = new ArrayList<>();
        langages.add(new Langages("HTML  ", 3F));
        langages.add(new Langages("CSS", 3f));
        langages.add(new Langages("PHP", 3F));
        langages.add(new Langages("Java", 2F));
        langages.add(new Langages("SQL", 4F));

         ListView ListViewMyLangage= findViewById(R.id.ListViewMyLangage);
         LangageBaseAdapter langageadapter = new LangageBaseAdapter(langages, this);
         ListViewMyLangage.setAdapter(langageadapter);

         ArrayList<Projet> projets = new ArrayList<>();
         projets.add(new Projet("monCv", "https://github.com/D-Diego", "Mon CV en JAVA ANDROID"));

         ListView ListViewMyProjet= findViewById(R.id.ListViewMyProjet);
         ProjetBaseAdapter projetadapter = new ProjetBaseAdapter(projets, this);
         ListViewMyProjet.setAdapter(projetadapter);
     }

}

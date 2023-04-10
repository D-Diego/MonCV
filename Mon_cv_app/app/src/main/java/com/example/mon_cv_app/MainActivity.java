package com.example.mon_cv_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ArrayList<Experience> experiences = new ArrayList<Experience>();
        experiences.add(new Experience("Décembre 2021",
                "Aujourd'hui", "AGECA",
                "Dévelopeur web"));
        experiences.add(new Experience("Février 2017",
                "Mai 2017", "Studio du Regard",
                "Assistant Ingénieur son"));
        experiences.add(new Experience("Novembre 2016",
                "Décembre 2016", "Aligre FM",
                "Assistant Animation Radio"));
        experiences.add(new Experience("Mai 2015",
                "Mai 2015", "Pharmacie",
                "Assistant Pharmacie"));

        ListView listViewExperiences = findViewById(R.id.listViewExperiences);
        ExperienceBaseAdapter adapter = new ExperienceBaseAdapter(experiences, this);
        listViewExperiences.setAdapter(adapter);


        ArrayList<Formation> formations = new ArrayList<Formation>();
        formations.add(new Formation("2023 ",
                "Licence Concepteur Développeur d'Application",
                "CFA INSTA, Paris 2eme"
        ));
        formations.add(new Formation("2022",
                "BTS Services Informatiques aux Organisations ",
                "CFA Insta, Paris 2eme"
        ));
        formations.add(new Formation("2019",
                "Bac pro Systeme Numérique",
                "Lycée Gustave Ferrier, Paris 10eme"
        ));
        ListView listViewFormations = findViewById(R.id.listViewFormations);
        FormationBaseAdapter formationAdapter = new FormationBaseAdapter(formations, this);
        listViewFormations.setAdapter(formationAdapter);

        Button next = (Button) findViewById(R.id.buttonCompetence);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), CompetenceActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }



}
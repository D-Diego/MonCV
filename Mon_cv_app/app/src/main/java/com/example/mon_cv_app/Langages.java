package com.example.mon_cv_app;

public class Langages {
    private String Langages ;
    private float RatingLangages;

    public Langages(String langages, Float ratingLangages) {
        Langages = langages;
        RatingLangages =ratingLangages;
    }

    public String getLangages() {
        return Langages;
    }

    public void setLangages(String langages) {
        Langages = langages;
    }

    public float getRatingLangages() {
        return RatingLangages;
    }

    public void setRatingLangages(float ratingLangages) {
        RatingLangages = ratingLangages;
    }
}

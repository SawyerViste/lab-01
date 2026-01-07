package com.example.PetShop;

import java.util.Date;

public abstract class Mood {
    private Date moodDate;

    public Mood(){
        this.moodDate = new Date();
    }

    public Mood(Date moodDate){
        this.moodDate = moodDate;
    }

    public abstract String whatMood();

    public Date getMoodDate() {
        return moodDate;
    }

    public void setMoodDate(Date moodDate) {
        this.moodDate = moodDate;
    }
}

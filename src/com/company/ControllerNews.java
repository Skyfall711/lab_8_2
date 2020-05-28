package com.company;

import java.util.Calendar;

public class ControllerNews {
    private News [] arrayNews;
    public void view(int id){
        System.out.println("Title: " + this.arrayNews[id].getNews());
        System.out.println("Creation date: " + this.arrayNews[id].getDateCreation().get(Calendar.DAY_OF_MONTH) + "." +
                this.arrayNews[id].getDateCreation().get(Calendar.MONTH) + "." +
                this.arrayNews[id].getDateCreation().get(Calendar.YEAR) + " " +
                this.arrayNews[id].getDateCreation().get(Calendar.HOUR) + ": " +
                this.arrayNews[id].getDateCreation().get(Calendar.MINUTE) + ": " +
                this.arrayNews[id].getDateCreation().get(Calendar.SECOND) + ": " +
                this.arrayNews[id].getDateCreation().get(Calendar.MILLISECOND)
        );

        System.out.println("Change date: " + this.arrayNews[id].getDateChange().get(Calendar.DAY_OF_MONTH) + "." +
                this.arrayNews[id].getDateChange().get(Calendar.MONTH) + "." +
                this.arrayNews[id].getDateChange().get(Calendar.YEAR) + " " +
                this.arrayNews[id].getDateChange().get(Calendar.HOUR) + ": " +
                this.arrayNews[id].getDateChange().get(Calendar.MINUTE) + ": " +
                this.arrayNews[id].getDateChange().get(Calendar.SECOND) + ": " +
                this.arrayNews[id].getDateChange().get(Calendar.MILLISECOND)
        );
    }
    public void edit(int id, String title){
        this.arrayNews[id].changeNews(title);
        this.view(id);
    }
    ControllerNews(News [] arrayNews){
        this.arrayNews = arrayNews;
    }
}

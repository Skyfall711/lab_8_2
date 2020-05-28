package com.company;
import java.util.StringTokenizer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        News[] news = new News[5];
        for(int i = 0;i<news.length;i++){
            news[0] = new News("New News " + i);
            news[1] = new News("New News " + i);
            news[2] = new News("New News " + i);
            news[3] = new News("New News " + i);
            news[4] = new News("New News " + i);
        }

        ControllerNews controllnews = new ControllerNews(news);

        String[] path = {"edit/1","edit/1","view/1"};

        for(String s: path) {
            StringTokenizer st = new StringTokenizer(s, " /");
            if(st.nextToken().toString().equals("view")){
                controllnews.view(Integer.parseInt(st.nextToken()));
            }else{
                controllnews.edit(Integer.parseInt(st.nextToken()),new Scanner(System.in).next());
            }
        }
    }

}


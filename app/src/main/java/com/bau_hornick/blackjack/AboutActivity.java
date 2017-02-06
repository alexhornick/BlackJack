package com.bau_hornick.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        String aboutPage = "<html><body>"
                +"<h2>About BlackJack</h2>"
                +"<p>The objective of BlackJack is simple. Aim for a score of 21, known as a 'BlackJack', in order" +
                " to beat the dealer. At any point, you may 'stand' if you feel that your score is high enough" +
                " to win. If you beat the dealer, you win the bet made at the beginning of the game. Enjoy the game!</p>"
                +"<br><h3>Image Credits</h3>"
                +"<p><b>Source: </b>nicubunu<br>"
                +"<b>Creator:</b> Nicu Buculei<br>"
                +"<b>Link: <a href='https://openclipart.org/search/?query=white%20deck&page=2'>"
                +"https://openclipart.org/search/?query=white%20deck&page=2</a></b><br>"
                +"<b>License:</b> CC BY 3.0"
                +"</p><br>"
                +"BlackJack Logo Made with <a href=\"http://logomakr.com\" title=\"Logo Maker\">Logo Maker</a>"
                + "</body></html>";

        WebView wv = (WebView) findViewById(R.id.about_page);
        wv.loadData(aboutPage, "text/html", "UTF-8");

    }
}
package com.kaisblog.de;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Website extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);

        Button todoist = findViewById(R.id.btn_web_todoist);
        Button todoist_help = findViewById(R.id.btn_web_todoist_help);
        Button twist = findViewById(R.id.btn_web_twist);
        Button evernote = findViewById(R.id.btn_web_evernote);
        Button gdrive = findViewById(R.id.btn_web_gdrive);
        Button toggl = findViewById(R.id.btn_web_toggl);

        todoist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.todoist.com"));
                startActivity(browserIntent);
            }
        });

        todoist_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://get.todoist.help/hc/de"));
                startActivity(browserIntent);
            }
        });

        twist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twist.com/de"));
                startActivity(browserIntent);
            }
        });

        evernote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.evernote.com"));
                startActivity(browserIntent);
            }
        });

        gdrive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com"));
                startActivity(browserIntent);
            }
        });

        toggl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.toggl.com"));
                startActivity(browserIntent);
            }
        });

    }



}

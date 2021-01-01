package com.kaisblog.de;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Anwendungen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anwendungen);

        Button asana = findViewById(R.id.btn_app_asana);
        Button sharepoint = findViewById(R.id.btn_app_sharepoint);
        Button m365 = findViewById(R.id.btn_app_m365);
        Button onenote = findViewById(R.id.btn_app_onenote);
        Button toggl = findViewById(R.id.btn_app_toggl);

        asana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("com.asana.app");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.asana.app"));
                    startActivity(intent);
                }

            }
        });

        sharepoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("com.microsoft.sharepoint");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.microsoft.sharepoint"));
                    startActivity(intent);
                }
            }
        });

        onenote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("com.microsoft.office.onenote");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.microsoft.office.onenote"));
                    startActivity(intent);
                }
            }
        });

        m365.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("com.microsoft.office.officehubrow");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.microsoft.office.officehubrow"));
                    startActivity(intent);
                }
            }
        });

        toggl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                PackageManager manager = getPackageManager();
                try {
                    i = manager.getLaunchIntentForPackage("com.toggl.giskard");
                    if (i == null)
                        throw new PackageManager.NameNotFoundException();
                    i.addCategory(Intent.CATEGORY_LAUNCHER);
                    startActivity(i);
                } catch (PackageManager.NameNotFoundException e) {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.toggl.giskard"));
                    startActivity(intent);
                }
            }
        });

    }

}

In MainAcitivty.xml

Button zur Verfügung stellen
  Button darkmode = findViewById(R.id.darkmode);

Eintrag für Darkmode
        darkmode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });

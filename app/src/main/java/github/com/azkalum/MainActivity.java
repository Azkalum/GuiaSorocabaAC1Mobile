package github.com.azkalum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonDetailsIguatemi = findViewById(R.id.saibaMaisButtonIguatemi);

        buttonDetailsIguatemi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailsActivyIguatemi.class);
                startActivity(intent);
            }
        });

        Button buttonDetailsKasato = findViewById(R.id.saibaMaisButtonKasato);

        buttonDetailsKasato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivyKasato.class);
                startActivity(intent);
            }
        });

        Button buttonDetailsZoo = findViewById(R.id.saibaMaisButtonZoo);

        buttonDetailsKasato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailsActivyKasato.class);
                startActivity(intent);
            }
        });


    }

}
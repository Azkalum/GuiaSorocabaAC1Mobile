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

    }

    public void botaoZoo(View view) {
        Intent intent = new Intent(this, ZooActivity.class);
        startActivity(intent);
    }

    public void botaoIguatemi(View view) {
        Intent intent = new Intent(this, IguatemiActivity.class);
        startActivity(intent);
    }

    public void botaoKasato(View view) {
        Intent intent = new Intent(this, KasatoActivity.class);
        startActivity(intent);
    }

}
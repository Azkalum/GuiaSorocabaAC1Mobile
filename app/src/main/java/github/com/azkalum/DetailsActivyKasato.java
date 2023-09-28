package github.com.azkalum;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivyKasato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kasato);

        Button buttonMenuPrincipal = findViewById(R.id.buttonMenuPrincipal);

        buttonMenuPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivyKasato.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void openMap(View view) {
        String latitude = "-23.51623147443586";
        String longitude = "-47.46469001688612";

        String uri = "geo:" + latitude + "," + longitude;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }

    public void openSite(View view) {
        String url = "https://agendasorocaba.com.br/parque-kasato-maru/";

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void makeCall(View view) {
        String phoneNumber = "(15) 3233-0561";

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(intent);
    }

}

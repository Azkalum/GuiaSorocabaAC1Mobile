package github.com.azkalum;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.View;


public class IguatemiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_iguatemi);
    }

    public void openMap(View view) {
        Uri uri = Uri.parse("geo:0,0?q=Shoppinh+Iguatemi+Esplanada");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openSite(View view) {
        Uri uri = Uri.parse("https://iguatemi.com.br/esplanada/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void makeCall(View view) {
        Uri uri = Uri.parse("tel:"+"1530421400");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        int permissionCheck = ContextCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.CALL_PHONE},1);
            startActivity(intent);
        } else {
            startActivity(intent);
        }
    }

    public void voltarPag(View view) {
        finish();
    }

}

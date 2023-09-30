package github.com.azkalum;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class KasatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_iguatemi);
    }

    public void openMap(View view) {
        Uri uri = Uri.parse("geo:0,0?q=Parque+Kasato+Maru");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openSite(View view) {
        Uri uri = Uri.parse("https://turismo.sorocaba.sp.gov.br/visite/parque-kasato-maru/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void makeCall(View view) {
        Uri uri = Uri.parse("tel:"+"1532330561");
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

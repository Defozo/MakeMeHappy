package eu.makemehappy.makemehappy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

/**
 * Created by Defozo on 21.01.2017.
 */

public class FixActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fix);
    }

    public void getFix(View view) {
        Intent intent = new Intent(getApplicationContext(), ListActivity.class);
        intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}

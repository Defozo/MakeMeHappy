package eu.makemehappy.makemehappy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import eu.makemehappy.makemehappy.FaceActivity;
import eu.makemehappy.makemehappy.R;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

/**
 * Created by Defozo on 21.01.2017.
 */

public class MainActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void runFaceActivity(View view) {
        Intent intent = new Intent(this, FaceActivity.class);
        startActivity(intent);
    }

}

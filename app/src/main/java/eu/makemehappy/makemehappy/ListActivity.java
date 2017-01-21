package eu.makemehappy.makemehappy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

/**
 * Created by Defozo on 21.01.2017.
 */

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void playMusic(View view) {
        Uri selectedUri = Uri.parse(Environment.getExternalStorageDirectory() + "/happyMusic/");
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(selectedUri, "resource/folder");
        intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

}

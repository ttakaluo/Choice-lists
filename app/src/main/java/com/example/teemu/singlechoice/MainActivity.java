package com.example.teemu.singlechoice;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selectDifficulty(View v){
        SingleChoiceClass my_dialog = new SingleChoiceClass();
        my_dialog.show(getSupportFragmentManager(), "my_dialog");
    }
    public void selectColor(View v){
        MultiChoiceClass my_dialog2 = new MultiChoiceClass();
        my_dialog2.show(getSupportFragmentManager(), "my_dialog2");
    }
}

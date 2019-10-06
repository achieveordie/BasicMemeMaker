package com.example.basicmememaker;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
implements  TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createClick(String top, String bottom) {
        BottomPictureFragment bottomFragment = (BottomPictureFragment) getSupportFragmentManager().findFragmentById(R.id.bottomFragment);
        bottomFragment.setOnclickedText(top, bottom);
    }

}

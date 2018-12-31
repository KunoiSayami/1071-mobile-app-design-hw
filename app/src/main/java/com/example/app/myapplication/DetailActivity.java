package com.example.app.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.widget.Spinner;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        this.initSpinner();
    }

    private void initSpinner() {
        //http://givemepass.blogspot.com/2011/11/spinner.html
    }
}

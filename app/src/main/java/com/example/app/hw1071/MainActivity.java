package com.example.app.hw1071;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    Button bt_confirm;
    private void init(){
        bt_confirm = findViewById(R.id.bt_search_food);
        bt_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this , DetailActivity.class);
                startActivity(intent);
            }
        });
    }
}

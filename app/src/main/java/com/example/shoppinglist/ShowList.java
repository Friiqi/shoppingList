package com.example.shoppinglist;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ShowList extends AppCompatActivity {

    TextView tView;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tView = findViewById(R.id.txtView);
        Intent i = getIntent();
        ArrayList arList =  getIntent().getParcelableArrayListExtra("data");

        for (Object o : arList) {
            tView.append(o.toString()+"\n");
        }
    }


    public void backToMain(View v) {
        /*
        Intent openMain = new Intent(this, MainActivity.class);

        startActivity(openMain);
        */
        finish();

    }
}

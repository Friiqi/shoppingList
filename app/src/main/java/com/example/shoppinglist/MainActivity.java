package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    ArrayList arList = new ArrayList();
    EditText eText = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         arList = new ArrayList();
         eText =  findViewById(R.id.txtEdit);
    }

    public void saveText(View v) {

        if (eText.getText().length() < 3){
           Toast err = Toast.makeText(this, "Need more letters", LENGTH_SHORT);
           err.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 100);
           err.show();
        }
       else {
            Toast add =  Toast.makeText(this, "Adding to list...", LENGTH_SHORT);
            add.setGravity(Gravity.TOP| Gravity.CENTER_HORIZONTAL, 0, 100);
            add.show();

           arList.add(eText.getText().toString());
           eText.getText().clear();
        }

    }

    public void openShowList(View v){

        Intent openList = new Intent(this, ShowList.class);
        openList.putExtra("data", arList);
        startActivity(openList);
    }
}

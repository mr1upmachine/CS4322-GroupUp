package com.example.seanh.groupup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textDisplayUser = (TextView) findViewById(R.id.textDisplayUser);
        textDisplayUser.setText(user.getEmail());

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Event event = new Event("name","desc","URL",0.0,1.1);
                //Database.recordNewEvent(event);

                Log.d("OUTPUT", Database.getEventById(1).toString());
            }
        });
    }
}

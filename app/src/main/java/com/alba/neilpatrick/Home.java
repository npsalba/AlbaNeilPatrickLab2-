package com.alba.neilpatrick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button button_linear = (Button)findViewById(R.id.button_linear);
        button_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveLinear = new Intent(getApplicationContext(), Linear.class);

                startActivity(moveLinear);
            }
        });

        Button button_relative = (Button)findViewById(R.id.button_relative);
        button_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveRelative = new Intent(getApplicationContext(), Relative.class);

                startActivity(moveRelative);
            }
        });

        Button button_constraint = (Button)findViewById(R.id.button_constraint);
        button_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveConstraint = new Intent(getApplicationContext(), Constraint.class);

                startActivity(moveConstraint);
            }
        });
    }
}

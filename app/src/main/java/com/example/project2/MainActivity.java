package com.example.project2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements OnButtonPressListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonPressListener(String msg) {
        Fragment2 frag2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        frag2.onFragmentInteraction(msg);
    }
}

package com.example.project2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity implements OnButtonPressListener,OnCheckboxClickedListner,ButtonManager {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Fragment2())
                .commit();
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onButtonPressListener(String msg) {
        Fragment2 frag2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.container);
        frag2.onFragmentInteraction(msg);
    }


    @Override
    public void onCheckboxClicked(String msg) {

        if (msg.equals("gallery"))
        {
            Fragment Fragment4=new Fragment4();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Fragment4)
                    .commit();
        }
        if (msg.equals("slideshow")) {
            Fragment Fragment3 = new Fragment3();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Fragment3)
                    .commit();


        }
        if (msg.equals("generic"))
        {
            Fragment Fragment2=new Fragment2();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Fragment2)
                    .commit();
        }
    }

    @Override
    public void statusChange(String msg) {
        Fragment1 fragment1=(Fragment1)getSupportFragmentManager().findFragmentById(R.id.fragment);
        fragment1.onFragmentInteraction(msg);

    }
}


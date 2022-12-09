package com.edu.share.designsh;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class AddCardActivity extends AppCompatActivity {

    TextView btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        btn_back = (TextView) findViewById(R.id.add_card_back);

        FragmentManager fm = getFragmentManager();

// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        Fragment fragment = new ListFragment();
        try{
            fragmentTransaction.replace(R.id.frameLayout, fragment);
        }catch(Exception e) {
            Log.e("error", e.getMessage());
        }

        fragmentTransaction.commit(); // save the changes

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}
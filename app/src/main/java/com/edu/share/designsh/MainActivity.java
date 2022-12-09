package com.edu.share.designsh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn_register;
    ImageView img_verify;
    ImageView img_display_id;
    ImageView img_approve_age;
    ImageView img_add_card;
    ImageView img_display_card;
    ImageView img_setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_register = (Button) findViewById(R.id.btn_register);
        img_verify = (ImageView) findViewById(R.id.id_verify);
        img_display_id = (ImageView) findViewById(R.id.id_display_id);
        img_display_card = (ImageView) findViewById(R.id.id_display_card);
        img_approve_age = (ImageView) findViewById(R.id.id_approve_age);
        img_add_card = (ImageView) findViewById(R.id.id_add_card);
        img_setting = (ImageView) findViewById(R.id.id_setting);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MessageActivity.class);
                startActivity(i);
            }
        });

        img_display_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), License.class);
                startActivity(i);
            }
        });

        img_add_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), AddCardActivity.class);
                startActivity(i);
            }
        });

        img_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(i);
            }
        });
    }
}

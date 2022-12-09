package com.edu.share.designsh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PinActivity extends AppCompatActivity {

    TextView box_num1;
    TextView box_num2;
    TextView box_num3;
    TextView box_num4;

    TextView key_num1;
    TextView key_num2;
    TextView key_num3;
    TextView key_num4;
    TextView key_num5;
    TextView key_num6;
    TextView key_num7;
    TextView key_num8;
    TextView key_num9;
    TextView key_num0;

    Button btn_ok;
    int boxCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
        box_num1 = (TextView) findViewById(R.id.box_num1);
        box_num2 = (TextView) findViewById(R.id.box_num2);
        box_num3 = (TextView) findViewById(R.id.box_num3);
        box_num4 = (TextView) findViewById(R.id.box_num4);

        key_num0 = (TextView) findViewById(R.id.key_num0);
        key_num1 = (TextView) findViewById(R.id.key_num1);
        key_num2 = (TextView) findViewById(R.id.key_num2);
        key_num3 = (TextView) findViewById(R.id.key_num3);
        key_num4 = (TextView) findViewById(R.id.key_num4);
        key_num5 = (TextView) findViewById(R.id.key_num5);
        key_num6 = (TextView) findViewById(R.id.key_num6);
        key_num7 = (TextView) findViewById(R.id.key_num7);
        key_num8 = (TextView) findViewById(R.id.key_num8);
        key_num9 = (TextView) findViewById(R.id.key_num9);

        btn_ok = (Button) findViewById(R.id.button_pin_ok);

        key_num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boxCount == 0) {
                    box_num1.setTextColor(getResources().getColor(R.color.primary));
                    box_num1.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num1.setText("1");
                    boxCount ++;
                } else if(boxCount == 1) {
                    box_num2.setTextColor(getResources().getColor(R.color.primary));
                    box_num2.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num2.setText("1");
                    boxCount ++;
                }else if(boxCount == 2) {
                    box_num3.setTextColor(getResources().getColor(R.color.primary));
                    box_num3.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num3.setText("1");
                    boxCount ++;
                }else if(boxCount == 3) {
                    box_num4.setTextColor(getResources().getColor(R.color.primary));
                    box_num4.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num4.setText("1");
                    boxCount ++;
                }
            }
        });

        key_num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boxCount == 0) {
                    box_num1.setTextColor(getResources().getColor(R.color.primary));
                    box_num1.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num1.setText("2");
                    boxCount ++;
                } else if(boxCount == 1) {
                    box_num2.setTextColor(getResources().getColor(R.color.primary));
                    box_num2.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num2.setText("2");
                    boxCount ++;
                }else if(boxCount == 2) {
                    box_num3.setTextColor(getResources().getColor(R.color.primary));
                    box_num3.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num3.setText("2");
                    boxCount ++;
                }else if(boxCount == 3) {
                    box_num4.setTextColor(getResources().getColor(R.color.primary));
                    box_num4.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num4.setText("2");
                    boxCount ++;
                }
            }
        });

        key_num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boxCount == 0) {
                    box_num1.setTextColor(getResources().getColor(R.color.primary));
                    box_num1.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num1.setText("3");
                    boxCount ++;
                } else if(boxCount == 1) {
                    box_num2.setTextColor(getResources().getColor(R.color.primary));
                    box_num2.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num2.setText("3");
                    boxCount ++;
                }else if(boxCount == 2) {
                    box_num3.setTextColor(getResources().getColor(R.color.primary));
                    box_num3.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num3.setText("3");
                    boxCount ++;
                }else if(boxCount == 3) {
                    box_num4.setTextColor(getResources().getColor(R.color.primary));
                    box_num4.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num4.setText("3");
                    boxCount ++;
                }
            }
        });

        key_num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boxCount == 0) {
                    box_num1.setTextColor(getResources().getColor(R.color.primary));
                    box_num1.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num1.setText("4");
                    boxCount ++;
                } else if(boxCount == 1) {
                    box_num2.setTextColor(getResources().getColor(R.color.primary));
                    box_num2.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num2.setText("4");
                    boxCount ++;
                }else if(boxCount == 2) {
                    box_num3.setTextColor(getResources().getColor(R.color.primary));
                    box_num3.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num3.setText("4");
                    boxCount ++;
                }else if(boxCount == 3) {
                    box_num4.setTextColor(getResources().getColor(R.color.primary));
                    box_num4.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num4.setText("4");
                    boxCount ++;
                }
            }
        });

        key_num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boxCount == 0) {
                    box_num1.setTextColor(getResources().getColor(R.color.primary));
                    box_num1.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num1.setText("5");
                    boxCount ++;
                } else if(boxCount == 1) {
                    box_num2.setTextColor(getResources().getColor(R.color.primary));
                    box_num2.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num2.setText("5");
                    boxCount ++;
                }else if(boxCount == 2) {
                    box_num3.setTextColor(getResources().getColor(R.color.primary));
                    box_num3.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num3.setText("5");
                    boxCount ++;
                }else if(boxCount == 3) {
                    box_num4.setTextColor(getResources().getColor(R.color.primary));
                    box_num4.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num4.setText("5");
                    boxCount ++;
                }
            }
        });

        key_num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boxCount == 0) {
                    box_num1.setTextColor(getResources().getColor(R.color.primary));
                    box_num1.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num1.setText("6");
                    boxCount ++;
                } else if(boxCount == 1) {
                    box_num2.setTextColor(getResources().getColor(R.color.primary));
                    box_num2.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num2.setText("6");
                    boxCount ++;
                }else if(boxCount == 2) {
                    box_num3.setTextColor(getResources().getColor(R.color.primary));
                    box_num3.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num3.setText("6");
                    boxCount ++;
                }else if(boxCount == 3) {
                    box_num4.setTextColor(getResources().getColor(R.color.primary));
                    box_num4.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num4.setText("6");
                    boxCount ++;
                }
            }
        });

        key_num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boxCount == 0) {
                    box_num1.setTextColor(getResources().getColor(R.color.primary));
                    box_num1.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num1.setText("7");
                    boxCount ++;
                } else if(boxCount == 1) {
                    box_num2.setTextColor(getResources().getColor(R.color.primary));
                    box_num2.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num2.setText("7");
                    boxCount ++;
                }else if(boxCount == 2) {
                    box_num3.setTextColor(getResources().getColor(R.color.primary));
                    box_num3.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num3.setText("7");
                    boxCount ++;
                }else if(boxCount == 3) {
                    box_num4.setTextColor(getResources().getColor(R.color.primary));
                    box_num4.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num4.setText("7");
                    boxCount ++;
                }
            }
        });

        key_num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boxCount == 0) {
                    box_num1.setTextColor(getResources().getColor(R.color.primary));
                    box_num1.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num1.setText("8");
                    boxCount ++;
                } else if(boxCount == 1) {
                    box_num2.setTextColor(getResources().getColor(R.color.primary));
                    box_num2.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num2.setText("8");
                    boxCount ++;
                }else if(boxCount == 2) {
                    box_num3.setTextColor(getResources().getColor(R.color.primary));
                    box_num3.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num3.setText("8");
                    boxCount ++;
                }else if(boxCount == 3) {
                    box_num4.setTextColor(getResources().getColor(R.color.primary));
                    box_num4.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num4.setText("8");
                    boxCount ++;
                }
            }
        });

        key_num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boxCount == 0) {
                    box_num1.setTextColor(getResources().getColor(R.color.primary));
                    box_num1.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num1.setText("9");
                    boxCount ++;
                } else if(boxCount == 1) {
                    box_num2.setTextColor(getResources().getColor(R.color.primary));
                    box_num2.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num2.setText("9");
                    boxCount ++;
                }else if(boxCount == 2) {
                    box_num3.setTextColor(getResources().getColor(R.color.primary));
                    box_num3.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num3.setText("9");
                    boxCount ++;
                }else if(boxCount == 3) {
                    box_num4.setTextColor(getResources().getColor(R.color.primary));
                    box_num4.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num4.setText("9");
                    boxCount ++;
                }
            }
        });

        key_num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boxCount == 0) {
                    box_num1.setTextColor(getResources().getColor(R.color.primary));
                    box_num1.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num1.setText("0");
                    boxCount ++;
                } else if(boxCount == 1) {
                    box_num2.setTextColor(getResources().getColor(R.color.primary));
                    box_num2.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num2.setText("0");
                    boxCount ++;
                }else if(boxCount == 2) {
                    box_num3.setTextColor(getResources().getColor(R.color.primary));
                    box_num3.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num3.setText("0");
                    boxCount ++;
                }else if(boxCount == 3) {
                    box_num4.setTextColor(getResources().getColor(R.color.primary));
                    box_num4.setBackground(getResources().getDrawable(R.drawable.xml_change_textview_color));
                    box_num4.setText("0");
                    boxCount ++;
                }
            }
        });

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(boxCount < 3) {
                    AlertDialog alertDialog = new AlertDialog.Builder(PinActivity.this).create();
                    alertDialog.setTitle("Error");
                    alertDialog.setMessage(getResources().getString(R.string.dialog_pin_error_message));
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }else {
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }
}
package com.edu.share.designsh;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.edu.share.designsh.utils.DateFormat;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class License extends AppCompatActivity {

    ImageView qrImageView;
    TextView dateTextView;
    TextView timeTextView;
    DateFormat format = new DateFormat();
    TextView btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_license);
        WindowManager manager = (WindowManager) getSystemService(WINDOW_SERVICE);

        btn_back = (TextView) findViewById(R.id.license_back);


//        Animation fadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out);
//        ImageView backgroundView = (ImageView) findViewById(R.id.id_background);
//
//        fadeOut.setRepeatCount(500000);
//        fadeOut.setRepeatMode(Animation.RESTART);
//
//        fadeOut.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
////                Animation fadeOut = AnimationUtils.loadAnimation(License.this, R.anim.fade_out);
////                backgroundView.startAnimation(fadeOut);
//                Log.d("MY_TAG", "Animation Started!!!");
//            }
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                Animation fadeIn = AnimationUtils.loadAnimation(License.this, R.anim.fade_in);
//                fadeIn.setAnimationListener(new Animation.AnimationListener() {
//                    @Override public void onAnimationStart(Animation animation) {}
//                    @Override public void onAnimationRepeat(Animation animation) {}
//                    @Override public void onAnimationEnd(Animation animation) {
//                        backgroundView.startAnimation(fadeOut);
//                    }
//                });
//                backgroundView.startAnimation(fadeIn);
//                Log.d("MY_TAG", "Animation End!!!");
//            }
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//                Log.d("MY_TAG", "Repeating...");
//            }
//        });
//
//        backgroundView.startAnimation(fadeOut);

        Date currentDate = Calendar.getInstance().getTime();
        String dateStr = format.getDateFormat(currentDate, "dd MMM YYYY");
        String timeStr = format.getDateFormat(currentDate, "hh:mm a");

        dateTextView = (TextView) findViewById(R.id.id_current_date);
        timeTextView = (TextView) findViewById(R.id.id_current_time);

        dateTextView.setText(dateStr);
        timeTextView.setText(timeStr);

        TextView licenseTextView = (TextView) findViewById(R.id.license_str);
        qrImageView = (ImageView) findViewById(R.id.qr_image_view);

        MultiFormatWriter mWriter = new MultiFormatWriter();

        try{
            String licenseIdString = licenseTextView.getText().toString();
            String nameString = ((TextView)findViewById(R.id.id_name)).getText().toString();
            String birthString = ((TextView)findViewById(R.id.id_birth)).getText().toString();
            String qrText = nameString + licenseIdString + birthString;
            BitMatrix mMatrix = mWriter.encode(qrText, BarcodeFormat.QR_CODE, 600,600);
            BarcodeEncoder mEncoder = new BarcodeEncoder();
            Bitmap mBitmap = mEncoder.createBitmap(mMatrix);//creating bitmap of code
            qrImageView.setImageBitmap(mBitmap);//Setting generated QR code to imageView
        }catch(Exception e) {

        }

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}
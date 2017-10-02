package com.kitamart.didik.membercard;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.goodiebag.pinview.Pinview;

/**
 * Created by didik on 10/1/17.
 */

public class Unlock extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unlock);

        final Pinview pv = (Pinview) findViewById(R.id.pinView);
        pv.setPinViewEventListener(new Pinview.PinViewEventListener() {
            @Override
            public void onDataEntered(Pinview pinview, boolean b) {
//                Toast.makeText(Unlock.this, ""+pv.getValue(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Unlock.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

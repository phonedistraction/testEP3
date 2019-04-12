package org.baysidehighschool.testep.service;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

import org.baysidehighschool.testep.R;

public class mainactivity extends AppCompatActivity {

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Common.currentToken = FirebaseInstanceId.getInstance().getToken();

        Log.d("MY TOKEN",Common.currentToken);

    }
}

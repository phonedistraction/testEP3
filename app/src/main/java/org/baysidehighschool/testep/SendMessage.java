package org.baysidehighschool.testep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.PrivateKey;

public class SendMessage extends AppCompatActivity {


    //  private Firebase mRef;
    private Button mSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //   Firebsae.setAndroidContext(this);
        // mRef = new Firebase("https://my-projects-dcffa.firebaseio.com/");
        mSendData =(Button) findViewById(R.id.sendData);

        mSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Name");

                myRef.setValue("Nikmal");
            }
        });

    }
}
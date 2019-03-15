package org.baysidehighschool.testep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import de.hdodenhof.circleimageview.CircleImageView;

public class profile extends AppCompatActivity
{
    private TextView studentName, studentID;
    private CircleImageView profileImage;

    private DatabaseReference profileUser;
    private FirebaseAuth mAuth;

    private String currentUserId;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        mAuth = FirebaseAuth.getInstance();
        currentUserId = mAuth.getCurrentUser().getUid();

        studentName = (TextView) findViewById(R.id.student);
        studentID = (TextView) findViewById(R.id.id);
        profileImage = (CircleImageView) findViewById(R.id.)

    }
}

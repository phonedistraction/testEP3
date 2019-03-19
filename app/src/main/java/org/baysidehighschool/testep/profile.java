package org.baysidehighschool.testep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthSettings;

import org.w3c.dom.Text;

import de.hdodenhof.circleimageview.CircleImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class profile extends AppCompatActivity
{
    private static final Object SettingsUserRef = ;
    private TextView studentName, studentID;
    private CircleImageView profileImage;

    private FirebaseAuth mAuth;
    private DatabaseReference profileUserRef;

    private String currentUserId;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mAuth = FirebaseAuth.getInstance();
        currentUserId = mAuth.getCurrentUser().getUid();
        profileUserRef = FirebaseDatabase.getInstance().getReference().child("Users").child(currentUserId);

        studentName = (TextView) findViewById(R.id.student);
        studentID = (TextView) findViewById(R.id.id);
        profileImage = (CircleImageView) findViewById(R.id.pic);


        SettingsUserRef. addValueEventLinstener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot)
            {
                if (dataSnapshot.exists())
                {
                    String myProfileImage = dataSnapshot.child("profileImage").getValue().toString();
                    String myUserName = dataSnapshot.child("username").getValue().toString();
                    String myId = dataSnapshot.child("userID").getValue().toString();

                    Picasso.with(profile.this).load(myProfileImage).placeholder(R.drawable.profile).into(userProfImage);

                    userName.setText("@" + myUserName);
                    userID.setText("@" + myId);

                }
            }
        }


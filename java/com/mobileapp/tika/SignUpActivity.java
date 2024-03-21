package com.mobileapp.tika;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;


public class SignUpActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    private EditText signupEmail, signupPassword;
    private Button signupButton;
    private TextView loginRedirectText;
    float m=1.0f,l=1.0f,m2=1.0f,l2=1.0f,m3=1.0f,l3=1.0f,m4=1.0f,l4=1.0f,m5=1.0f,l5=1.0f,m6=1.0f,l6=1.0f,m7=1.0f,l7=1.0f,m8=1.0f,l8=1.0f,m9=1.0f,l9=1.0f,m1=1.0f,l1=1.0f,m21=1.0f,l21=1.0f,m31=1.0f,l31=1.0f,m41=1.0f,l41=1.0f,m51=1.0f,l51=1.0f,m61=1.0f,l61=1.0f,m71=1.0f,l71=1.0f,m81=1.0f,l81=1.0f,m91=1.0f,l91=1.0f,m101=1.0f,l101=1.0f;
    int d=0,n=0,d2=0,n2=0,d3=0,n3=0,d4=0,n4=0,d5=0,n5=0,d6=0,n6=0,d7=0,n7=0,d8=0,n8=0,d9=0,n9=0,d1=0,n1=0,d21=0,n21=0,d31=0,n31=0,d41=0,n41=0,d51=0,n51=0,d61=0,n61=0,d71=0,n71=0,d81=0,n81=0,d91=0,n91=0,d101=0,n101=0;
    private DatabaseReference rootDr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        auth = FirebaseAuth.getInstance();
        signupEmail = findViewById(R.id.signup_email);
        signupPassword = findViewById(R.id.signup_password);
        signupButton = findViewById(R.id.signup_button);
        loginRedirectText = findViewById(R.id.loginRedirectText);
        rootDr = FirebaseDatabase.getInstance().getReference();
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = signupEmail.getText().toString().trim();
                String pass = signupPassword.getText().toString().trim();
                if (user.isEmpty()){
                    signupEmail.setError("Email cannot be empty");
                }
                if (pass.isEmpty()){
                    signupPassword.setError("Password cannot be empty");
                } else{
                    auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(SignUpActivity.this, "Please Wait", Toast.LENGTH_SHORT).show();
                                String uid = Objects.requireNonNull(FirebaseAuth.getInstance().getCurrentUser()).getUid();
                                rootDr.child(uid).child("user").child("a").setValue(String.valueOf(n));
                                rootDr.child(uid).child("user").child("d").setValue(String.valueOf(d));
                                rootDr.child(uid).child("user").child("l").setValue(String.valueOf(l));
                                rootDr.child(uid).child("user").child("m").setValue(String.valueOf(m));
                                rootDr.child(uid).child("user").child("n").setValue(String.valueOf(n));

                                rootDr.child(uid).child("user").child("a2").setValue(String.valueOf(n2));
                                rootDr.child(uid).child("user").child("d2").setValue(String.valueOf(d2));
                                rootDr.child(uid).child("user").child("l2").setValue(String.valueOf(l2));
                                rootDr.child(uid).child("user").child("m2").setValue(String.valueOf(m2));
                                rootDr.child(uid).child("user").child("n2").setValue(String.valueOf(n2));

                                rootDr.child(uid).child("user").child("a3").setValue(String.valueOf(n3));
                                rootDr.child(uid).child("user").child("d3").setValue(String.valueOf(d3));
                                rootDr.child(uid).child("user").child("l3").setValue(String.valueOf(l3));
                                rootDr.child(uid).child("user").child("m3").setValue(String.valueOf(m3));
                                rootDr.child(uid).child("user").child("n3").setValue(String.valueOf(n3));

                                rootDr.child(uid).child("user").child("a4").setValue(String.valueOf(n4));
                                rootDr.child(uid).child("user").child("d4").setValue(String.valueOf(d4));
                                rootDr.child(uid).child("user").child("l4").setValue(String.valueOf(l4));
                                rootDr.child(uid).child("user").child("m4").setValue(String.valueOf(m4));
                                rootDr.child(uid).child("user").child("n4").setValue(String.valueOf(n4));

                                rootDr.child(uid).child("user").child("a5").setValue(String.valueOf(n5));
                                rootDr.child(uid).child("user").child("d5").setValue(String.valueOf(d5));
                                rootDr.child(uid).child("user").child("l5").setValue(String.valueOf(l5));
                                rootDr.child(uid).child("user").child("m5").setValue(String.valueOf(m5));
                                rootDr.child(uid).child("user").child("n5").setValue(String.valueOf(n5));

                                rootDr.child(uid).child("user").child("a6").setValue(String.valueOf(n6));
                                rootDr.child(uid).child("user").child("d6").setValue(String.valueOf(d6));
                                rootDr.child(uid).child("user").child("l6").setValue(String.valueOf(l6));
                                rootDr.child(uid).child("user").child("m6").setValue(String.valueOf(m6));
                                rootDr.child(uid).child("user").child("n6").setValue(String.valueOf(n6));

                                rootDr.child(uid).child("user").child("a7").setValue(String.valueOf(n7));
                                rootDr.child(uid).child("user").child("d7").setValue(String.valueOf(d7));
                                rootDr.child(uid).child("user").child("l7").setValue(String.valueOf(l7));
                                rootDr.child(uid).child("user").child("m7").setValue(String.valueOf(m7));
                                rootDr.child(uid).child("user").child("n7").setValue(String.valueOf(n7));

                                rootDr.child(uid).child("user").child("a8").setValue(String.valueOf(n8));
                                rootDr.child(uid).child("user").child("d8").setValue(String.valueOf(d8));
                                rootDr.child(uid).child("user").child("l8").setValue(String.valueOf(l8));
                                rootDr.child(uid).child("user").child("m8").setValue(String.valueOf(m8));
                                rootDr.child(uid).child("user").child("n8").setValue(String.valueOf(n8));

                                rootDr.child(uid).child("user").child("a9").setValue(String.valueOf(n9));
                                rootDr.child(uid).child("user").child("d9").setValue(String.valueOf(d9));
                                rootDr.child(uid).child("user").child("l9").setValue(String.valueOf(l9));
                                rootDr.child(uid).child("user").child("m9").setValue(String.valueOf(m9));
                                rootDr.child(uid).child("user").child("n9").setValue(String.valueOf(n9));

                                rootDr.child(uid).child("user").child("a1").setValue(String.valueOf(n1));
                                rootDr.child(uid).child("user").child("d1").setValue(String.valueOf(d1));
                                rootDr.child(uid).child("user").child("l1").setValue(String.valueOf(l1));
                                rootDr.child(uid).child("user").child("m1").setValue(String.valueOf(m1));
                                rootDr.child(uid).child("user").child("n1").setValue(String.valueOf(n1));

                                rootDr.child(uid).child("user").child("a21").setValue(String.valueOf(n21));
                                rootDr.child(uid).child("user").child("d21").setValue(String.valueOf(d21));
                                rootDr.child(uid).child("user").child("l21").setValue(String.valueOf(l21));
                                rootDr.child(uid).child("user").child("m21").setValue(String.valueOf(m21));
                                rootDr.child(uid).child("user").child("n21").setValue(String.valueOf(n21));

                                rootDr.child(uid).child("user").child("a31").setValue(String.valueOf(n31));
                                rootDr.child(uid).child("user").child("d31").setValue(String.valueOf(d31));
                                rootDr.child(uid).child("user").child("l31").setValue(String.valueOf(l31));
                                rootDr.child(uid).child("user").child("m31").setValue(String.valueOf(m31));
                                rootDr.child(uid).child("user").child("n31").setValue(String.valueOf(n31));

                                rootDr.child(uid).child("user").child("a41").setValue(String.valueOf(n41));
                                rootDr.child(uid).child("user").child("d41").setValue(String.valueOf(d41));
                                rootDr.child(uid).child("user").child("l41").setValue(String.valueOf(l41));
                                rootDr.child(uid).child("user").child("m41").setValue(String.valueOf(m41));
                                rootDr.child(uid).child("user").child("n41").setValue(String.valueOf(n41));

                                rootDr.child(uid).child("user").child("a51").setValue(String.valueOf(n51));
                                rootDr.child(uid).child("user").child("d51").setValue(String.valueOf(d51));
                                rootDr.child(uid).child("user").child("l51").setValue(String.valueOf(l51));
                                rootDr.child(uid).child("user").child("m51").setValue(String.valueOf(m51));
                                rootDr.child(uid).child("user").child("n51").setValue(String.valueOf(n51));

                                rootDr.child(uid).child("user").child("a61").setValue(String.valueOf(n61));
                                rootDr.child(uid).child("user").child("d61").setValue(String.valueOf(d61));
                                rootDr.child(uid).child("user").child("l61").setValue(String.valueOf(l61));
                                rootDr.child(uid).child("user").child("m61").setValue(String.valueOf(m61));
                                rootDr.child(uid).child("user").child("n61").setValue(String.valueOf(n61));

                                rootDr.child(uid).child("user").child("a71").setValue(String.valueOf(n71));
                                rootDr.child(uid).child("user").child("d71").setValue(String.valueOf(d71));
                                rootDr.child(uid).child("user").child("l71").setValue(String.valueOf(l71));
                                rootDr.child(uid).child("user").child("m71").setValue(String.valueOf(m71));
                                rootDr.child(uid).child("user").child("n71").setValue(String.valueOf(n71));

                                rootDr.child(uid).child("user").child("a81").setValue(String.valueOf(n81));
                                rootDr.child(uid).child("user").child("d81").setValue(String.valueOf(d81));
                                rootDr.child(uid).child("user").child("l81").setValue(String.valueOf(l81));
                                rootDr.child(uid).child("user").child("m81").setValue(String.valueOf(m81));
                                rootDr.child(uid).child("user").child("n81").setValue(String.valueOf(n81));

                                rootDr.child(uid).child("user").child("a91").setValue(String.valueOf(n91));
                                rootDr.child(uid).child("user").child("d91").setValue(String.valueOf(d91));
                                rootDr.child(uid).child("user").child("l91").setValue(String.valueOf(l91));
                                rootDr.child(uid).child("user").child("m91").setValue(String.valueOf(m91));
                                rootDr.child(uid).child("user").child("n91").setValue(String.valueOf(n91));

                                rootDr.child(uid).child("user").child("a101").setValue(String.valueOf(n101));
                                rootDr.child(uid).child("user").child("d101").setValue(String.valueOf(d101));
                                rootDr.child(uid).child("user").child("l101").setValue(String.valueOf(l101));
                                rootDr.child(uid).child("user").child("m101").setValue(String.valueOf(m101));
                                rootDr.child(uid).child("user").child("n101").setValue(String.valueOf(n101));


                                Toast.makeText(SignUpActivity.this, "SignUp Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
                            } else {
                                Toast.makeText(SignUpActivity.this, "SignUp Failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
            }
        });
    }
}
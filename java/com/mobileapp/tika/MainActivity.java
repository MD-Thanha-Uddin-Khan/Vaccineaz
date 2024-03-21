package com.mobileapp.tika;

import static android.Manifest.permission.READ_MEDIA_IMAGES;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.pdf.PdfDocument;
import android.os.Build;
import android.os.Bundle;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    EditText b,e,f,i,b2,e2,f2,i2,b3,e3,f3,i3,b4,e4,f4,i4,b5,e5,f5,i5,b6,e6,f6,i6,b7,e7,f7,i7,b8,e8,f8,i8,b9,e9,f9,i9,bl1,el1,fl1,il1,b21,e21,f21,i21,b31,e31,f31,i31,b41,e41,f41,i41,b51,e51,f51,i51,b61,e61,f61,i61,b71,e71,f71,i71,b81,e81,f81,i81,b91,e91,f91,i91,b101,e101,f101,i101;
    int a1,b1=1,c1=1,d1,e1=1,f1=1,g1=1,n1,a12,b12=1,c12=1,d12,e12=1,f12=1,g12=1,n12,a13,b13=1,c13=1,d13,e13=1,f13=1,g13=1,n13,a14,b14=1,c14=1,d14,e14=1,f14=1,g14=1,n14,a15,b15=1,c15=1,d15,e15=1,f15=1,g15=1,n15,a16,b16=1,c16=1,d16,e16=1,f16=1,g16=1,n16,a17,b17=1,c17=1,d17,e17=1,f17=1,g17=1,n17,a18,b18=1,c18=1,d18,e18=1,f18=1,g18=1,n18,a19,b19=1,c19=1,d19,e19=1,f19=1,g19=1,n19,a211,b211=1,c211=1,d211,e211=1,f211=1,g211=1,n211,a221,b221=1,c221=1,d221,e221=1,f221=1,g221=1,n221,a231,b231=1,c231=1,d231,e231=1,f231=1,g231=1,n231,a241,b241=1,c241=1,d241,e241=1,f241=1,g241=1,n241,a251,b251=1,c251=1,d251,e251=1,f251=1,g251=1,n251,a261,b261=1,c261=1,d261,e261=1,f261=1,g261=1,n261,a271,b271=1,c271=1,d271,e271=1,f271=1,g271=1,n271,a281,b281=1,c281=1,d281,e281=1,f281=1,g281=1,n281,a291,b291=1,c291=1,d291,e291=1,f291=1,g291=1,n291,a301,b301=1,c301=1,d301,e301=1,f301=1,g301=1,n301,a311,b311=1,c311=1,d311,e311=1,f311=1,g311=1,n311,a321,b321=1,c321=1,d321,e321=1,f321=1,g321=1,n321,a331,b331=1,c331=1,d331,e331=1,f331=1,g331=1,n331;
    float i1 = 1.0f,k1 =1.0f,m1,l1,r2i1 = 1.0f,r2k1 =1.0f,r2m1,r2l1,r3i1 = 1.0f,r3k1 =1.0f,r3m1,r3l1,r4i1 = 1.0f,r4k1 =1.0f,r4m1,r4l1,r5i1 = 1.0f,r5k1 =1.0f,r5m1,r5l1,r6i1 = 1.0f,r6k1 =1.0f,r6m1,r6l1,r7i1 = 1.0f,r7k1 =1.0f,r7m1,r7l1,r8i1 = 1.0f,r8k1 =1.0f,r8m1,r8l1,r9i1 = 1.0f,r9k1 =1.0f,r9m1,r9l1,r10i1 = 1.0f,r10k1 =1.0f,r10m1,r10l1,r11i1 = 1.0f,r11k1 =1.0f,r11m1,r11l1,r12i1 = 1.0f,r12k1 =1.0f,r12m1,r12l1,r13i1 = 1.0f,r13k1 =1.0f,r13m1,r13l1,r14i1 = 1.0f,r14k1 =1.0f,r14m1,r14l1,r16i1 = 1.0f,r16k1 =1.0f,r16m1,r16l1,r17i1 = 1.0f,r17k1 =1.0f,r17m1,r17l1,r18i1 = 1.0f,r18k1 =1.0f,r18m1,r18l1,r19i1 = 1.0f,r19k1 =1.0f,r19m1,r19l1,r20i1 = 1.0f,r20k1 =1.0f,r20m1,r20l1,r21i1 = 1.0f,r21k1 =1.0f,r21m1,r21l1,r22i1 = 1.0f,r22k1 =1.0f,r22m1,r22l1,r23i1 = 1.0f,r23k1 =1.0f,r23m1,r23l1;
    String a11,d11,l11,m11,n11,r2a11,r2d11,r2l11,r2m11,r2n11,r3a11,r3d11,r3l11,r3m11,r3n11,r4a11,r4d11,r4l11,r4m11,r4n11,r5a11,r5d11,r5l11,r5m11,r5n11,r6a11,r6d11,r6l11,r6m11,r6n11,r7a11,r7d11,r7l11,r7m11,r7n11,r8a11,r8d11,r8l11,r8m11,r8n11,r9a11,r9d11,r9l11,r9m11,r9n11,r10a11,r10d11,r10l11,r10m11,r10n11,r11a11,r11d11,r11l11,r11m11,r11n11,r12a11,r12d11,r12l11,r12m11,r12n11,r13a11,r13d11,r13l11,r13m11,r13n11,r14a11,r14d11,r14l11,r14m11,r14n11,r15a11,r15d11,r15l11,r15m11,r15n11,r16a11,r16d11,r16l11,r16m11,r16n11,r17a11,r17d11,r17l11,r17m11,r17n11,r18a11,r18d11,r18l11,r18m11,r18n11,r19a11,r19d11,r19l11,r19m11,r19n11,r20a11,r20d11,r20l11,r20m11,r20n11,r21a11,r21d11,r21l11,r21m11,r21n11,r22a11,r22d11,r22l11,r22m11,r22n11,r23a11,r23d11,r23l11,r23m11,r23n11;
    TextView a,c,d,g,k,l,m,n,a2,c2,d2,g2,k2,l2,m2,n2,a3,c3,d3,g3,k3,l3,m3,n3,a4,c4,d4,g4,k4,l4,m4,n4,a5,c5,d5,g5,k5,l5,m5,n5,a6,c6,d6,g6,k6,l6,m6,n6,a7,c7,d7,g7,k7,l7,m7,n7,a8,c8,d8,g8,k8,l8,m8,n8,a9,c9,d9,g9,k9,l9,m9,n9,a10,c10,d10,g10,k10,l10,m10,n10,al1,cl1,dl1,gl1,kl1,ll1,ml1,nl1,a21,c21,d21,g21,k21,l21,m21,n21,a31,c31,d31,g31,k31,l31,m31,n31,a41,c41,d41,g41,k41,l41,m41,n41,a51,c51,d51,g51,k51,l51,m51,n51,a61,c61,d61,g61,k61,l61,m61,n61,a71,c71,d71,g71,k71,l71,m71,n71,a81,c81,d81,g81,k81,l81,m81,n81,a91,c91,d91,g91,k91,l91,m91,n91,a101,c101,d101,g101,k101,l101,m101,n101,a111,c111,d111,g111,k111,l111,m111,n111,a121,c121,d121,g121,k121,l121,m121,n121,b10,e10,f10,i10,b111,e111,f111,i111,b121,e121,f121,i121;
    Button logout;
    GoogleSignInClient gClient;
    GoogleSignInOptions gOptions;
    Button enter;
    private File filePDFOutput;
    private TableLayout tableLayout;
    private DatabaseReference rootDr;
    @SuppressLint("MissingInflatedId")
    @RequiresApi(api = Build.VERSION_CODES.TIRAMISU)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (TextView)findViewById(R.id.a);
        b = (EditText) findViewById(R.id.b);
        c = (TextView)findViewById(R.id.c);
        d = (TextView)findViewById(R.id.d);
        e = (EditText) findViewById(R.id.e);
        f = (EditText) findViewById(R.id.f);
        g = (TextView)findViewById(R.id.g);
        i = (EditText) findViewById(R.id.i);
        k = (TextView) findViewById(R.id.k);
        l = (TextView)findViewById(R.id.l);
        m = (TextView)findViewById(R.id.m);
        n = (TextView)findViewById(R.id.n);

        a2 = (TextView)findViewById(R.id.a_2);
        b2 = (EditText) findViewById(R.id.b_2);
        c2 = (TextView)findViewById(R.id.c_2);
        d2 = (TextView)findViewById(R.id.d_2);
        e2 = (EditText) findViewById(R.id.e_2);
        f2 = (EditText) findViewById(R.id.f_2);
        g2 = (TextView)findViewById(R.id.g_2);
        i2 = (EditText) findViewById(R.id.i_2);
        k2 = (TextView) findViewById(R.id.k_2);
        l2 = (TextView)findViewById(R.id.l_2);
        m2 = (TextView)findViewById(R.id.m_2);
        n2 = (TextView)findViewById(R.id.n_2);

        a3 = (TextView)findViewById(R.id.a_3);
        b3 = (EditText) findViewById(R.id.b_3);
        c3 = (TextView)findViewById(R.id.c_3);
        d3 = (TextView)findViewById(R.id.d_3);
        e3 = (EditText) findViewById(R.id.e_3);
        f3 = (EditText) findViewById(R.id.f_3);
        g3 = (TextView)findViewById(R.id.g_3);
        i3 = (EditText) findViewById(R.id.i_3);
        k3 = (TextView) findViewById(R.id.k_3);
        l3 = (TextView)findViewById(R.id.l_3);
        m3 = (TextView)findViewById(R.id.m_3);
        n3 = (TextView)findViewById(R.id.n_3);

        a4 = (TextView)findViewById(R.id.a_4);
        b4 = (EditText) findViewById(R.id.b_4);
        c4 = (TextView)findViewById(R.id.c_4);
        d4 = (TextView)findViewById(R.id.d_4);
        e4 = (EditText) findViewById(R.id.e_4);
        f4 = (EditText) findViewById(R.id.f_4);
        g4 = (TextView)findViewById(R.id.g_4);
        i4 = (EditText) findViewById(R.id.i_4);
        k4 = (TextView) findViewById(R.id.k_4);
        l4 = (TextView)findViewById(R.id.l_4);
        m4 = (TextView)findViewById(R.id.m_4);
        n4 = (TextView)findViewById(R.id.n_4);

        a5 = (TextView)findViewById(R.id.a_5);
        b5 = (EditText) findViewById(R.id.b_5);
        c5 = (TextView)findViewById(R.id.c_5);
        d5 = (TextView)findViewById(R.id.d_5);
        e5 = (EditText) findViewById(R.id.e_5);
        f5 = (EditText) findViewById(R.id.f_5);
        g5 = (TextView)findViewById(R.id.g_5);
        i5 = (EditText) findViewById(R.id.i_5);
        k5 = (TextView) findViewById(R.id.k_5);
        l5 = (TextView)findViewById(R.id.l_5);
        m5 = (TextView)findViewById(R.id.m_5);
        n5 = (TextView)findViewById(R.id.n_5);

        a6 = (TextView)findViewById(R.id.a_6);
        b6 = (EditText) findViewById(R.id.b_6);
        c6 = (TextView)findViewById(R.id.c_6);
        d6 = (TextView)findViewById(R.id.d_6);
        e6 = (EditText) findViewById(R.id.e_6);
        f6 = (EditText) findViewById(R.id.f_6);
        g6 = (TextView)findViewById(R.id.g_6);
        i6 = (EditText) findViewById(R.id.i_6);
        k6 = (TextView) findViewById(R.id.k_6);
        l6 = (TextView)findViewById(R.id.l_6);
        m6 = (TextView)findViewById(R.id.m_6);
        n6 = (TextView)findViewById(R.id.n_6);

        a7 = (TextView)findViewById(R.id.a_7);
        b7 = (EditText) findViewById(R.id.b_7);
        c7 = (TextView)findViewById(R.id.c_7);
        d7 = (TextView)findViewById(R.id.d_7);
        e7 = (EditText) findViewById(R.id.e_7);
        f7 = (EditText) findViewById(R.id.f_7);
        g7 = (TextView)findViewById(R.id.g_7);
        i7 = (EditText) findViewById(R.id.i_7);
        k7 = (TextView) findViewById(R.id.k_7);
        l7 = (TextView)findViewById(R.id.l_7);
        m7 = (TextView)findViewById(R.id.m_7);
        n7 = (TextView)findViewById(R.id.n_7);

        a8 = (TextView)findViewById(R.id.a_8);
        b8 = (EditText) findViewById(R.id.b_8);
        c8 = (TextView)findViewById(R.id.c_8);
        d8 = (TextView)findViewById(R.id.d_8);
        e8 = (EditText) findViewById(R.id.e_8);
        f8 = (EditText) findViewById(R.id.f_8);
        g8 = (TextView)findViewById(R.id.g_8);
        i8 = (EditText) findViewById(R.id.i_8);
        k8 = (TextView) findViewById(R.id.k_8);
        l8 = (TextView)findViewById(R.id.l_8);
        m8 = (TextView)findViewById(R.id.m_8);
        n8 = (TextView)findViewById(R.id.n_8);

        a9 = (TextView)findViewById(R.id.a_9);
        b9 = (EditText) findViewById(R.id.b_9);
        c9 = (TextView)findViewById(R.id.c_9);
        d9 = (TextView)findViewById(R.id.d_9);
        e9 = (EditText) findViewById(R.id.e_9);
        f9 = (EditText) findViewById(R.id.f_9);
        g9 = (TextView)findViewById(R.id.g_9);
        i9 = (EditText) findViewById(R.id.i_9);
        k9 = (TextView) findViewById(R.id.k_9);
        l9 = (TextView)findViewById(R.id.l_9);
        m9 = (TextView)findViewById(R.id.m_9);
        n9 = (TextView)findViewById(R.id.n_9);

        a10 = (TextView)findViewById(R.id.a_10);
        b10 = (TextView) findViewById(R.id.b_10);
        c10 = (TextView)findViewById(R.id.c_10);
        d10 = (TextView)findViewById(R.id.d_10);
        e10 = (TextView) findViewById(R.id.e_10);
        f10 = (TextView) findViewById(R.id.f_10);
        g10 = (TextView)findViewById(R.id.g_10);
        i10 = (TextView) findViewById(R.id.i_10);
        k10 = (TextView) findViewById(R.id.k_10);
        l10 = (TextView)findViewById(R.id.l_10);
        m10 = (TextView)findViewById(R.id.m_10);
        n10 = (TextView)findViewById(R.id.n_10);

        al1 = (TextView)findViewById(R.id.a1);
        bl1 = (EditText) findViewById(R.id.b1);
        cl1 = (TextView)findViewById(R.id.c1);
        dl1 = (TextView)findViewById(R.id.d1);
        el1 = (EditText) findViewById(R.id.e1);
        fl1 = (EditText) findViewById(R.id.f1);
        gl1 = (TextView)findViewById(R.id.g1);
        il1 = (EditText) findViewById(R.id.i1);
        kl1 = (TextView) findViewById(R.id.k1);
        ll1 = (TextView)findViewById(R.id.l1);
        ml1 = (TextView)findViewById(R.id.m1);
        nl1 = (TextView)findViewById(R.id.n1);

        a21 = (TextView)findViewById(R.id.a_21);
        b21 = (EditText) findViewById(R.id.b_21);
        c21 = (TextView)findViewById(R.id.c_21);
        d21 = (TextView)findViewById(R.id.d_21);
        e21 = (EditText) findViewById(R.id.e_21);
        f21 = (EditText) findViewById(R.id.f_21);
        g21 = (TextView)findViewById(R.id.g_21);
        i21 = (EditText) findViewById(R.id.i_21);
        k21 = (TextView) findViewById(R.id.k_21);
        l21 = (TextView)findViewById(R.id.l_21);
        m21 = (TextView)findViewById(R.id.m_21);
        n21 = (TextView)findViewById(R.id.n_21);

        a31 = (TextView)findViewById(R.id.a_31);
        b31 = (EditText) findViewById(R.id.b_31);
        c31 = (TextView)findViewById(R.id.c_31);
        d31 = (TextView)findViewById(R.id.d_31);
        e31 = (EditText) findViewById(R.id.e_31);
        f31 = (EditText) findViewById(R.id.f_31);
        g31 = (TextView)findViewById(R.id.g_31);
        i31 = (EditText) findViewById(R.id.i_31);
        k31 = (TextView) findViewById(R.id.k_31);
        l31 = (TextView)findViewById(R.id.l_31);
        m31 = (TextView)findViewById(R.id.m_31);
        n31 = (TextView)findViewById(R.id.n_31);

        a41 = (TextView)findViewById(R.id.a_41);
        b41 = (EditText) findViewById(R.id.b_41);
        c41 = (TextView)findViewById(R.id.c_41);
        d41 = (TextView)findViewById(R.id.d_41);
        e41 = (EditText) findViewById(R.id.e_41);
        f41 = (EditText) findViewById(R.id.f_41);
        g41 = (TextView)findViewById(R.id.g_41);
        i41 = (EditText) findViewById(R.id.i_41);
        k41 = (TextView) findViewById(R.id.k_41);
        l41 = (TextView)findViewById(R.id.l_41);
        m41 = (TextView)findViewById(R.id.m_41);
        n41 = (TextView)findViewById(R.id.n_41);

        a51 = (TextView)findViewById(R.id.a_51);
        b51 = (EditText) findViewById(R.id.b_51);
        c51 = (TextView)findViewById(R.id.c_51);
        d51 = (TextView)findViewById(R.id.d_51);
        e51 = (EditText) findViewById(R.id.e_51);
        f51 = (EditText) findViewById(R.id.f_51);
        g51 = (TextView)findViewById(R.id.g_51);
        i51 = (EditText) findViewById(R.id.i_51);
        k51 = (TextView) findViewById(R.id.k_51);
        l51 = (TextView)findViewById(R.id.l_51);
        m51 = (TextView)findViewById(R.id.m_51);
        n51 = (TextView)findViewById(R.id.n_51);

        a61 = (TextView)findViewById(R.id.a_61);
        b61 = (EditText) findViewById(R.id.b_61);
        c61 = (TextView)findViewById(R.id.c_61);
        d61 = (TextView)findViewById(R.id.d_61);
        e61 = (EditText) findViewById(R.id.e_61);
        f61 = (EditText) findViewById(R.id.f_61);
        g61 = (TextView)findViewById(R.id.g_61);
        i61 = (EditText) findViewById(R.id.i_61);
        k61 = (TextView) findViewById(R.id.k_61);
        l61 = (TextView)findViewById(R.id.l_61);
        m61 = (TextView)findViewById(R.id.m_61);
        n61 = (TextView)findViewById(R.id.n_61);

        a71 = (TextView)findViewById(R.id.a_71);
        b71 = (EditText) findViewById(R.id.b_71);
        c71 = (TextView)findViewById(R.id.c_71);
        d71 = (TextView)findViewById(R.id.d_71);
        e71 = (EditText) findViewById(R.id.e_71);
        f71 = (EditText) findViewById(R.id.f_71);
        g71 = (TextView)findViewById(R.id.g_71);
        i71 = (EditText) findViewById(R.id.i_71);
        k71 = (TextView) findViewById(R.id.k_71);
        l71 = (TextView)findViewById(R.id.l_71);
        m71 = (TextView)findViewById(R.id.m_71);
        n71 = (TextView)findViewById(R.id.n_71);

        a81 = (TextView)findViewById(R.id.a_81);
        b81 = (EditText) findViewById(R.id.b_81);
        c81 = (TextView)findViewById(R.id.c_81);
        d81 = (TextView)findViewById(R.id.d_81);
        e81 = (EditText) findViewById(R.id.e_81);
        f81 = (EditText) findViewById(R.id.f_81);
        g81 = (TextView)findViewById(R.id.g_81);
        i81 = (EditText) findViewById(R.id.i_81);
        k81 = (TextView) findViewById(R.id.k_81);
        l81 = (TextView)findViewById(R.id.l_81);
        m81 = (TextView)findViewById(R.id.m_81);
        n81 = (TextView)findViewById(R.id.n_81);

        a91 = (TextView)findViewById(R.id.a_91);
        b91 = (EditText) findViewById(R.id.b_91);
        c91 = (TextView)findViewById(R.id.c_91);
        d91 = (TextView)findViewById(R.id.d_91);
        e91 = (EditText) findViewById(R.id.e_91);
        f91 = (EditText) findViewById(R.id.f_91);
        g91 = (TextView)findViewById(R.id.g_91);
        i91 = (EditText) findViewById(R.id.i_91);
        k91 = (TextView) findViewById(R.id.k_91);
        l91 = (TextView)findViewById(R.id.l_91);
        m91 = (TextView)findViewById(R.id.m_91);
        n91 = (TextView)findViewById(R.id.n_91);

        a101 = (TextView)findViewById(R.id.a_101);
        b101 = (EditText) findViewById(R.id.b_101);
        c101 = (TextView)findViewById(R.id.c_101);
        d101 = (TextView)findViewById(R.id.d_101);
        e101 = (EditText) findViewById(R.id.e_101);
        f101 = (EditText) findViewById(R.id.f_101);
        g101 = (TextView)findViewById(R.id.g_101);
        i101 = (EditText) findViewById(R.id.i_101);
        k101 = (TextView) findViewById(R.id.k_101);
        l101 = (TextView)findViewById(R.id.l_101);
        m101 = (TextView)findViewById(R.id.m_101);
        n101 = (TextView)findViewById(R.id.n_101);

        a111 = (TextView)findViewById(R.id.a_111);
        b111 = (TextView) findViewById(R.id.b_111);
        c111 = (TextView)findViewById(R.id.c_111);
        d111 = (TextView)findViewById(R.id.d_111);
        e111 = (TextView) findViewById(R.id.e_111);
        f111 = (TextView) findViewById(R.id.f_111);
        g111 = (TextView)findViewById(R.id.g_111);
        i111 = (TextView) findViewById(R.id.i_111);
        k111 = (TextView) findViewById(R.id.k_111);
        l111 = (TextView)findViewById(R.id.l_111);
        m111 = (TextView)findViewById(R.id.m_111);
        n111 = (TextView)findViewById(R.id.n_111);

        a121 = (TextView)findViewById(R.id.a_121);
        b121 = (TextView) findViewById(R.id.b_121);
        c121 = (TextView)findViewById(R.id.c_121);
        d121 = (TextView)findViewById(R.id.d_121);
        e121 = (TextView) findViewById(R.id.e_121);
        f121 = (TextView) findViewById(R.id.f_121);
        g121 = (TextView)findViewById(R.id.g_121);
        i121 = (TextView) findViewById(R.id.i_121);
        k121 = (TextView) findViewById(R.id.k_121);
        l121 = (TextView)findViewById(R.id.l_121);
        m121 = (TextView)findViewById(R.id.m_121);
        n121 = (TextView)findViewById(R.id.n_121);
        tableLayout = findViewById(R.id.table_layout);



        StorageManager storageManager = (StorageManager) getSystemService(STORAGE_SERVICE);
        StorageVolume storageVolume = null; // internal memory/ storage
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            storageVolume = storageManager.getStorageVolumes().get(0);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            filePDFOutput = new File(Objects.requireNonNull(storageVolume.getDirectory()).getPath()+"/Download/Output.pdf");
        }

        String uid = Objects.requireNonNull(FirebaseAuth.getInstance().getCurrentUser()).getUid();

        rootDr = FirebaseDatabase.getInstance().getReference();

        rootDr.child(uid).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {


                for (DataSnapshot ds : snapshot.getChildren()){
                    a11 = Objects.requireNonNull(ds.child("a").getValue()).toString();
                    d11 = Objects.requireNonNull(ds.child("d").getValue()).toString();
                    l11 = Objects.requireNonNull(ds.child("l").getValue()).toString();
                    m11 = Objects.requireNonNull(ds.child("m").getValue()).toString();
                    n11 = Objects.requireNonNull(ds.child("n").getValue()).toString();

r2a11 = Objects.requireNonNull(ds.child("a2").getValue()).toString();
                    r2d11 = Objects.requireNonNull(ds.child("d2").getValue()).toString();
                    r2l11 = Objects.requireNonNull(ds.child("l2").getValue()).toString();
                    r2m11 = Objects.requireNonNull(ds.child("m2").getValue()).toString();
                    r2n11 = Objects.requireNonNull(ds.child("n2").getValue()).toString();


r3a11 = Objects.requireNonNull(ds.child("a3").getValue()).toString();
                    r3d11 = Objects.requireNonNull(ds.child("d3").getValue()).toString();
                    r3l11 = Objects.requireNonNull(ds.child("l3").getValue()).toString();
                    r3m11 = Objects.requireNonNull(ds.child("m3").getValue()).toString();
                    r3n11 = Objects.requireNonNull(ds.child("n3").getValue()).toString();


r4a11 = Objects.requireNonNull(ds.child("a4").getValue()).toString();
                    r4d11 = Objects.requireNonNull(ds.child("d4").getValue()).toString();
                    r4l11 = Objects.requireNonNull(ds.child("l4").getValue()).toString();
                    r4m11 = Objects.requireNonNull(ds.child("m4").getValue()).toString();
                    r4n11 = Objects.requireNonNull(ds.child("n4").getValue()).toString();


r5a11 = Objects.requireNonNull(ds.child("a5").getValue()).toString();
                    r5d11 = Objects.requireNonNull(ds.child("d5").getValue()).toString();
                    r5l11 = Objects.requireNonNull(ds.child("l5").getValue()).toString();
                    r5m11 = Objects.requireNonNull(ds.child("m5").getValue()).toString();
                    r5n11 = Objects.requireNonNull(ds.child("n5").getValue()).toString();


r6a11 = Objects.requireNonNull(ds.child("a6").getValue()).toString();
                    r6d11 = Objects.requireNonNull(ds.child("d6").getValue()).toString();
                    r6l11 = Objects.requireNonNull(ds.child("l6").getValue()).toString();
                    r6m11 = Objects.requireNonNull(ds.child("m6").getValue()).toString();
                    r6n11 = Objects.requireNonNull(ds.child("n6").getValue()).toString();


r7a11 = Objects.requireNonNull(ds.child("a7").getValue()).toString();
                    r7d11 = Objects.requireNonNull(ds.child("d7").getValue()).toString();
                    r7l11 = Objects.requireNonNull(ds.child("l7").getValue()).toString();
                    r7m11 = Objects.requireNonNull(ds.child("m7").getValue()).toString();
                    r7n11 = Objects.requireNonNull(ds.child("n7").getValue()).toString();


r8a11 = Objects.requireNonNull(ds.child("a8").getValue()).toString();
                    r8d11 = Objects.requireNonNull(ds.child("d8").getValue()).toString();
                    r8l11 = Objects.requireNonNull(ds.child("l8").getValue()).toString();
                    r8m11 = Objects.requireNonNull(ds.child("m8").getValue()).toString();
                    r8n11 = Objects.requireNonNull(ds.child("n8").getValue()).toString();


r9a11 = Objects.requireNonNull(ds.child("a9").getValue()).toString();
                    r9d11 = Objects.requireNonNull(ds.child("d9").getValue()).toString();
                    r9l11 = Objects.requireNonNull(ds.child("l9").getValue()).toString();
                    r9m11 = Objects.requireNonNull(ds.child("m9").getValue()).toString();
                    r9n11 = Objects.requireNonNull(ds.child("n9").getValue()).toString();


r11a11 = Objects.requireNonNull(ds.child("a1").getValue()).toString();
                    r11d11 = Objects.requireNonNull(ds.child("d1").getValue()).toString();
                    r11l11 = Objects.requireNonNull(ds.child("l1").getValue()).toString();
                    r11m11 = Objects.requireNonNull(ds.child("m1").getValue()).toString();
                    r11n11 = Objects.requireNonNull(ds.child("n1").getValue()).toString();


r12a11 = Objects.requireNonNull(ds.child("a21").getValue()).toString();
                    r12d11 = Objects.requireNonNull(ds.child("d21").getValue()).toString();
                    r12l11 = Objects.requireNonNull(ds.child("l21").getValue()).toString();
                    r12m11 = Objects.requireNonNull(ds.child("m21").getValue()).toString();
                    r12n11 = Objects.requireNonNull(ds.child("n21").getValue()).toString();


r13a11 = Objects.requireNonNull(ds.child("a31").getValue()).toString();
                    r13d11 = Objects.requireNonNull(ds.child("d31").getValue()).toString();
                    r13l11 = Objects.requireNonNull(ds.child("l31").getValue()).toString();
                    r13m11 = Objects.requireNonNull(ds.child("m31").getValue()).toString();
                    r13n11 = Objects.requireNonNull(ds.child("n31").getValue()).toString();


r14a11 = Objects.requireNonNull(ds.child("a41").getValue()).toString();
                    r14d11 = Objects.requireNonNull(ds.child("d41").getValue()).toString();
                    r14l11 = Objects.requireNonNull(ds.child("l41").getValue()).toString();
                    r14m11 = Objects.requireNonNull(ds.child("m41").getValue()).toString();
                    r14n11 = Objects.requireNonNull(ds.child("n41").getValue()).toString();


r15a11 = Objects.requireNonNull(ds.child("a51").getValue()).toString();
                    r15d11 = Objects.requireNonNull(ds.child("d51").getValue()).toString();
                    r15l11 = Objects.requireNonNull(ds.child("l51").getValue()).toString();
                    r15m11 = Objects.requireNonNull(ds.child("m51").getValue()).toString();
                    r15n11 = Objects.requireNonNull(ds.child("n51").getValue()).toString();


r16a11 = Objects.requireNonNull(ds.child("a61").getValue()).toString();
                    r16d11 = Objects.requireNonNull(ds.child("d61").getValue()).toString();
                    r16l11 = Objects.requireNonNull(ds.child("l61").getValue()).toString();
                    r16m11 = Objects.requireNonNull(ds.child("m61").getValue()).toString();
                    r16n11 = Objects.requireNonNull(ds.child("n61").getValue()).toString();


r17a11 = Objects.requireNonNull(ds.child("a71").getValue()).toString();
                    r17d11 = Objects.requireNonNull(ds.child("d71").getValue()).toString();
                    r17l11 = Objects.requireNonNull(ds.child("l71").getValue()).toString();
                    r17m11 = Objects.requireNonNull(ds.child("m71").getValue()).toString();
                    r17n11 = Objects.requireNonNull(ds.child("n71").getValue()).toString();


r18a11 = Objects.requireNonNull(ds.child("a81").getValue()).toString();
                    r18d11 = Objects.requireNonNull(ds.child("d81").getValue()).toString();
                    r18l11 = Objects.requireNonNull(ds.child("l81").getValue()).toString();
                    r18m11 = Objects.requireNonNull(ds.child("m81").getValue()).toString();
                    r18n11 = Objects.requireNonNull(ds.child("n81").getValue()).toString();


r19a11 = Objects.requireNonNull(ds.child("a91").getValue()).toString();
                    r19d11 = Objects.requireNonNull(ds.child("d91").getValue()).toString();
                    r19l11 = Objects.requireNonNull(ds.child("l91").getValue()).toString();
                    r19m11 = Objects.requireNonNull(ds.child("m91").getValue()).toString();
                    r19n11 = Objects.requireNonNull(ds.child("n91").getValue()).toString();


r20a11 = Objects.requireNonNull(ds.child("a101").getValue()).toString();
                    r20d11 = Objects.requireNonNull(ds.child("d101").getValue()).toString();
                    r20l11 = Objects.requireNonNull(ds.child("l101").getValue()).toString();
                    r20m11 = Objects.requireNonNull(ds.child("m101").getValue()).toString();
                    r20n11 = Objects.requireNonNull(ds.child("n101").getValue()).toString();

                   // Toast.makeText(MainActivity.this,"1",Toast.LENGTH_LONG).show();

                }

                    a.setText(a11);
                    d.setText(d11);
                    l.setText(l11);
                    m.setText(m11);
                    n.setText(n11);

                a2.setText(r2a11);
                d2.setText(r2d11);
                l2.setText(r2l11);
                m2.setText(r2m11);
                n2.setText(r2n11);

                a3.setText(r3a11);
                d3.setText(r3d11);
                l3.setText(r3l11);
                m3.setText(r3m11);
                n3.setText(r3n11);

                a4.setText(r4a11);
                d4.setText(r4d11);
                l4.setText(r4l11);
                m4.setText(r4m11);
                n4.setText(r4n11);

                a5.setText(r5a11);
                d5.setText(r5d11);
                l5.setText(r5l11);
                m5.setText(r5m11);
                n5.setText(r5n11);

                a6.setText(r6a11);
                d6.setText(r6d11);
                l6.setText(r6l11);
                m6.setText(r6m11);
                n6.setText(r6n11);

                a7.setText(r7a11);
                d7.setText(r7d11);
                l7.setText(r7l11);
                m7.setText(r7m11);
                n7.setText(r7n11);

                a8.setText(r8a11);
                d8.setText(r8d11);
                l8.setText(r8l11);
                m8.setText(r8m11);
                n8.setText(r8n11);

                a9.setText(r9a11);
                d9.setText(r9d11);
                l9.setText(r9l11);
                m9.setText(r9m11);
                n9.setText(r9n11);

                al1.setText(r11a11);
                dl1.setText(r11d11);
                ll1.setText(r11l11);
                ml1.setText(r11m11);
                nl1.setText(r11n11);

                a21.setText(r12a11);
                d21.setText(r12d11);
                l21.setText(r12l11);
                m21.setText(r12m11);
                n21.setText(r12n11);

                a31.setText(r13a11);
                d31.setText(r13d11);
                l31.setText(r13l11);
                m31.setText(r13m11);
                n31.setText(r13n11);

                a41.setText(r14a11);
                d41.setText(r14d11);
                l41.setText(r14l11);
                m41.setText(r14m11);
                n41.setText(r14n11);

                a51.setText(r15a11);
                d51.setText(r15d11);
                l51.setText(r15l11);
                m51.setText(r15m11);
                n51.setText(r15n11);

                a61.setText(r16a11);
                d61.setText(r16d11);
                l61.setText(r16l11);
                m61.setText(r16m11);
                n61.setText(r16n11);

                a71.setText(r17a11);
                d71.setText(r17d11);
                l71.setText(r17l11);
                m71.setText(r17m11);
                n71.setText(r17n11);

                a81.setText(r18a11);
                d81.setText(r18d11);
                l81.setText(r18l11);
                m81.setText(r18m11);
                n81.setText(r18n11);

                a91.setText(r19a11);
                d91.setText(r19d11);
                l91.setText(r19l11);
                m91.setText(r19m11);
                n91.setText(r19n11);

                a101.setText(r20a11);
                d101.setText(r20d11);
                l101.setText(r20l11);
                m101.setText(r20m11);
                n101.setText(r20n11);



            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        c.setText(String.valueOf(c1));
        g.setText(String.valueOf(g1));
        k.setText(String.valueOf(k1));

        c2.setText(String.valueOf(c12));
        g2.setText(String.valueOf(g12));
        k2.setText(String.valueOf(r2k1));

        c3.setText(String.valueOf(c13));
        g3.setText(String.valueOf(g13));
        k3.setText(String.valueOf(r3k1));

        c4.setText(String.valueOf(c14));
        g4.setText(String.valueOf(g14));
        k4.setText(String.valueOf(r4k1));

        c5.setText(String.valueOf(c15));
        g5.setText(String.valueOf(g15));
        k5.setText(String.valueOf(r5k1));

        c6.setText(String.valueOf(c16));
        g6.setText(String.valueOf(g16));
        k6.setText(String.valueOf(r6k1));

        c7.setText(String.valueOf(c17));
        g7.setText(String.valueOf(g17));
        k7.setText(String.valueOf(r7k1));

        c8.setText(String.valueOf(c18));
        g8.setText(String.valueOf(g18));
        k8.setText(String.valueOf(r8k1));

        c9.setText(String.valueOf(c19));
        g9.setText(String.valueOf(g19));
        k9.setText(String.valueOf(r9k1));

        cl1.setText(String.valueOf(c221));
        gl1.setText(String.valueOf(g221));
        kl1.setText(String.valueOf(r11k1));

        c21.setText(String.valueOf(c231));
        g21.setText(String.valueOf(g231));
        k21.setText(String.valueOf(r12k1));

        c31.setText(String.valueOf(c241));
        g31.setText(String.valueOf(g241));
        k31.setText(String.valueOf(r13k1));

        c41.setText(String.valueOf(c251));
        g41.setText(String.valueOf(g251));
        k41.setText(String.valueOf(r14k1));

        c51.setText(String.valueOf(c261));
        g51.setText(String.valueOf(g261));
        k51.setText(String.valueOf(r16k1));

        c61.setText(String.valueOf(c271));
        g61.setText(String.valueOf(g271));
        k61.setText(String.valueOf(r17k1));

        c71.setText(String.valueOf(c281));
        g71.setText(String.valueOf(g281));
        k71.setText(String.valueOf(r18k1));

        c81.setText(String.valueOf(c291));
        g81.setText(String.valueOf(g291));
        k81.setText(String.valueOf(r19k1));

        c91.setText(String.valueOf(c301));
        g91.setText(String.valueOf(g301));
        k91.setText(String.valueOf(r20k1));

        c101.setText(String.valueOf(c311));
        g101.setText(String.valueOf(g311));
        k101.setText(String.valueOf(r21k1));

        enter = (Button) findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(b.getText().toString()).isEmpty() && !(e.getText().toString()).isEmpty() && !(f.getText().toString()).isEmpty() && !(i.getText().toString()).isEmpty() &&!(b2.getText().toString()).isEmpty() && !(e2.getText().toString()).isEmpty() && !(f2.getText().toString()).isEmpty() && !(i2.getText().toString()).isEmpty()
&&!(b3.getText().toString()).isEmpty() && !(e3.getText().toString()).isEmpty() && !(f3.getText().toString()).isEmpty() && !(i3.getText().toString()).isEmpty()
&&!(b4.getText().toString()).isEmpty() && !(e4.getText().toString()).isEmpty() && !(f4.getText().toString()).isEmpty() && !(i4.getText().toString()).isEmpty()
&&!(b5.getText().toString()).isEmpty() && !(e5.getText().toString()).isEmpty() && !(f5.getText().toString()).isEmpty() && !(i5.getText().toString()).isEmpty()
&&!(b6.getText().toString()).isEmpty() && !(e6.getText().toString()).isEmpty() && !(f6.getText().toString()).isEmpty() && !(i6.getText().toString()).isEmpty()
&&!(b7.getText().toString()).isEmpty() && !(e7.getText().toString()).isEmpty() && !(f7.getText().toString()).isEmpty() && !(i7.getText().toString()).isEmpty()
&&!(b8.getText().toString()).isEmpty() && !(e8.getText().toString()).isEmpty() && !(f8.getText().toString()).isEmpty() && !(i8.getText().toString()).isEmpty()
&&!(b9.getText().toString()).isEmpty() && !(e9.getText().toString()).isEmpty() && !(f9.getText().toString()).isEmpty() && !(i9.getText().toString()).isEmpty()
&&!(bl1.getText().toString()).isEmpty() && !(el1.getText().toString()).isEmpty() && !(fl1.getText().toString()).isEmpty() && !(il1.getText().toString()).isEmpty()
&&!(b21.getText().toString()).isEmpty() && !(e21.getText().toString()).isEmpty() && !(f21.getText().toString()).isEmpty() && !(i21.getText().toString()).isEmpty()
&&!(b31.getText().toString()).isEmpty() && !(e31.getText().toString()).isEmpty() && !(f31.getText().toString()).isEmpty() && !(i31.getText().toString()).isEmpty()
&&!(b41.getText().toString()).isEmpty() && !(e41.getText().toString()).isEmpty() && !(f41.getText().toString()).isEmpty() && !(i41.getText().toString()).isEmpty()
&&!(b51.getText().toString()).isEmpty() && !(e51.getText().toString()).isEmpty() && !(f51.getText().toString()).isEmpty() && !(i51.getText().toString()).isEmpty()
&&!(b61.getText().toString()).isEmpty() && !(e61.getText().toString()).isEmpty() && !(f61.getText().toString()).isEmpty() && !(i61.getText().toString()).isEmpty()
&&!(b71.getText().toString()).isEmpty() && !(e71.getText().toString()).isEmpty() && !(f71.getText().toString()).isEmpty() && !(i71.getText().toString()).isEmpty()
&&!(b81.getText().toString()).isEmpty() && !(e81.getText().toString()).isEmpty() && !(f81.getText().toString()).isEmpty() && !(i81.getText().toString()).isEmpty()
&&!(b91.getText().toString()).isEmpty() && !(e91.getText().toString()).isEmpty() && !(f91.getText().toString()).isEmpty() && !(i91.getText().toString()).isEmpty()
&&!(b101.getText().toString()).isEmpty() && !(e101.getText().toString()).isEmpty() && !(f101.getText().toString()).isEmpty() && !(i101.getText().toString()).isEmpty()){


                b1=Integer.parseInt(b.getText().toString());
                e1=Integer.parseInt(e.getText().toString());
                f1=Integer.parseInt(f.getText().toString());
                i1=Float.parseFloat(i.getText().toString());
                a1=Integer.parseInt(a11);
                d1=Integer.parseInt(d11);
                l1=Float.parseFloat(l11);
                m1=Float.parseFloat(m11);
                n1 =Integer.parseInt(n11);

			b12=Integer.parseInt(b2.getText().toString());
                e12=Integer.parseInt(e2.getText().toString());
                f12=Integer.parseInt(f2.getText().toString());
                r2i1=Float.parseFloat(i2.getText().toString());
                a12=Integer.parseInt(r2a11);
                d12=Integer.parseInt(r2d11);
                r2l1=Float.parseFloat(r2l11);
                r2m1=Float.parseFloat(r2m11);
                n12 =Integer.parseInt(r2n11);


			b13=Integer.parseInt(b3.getText().toString());
                e13=Integer.parseInt(e3.getText().toString());
                f13=Integer.parseInt(f3.getText().toString());
                r3i1=Float.parseFloat(i3.getText().toString());
                a13=Integer.parseInt(r3a11);
                d13=Integer.parseInt(r3d11);
                r3l1=Float.parseFloat(r3l11);
                r3m1=Float.parseFloat(r3m11);
                n13 =Integer.parseInt(r3n11);


			b14=Integer.parseInt(b4.getText().toString());
                e14=Integer.parseInt(e4.getText().toString());
                f14=Integer.parseInt(f4.getText().toString());
                r4i1=Float.parseFloat(i4.getText().toString());
                a14=Integer.parseInt(r4a11);
                d14=Integer.parseInt(r4d11);
                r4l1=Float.parseFloat(r4l11);
                r4m1=Float.parseFloat(r4m11);
                n14 =Integer.parseInt(r4n11);


			b15=Integer.parseInt(b5.getText().toString());
                e15=Integer.parseInt(e5.getText().toString());
                f15=Integer.parseInt(f5.getText().toString());
                r5i1=Float.parseFloat(i5.getText().toString());
                a15=Integer.parseInt(r5a11);
                d15=Integer.parseInt(r5d11);
                r5l1=Float.parseFloat(r5l11);
                r5m1=Float.parseFloat(r5m11);
                n15 =Integer.parseInt(r5n11);


			b16=Integer.parseInt(b6.getText().toString());
                e16=Integer.parseInt(e6.getText().toString());
                f16=Integer.parseInt(f6.getText().toString());
                r6i1=Float.parseFloat(i6.getText().toString());
                a16=Integer.parseInt(r6a11);
                d16=Integer.parseInt(r6d11);
                r6l1=Float.parseFloat(r6l11);
                r6m1=Float.parseFloat(r6m11);
                n16 =Integer.parseInt(r6n11);


			b17=Integer.parseInt(b7.getText().toString());
                e17=Integer.parseInt(e7.getText().toString());
                f17=Integer.parseInt(f7.getText().toString());
                r7i1=Float.parseFloat(i7.getText().toString());
                a17=Integer.parseInt(r7a11);
                d17=Integer.parseInt(r7d11);
                r7l1=Float.parseFloat(r7l11);
                r7m1=Float.parseFloat(r7m11);
                n17 =Integer.parseInt(r7n11);


			b18=Integer.parseInt(b8.getText().toString());
                e18=Integer.parseInt(e8.getText().toString());
                f18=Integer.parseInt(f8.getText().toString());
                r8i1=Float.parseFloat(i8.getText().toString());
                a18=Integer.parseInt(r8a11);
                d18=Integer.parseInt(r8d11);
                r8l1=Float.parseFloat(r8l11);
                r8m1=Float.parseFloat(r8m11);
                n18 =Integer.parseInt(r8n11);


			b19=Integer.parseInt(b9.getText().toString());
                e19=Integer.parseInt(e9.getText().toString());
                f19=Integer.parseInt(f9.getText().toString());
                r9i1=Float.parseFloat(i9.getText().toString());
                a19=Integer.parseInt(r9a11);
                d19=Integer.parseInt(r9d11);
                r9l1=Float.parseFloat(r9l11);
                r9m1=Float.parseFloat(r9m11);
                n19 =Integer.parseInt(r9n11);


			b221=Integer.parseInt(bl1.getText().toString());
                e221=Integer.parseInt(el1.getText().toString());
                f221=Integer.parseInt(fl1.getText().toString());
                r11i1=Float.parseFloat(il1.getText().toString());
                a221=Integer.parseInt(r11a11);
                d221=Integer.parseInt(r11d11);
                r11l1=Float.parseFloat(r11l11);
                r11m1=Float.parseFloat(r11m11);
                n221 =Integer.parseInt(r11n11);


			b231=Integer.parseInt(b21.getText().toString());
                e231=Integer.parseInt(e21.getText().toString());
                f231=Integer.parseInt(f21.getText().toString());
                r12i1=Float.parseFloat(i21.getText().toString());
                a221=Integer.parseInt(r12a11);
                d221=Integer.parseInt(r12d11);
                r12l1=Float.parseFloat(r12l11);
                r12m1=Float.parseFloat(r12m11);
                n221 =Integer.parseInt(r12n11);


			b241=Integer.parseInt(b31.getText().toString());
                e241=Integer.parseInt(e31.getText().toString());
                f241=Integer.parseInt(f31.getText().toString());
                r13i1=Float.parseFloat(i31.getText().toString());
                a241=Integer.parseInt(r13a11);
                d241=Integer.parseInt(r13d11);
                r13l1=Float.parseFloat(r13l11);
                r13m1=Float.parseFloat(r13m11);
                n241 =Integer.parseInt(r13n11);


			b251=Integer.parseInt(b41.getText().toString());
                e251=Integer.parseInt(e41.getText().toString());
                f251=Integer.parseInt(f41.getText().toString());
                r14i1=Float.parseFloat(i41.getText().toString());
                a241=Integer.parseInt(r14a11);
                d241=Integer.parseInt(r14d11);
                r14l1=Float.parseFloat(r14l11);
                r14m1=Float.parseFloat(r14m11);
                n241 =Integer.parseInt(r14n11);


			b251=Integer.parseInt(b51.getText().toString());
                e251=Integer.parseInt(e51.getText().toString());
                f251=Integer.parseInt(f51.getText().toString());
                r16i1=Float.parseFloat(i51.getText().toString());
                a251=Integer.parseInt(r15a11);
                d251=Integer.parseInt(r15d11);
                r16l1=Float.parseFloat(r15l11);
                r16m1=Float.parseFloat(r15m11);
                n251 =Integer.parseInt(r15n11);


			b261=Integer.parseInt(b61.getText().toString());
                e261=Integer.parseInt(e61.getText().toString());
                f261=Integer.parseInt(f61.getText().toString());
                r17i1=Float.parseFloat(i61.getText().toString());
                a261=Integer.parseInt(r16a11);
                d261=Integer.parseInt(r16d11);
                r17l1=Float.parseFloat(r16l11);
                r17m1=Float.parseFloat(r16m11);
                n261 =Integer.parseInt(r16n11);


			b271=Integer.parseInt(b71.getText().toString());
                e271=Integer.parseInt(e71.getText().toString());
                f271=Integer.parseInt(f71.getText().toString());
                r18i1=Float.parseFloat(i71.getText().toString());
                a271=Integer.parseInt(r17a11);
                d271=Integer.parseInt(r17d11);
                r18l1=Float.parseFloat(r17l11);
                r18m1=Float.parseFloat(r17m11);
                n271 =Integer.parseInt(r17n11);


			b281=Integer.parseInt(b81.getText().toString());
                e281=Integer.parseInt(e81.getText().toString());
                f281=Integer.parseInt(f81.getText().toString());
                r19i1=Float.parseFloat(i81.getText().toString());
                a281=Integer.parseInt(r18a11);
                d281=Integer.parseInt(r18d11);
                r19l1=Float.parseFloat(r18l11);
                r19m1=Float.parseFloat(r18m11);
                n281 =Integer.parseInt(r18n11);


			b291=Integer.parseInt(b91.getText().toString());
                e291=Integer.parseInt(e91.getText().toString());
                f291=Integer.parseInt(f91.getText().toString());
                r20i1=Float.parseFloat(i91.getText().toString());
                a291=Integer.parseInt(r19a11);
                d291=Integer.parseInt(r19d11);
                r20l1=Float.parseFloat(r19l11);
                r20m1=Float.parseFloat(r19m11);
                n291 =Integer.parseInt(r19n11);


			b301=Integer.parseInt(b101.getText().toString());
                e301=Integer.parseInt(e101.getText().toString());
                f301=Integer.parseInt(f101.getText().toString());
                r21i1=Float.parseFloat(i101.getText().toString());
                a301=Integer.parseInt(r20a11);
                d301=Integer.parseInt(r20d11);
                r21l1=Float.parseFloat(r20l11);
                r21m1=Float.parseFloat(r20m11);
                n301 =Integer.parseInt(r20n11);


               c1=a1+b1;
               d1=d1+c1;
               g1=e1+f1;
               k1=g1*i1;
               l1=l1+g1;
               m1=m1+k1;
               n1=g1-c1;

                    c12=a12+b12;
                    d12=d12+c12;
                    g12=e12+f12;
                    r2k1=g12*r2i1;
                    r2l1=r2l1+g12;
                    r2m1=r2m1+r2k1;
                    n12=g12-c12;

                    c13=a13+b13;
                    d13=d13+c13;
                    g13=e13+f13;
                    r3k1=g13*r3i1;
                    r3l1=r3l1+g13;
                    r3m1=r3m1+r3k1;
                    n13=g13-c13;

                    c14=a14+b14;
                    d14=d14+c14;
                    g14=e14+f14;
                    r4k1=g14*r4i1;
                    r4l1=r4l1+g14;
                    r4m1=r4m1+r4k1;
                    n14=g14-c14;

                    c15=a15+b15;
                    d15=d15+c15;
                    g15=e15+f15;
                    r5k1=g15*r5i1;
                    r5l1=r5l1+g15;
                    r5m1=r5m1+r5k1;
                    n15=g15-c15;

                    c16=a16+b16;
                    d16=d16+c16;
                    g16=e16+f16;
                    r6k1=g16*r6i1;
                    r6l1=r6l1+g16;
                    r6m1=r6m1+r6k1;
                    n16=g16-c16;

                    c17=a17+b17;
                    d17=d17+c17;
                    g17=e17+f17;
                    r7k1=g17*r7i1;
                    r7l1=r7l1+g17;
                    r7m1=r7m1+r7k1;
                    n17=g17-c17;

                    c18=a18+b18;
                    d18=d18+c18;
                    g18=e18+f18;
                    r8k1=g18*r8i1;
                    r8l1=r8l1+g18;
                    r8m1=r8m1+r8k1;
                    n18=g18-c18;

                    c19=a19+b19;
                    d19=d19+c19;
                    g19=e19+f19;
                    r9k1=g19*r9i1;
                    r9l1=r9l1+g19;
                    r9m1=r9m1+r9k1;
                    n19=g19-c19;
//subtotal
                    a211=a1+a12+a13+a14+a15+a16+a17+a18+a19;
                    b211=b1+b12+b13+b14+b15+b16+b17+b18+b19;
                    c211=c1+c12+c13+c14+c15+c16+c17+c18+c19;
                    d211=d1+d12+d13+d14+d15+d16+d17+d18+d19;
                    e211=e1+e12+e13+e14+e15+e16+e17+e18+e19;
                    f211=f1+f12+f13+f14+f15+f16+f17+f18+f19;
                    g211=g1+g12+g13+g14+g15+g16+g17+g18+g19;
                    r10i1=i1+r2i1+r3i1+r4i1+r5i1+r6i1+r7i1+r8i1+r9i1;
                    r10k1=k1+r2k1+r3k1+r4k1+r5k1+r6k1+r7k1+r8k1+r9k1;
                    r10l1=l1+r2l1+r3l1+r4l1+r5l1+r6l1+r7l1+r8l1+r9l1;
                    r10m1=m1+r2m1+r3m1+r4m1+r5m1+r6m1+r7m1+r8m1+r9m1;
                    n211=n1+n12+n13+n14+n15+n16+n17+n18+n19;


                    c221=a221+b221;
                    d221=d221+c221;
                    g221=e221+f221;
                    r11k1=g221*r11i1;
                    r11l1=r11l1+g211;
                    r11m1=r11m1+r11k1;
                    n221=g221-c221;

                    c231=a231+b231;
                    d231=d231+c231;
                    g231=e231+f231;
                    r12k1=g231*r12i1;
                    r12l1=r12l1+g231;
                    r12m1=r12m1+r12k1;
                    n231=g231-c231;

                    c241=a241+b241;
                    d241=d241+c241;
                    g241=e241+f241;
                    r13k1=g241*r13i1;
                    r13l1=r13l1+g241;
                    r13m1=r13m1+r13k1;
                    n241=g241-c241;

                    c251=a251+b251;
                    d251=d251+c251;
                    g251=e251+f251;
                    r14k1=g251*r14i1;
                    r14l1=r14l1+g251;
                    r14m1=r14m1+r14k1;
                    n251=g251-c251;

                    c261=a261+b261;
                    d261=d261+c261;
                    g261=e261+f261;
                    r16k1=g261*r16i1;
                    r16l1=r16l1+g261;
                    r16m1=r16m1+r16k1;
                    n261=g261-c261;

                    c271=a271+b271;
                    d271=d271+c271;
                    g271=e271+f271;
                    r17k1=g271*r17i1;
                    r17l1=r17l1+g271;
                    r17m1=r17m1+r17k1;
                    n271=g271-c271;

                    c281=a281+b281;
                    d281=d281+c281;
                    g281=e281+f281;
                    r18k1=g281*r18i1;
                    r18l1=r18l1+g281;
                    r18m1=r18m1+r18k1;
                    n281=g281-c281;

                    c291=a291+b291;
                    d291=d291+c291;
                    g291=e291+f291;
                    r19k1=g291*r19i1;
                    r19l1=r19l1+g291;
                    r19m1=r19m1+r19k1;
                    n291=g291-c291;

                    c301=a301+b301;
                    d301=d301+c301;
                    g301=e301+f301;
                    r20k1=g301*r20i1;
                    r20l1=r20l1+g301;
                    r20m1=r20m1+r20k1;
                    n301=g301-c301;

                    c311=a311+b311;
                    d311=d311+c311;
                    g311=e311+f311;
                    r21k1=g311*r21i1;
                    r21l1=r21l1+g311;
                    r21m1=r21m1+r21k1;
                    n311=g311-c311;
//subtotal

                    a321=a221+a231+a241+a251+a261+a271+a281+a291+a301+a311;
                    b321=b221+b231+b241+b251+b261+b271+b281+b291+b301+b311;
                    c321=c221+c231+c241+c251+c261+c271+c281+c291+c301+c311;
                    d321=d221+d231+d241+d251+d261+d271+d281+d291+d301+d311;
                    e321=e221+e231+e241+e251+e261+e271+e281+e291+e301+e311;
                    f321=f221+f231+f241+f251+f261+f271+f281+f291+f301+f311;
                    g321=g221+g231+g241+g251+g261+g271+g281+g291+g301+g311;
                    r22i1=r11i1+r12i1+r13i1+r14i1+r16i1+r17i1+r18i1+r19i1+r20i1+r21i1;
                    r22k1=r11k1+r12k1+r13k1+r14k1+r16k1+r17k1+r18k1+r19k1+r20k1+r21k1;
                    r22l1=r11l1+r12l1+r13l1+r14l1+r16l1+r17l1+r18l1+r19l1+r20l1+r21l1;
                    r22m1=r11m1+r12m1+r13m1+r14m1+r16m1+r17m1+r18m1+r19m1+r20m1+r21m1;
                    n321=n221+n231+n241+n251+n261+n271+n281+n291+n301+n311;

//total

                    a331=a211+a321;
                    b331=b211+b321;
                    c331=c211+c321;
                    d331=d211+d321;
                    e331=e211+e321;
                    f331=f211+f321;
                    g331=g211+g321;
                    r23i1=r10i1+r22i1;
                    r23k1=r10k1+r22k1;
                    r23l1=r10l1+r22l1;
                    r23m1=r10m1+r22m1;
                    n331=n211+n321;




               rootDr.child(uid).child("user").child("a").setValue(String.valueOf(n1));
                rootDr.child(uid).child("user").child("d").setValue(String.valueOf(d1));
                rootDr.child(uid).child("user").child("l").setValue(String.valueOf(l1));
                rootDr.child(uid).child("user").child("m").setValue(String.valueOf(m1));
                rootDr.child(uid).child("user").child("n").setValue(String.valueOf(n1));


                                rootDr.child(uid).child("user").child("a2").setValue(String.valueOf(n12));
                                rootDr.child(uid).child("user").child("d2").setValue(String.valueOf(d12));
                                rootDr.child(uid).child("user").child("l2").setValue(String.valueOf(r2l1));
                                rootDr.child(uid).child("user").child("m2").setValue(String.valueOf(r2m1));
                                rootDr.child(uid).child("user").child("n2").setValue(String.valueOf(n12));

                                rootDr.child(uid).child("user").child("a3").setValue(String.valueOf(n13));
                                rootDr.child(uid).child("user").child("d3").setValue(String.valueOf(d13));
                                rootDr.child(uid).child("user").child("l3").setValue(String.valueOf(r3l1));
                                rootDr.child(uid).child("user").child("m3").setValue(String.valueOf(r3m1));
                                rootDr.child(uid).child("user").child("n3").setValue(String.valueOf(n13));

                                rootDr.child(uid).child("user").child("a4").setValue(String.valueOf(n14));
                                rootDr.child(uid).child("user").child("d4").setValue(String.valueOf(d14));
                                rootDr.child(uid).child("user").child("l4").setValue(String.valueOf(r4l1));
                                rootDr.child(uid).child("user").child("m4").setValue(String.valueOf(r4m1));
                                rootDr.child(uid).child("user").child("n4").setValue(String.valueOf(n14));

                                rootDr.child(uid).child("user").child("a5").setValue(String.valueOf(n15));
                                rootDr.child(uid).child("user").child("d5").setValue(String.valueOf(d15));
                                rootDr.child(uid).child("user").child("l5").setValue(String.valueOf(r5l1));
                                rootDr.child(uid).child("user").child("m5").setValue(String.valueOf(r5m1));
                                rootDr.child(uid).child("user").child("n5").setValue(String.valueOf(n15));

                                rootDr.child(uid).child("user").child("a6").setValue(String.valueOf(n16));
                                rootDr.child(uid).child("user").child("d6").setValue(String.valueOf(d16));
                                rootDr.child(uid).child("user").child("l6").setValue(String.valueOf(r6l1));
                                rootDr.child(uid).child("user").child("m6").setValue(String.valueOf(r6m1));
                                rootDr.child(uid).child("user").child("n6").setValue(String.valueOf(n16));

                                rootDr.child(uid).child("user").child("a7").setValue(String.valueOf(n17));
                                rootDr.child(uid).child("user").child("d7").setValue(String.valueOf(d17));
                                rootDr.child(uid).child("user").child("l7").setValue(String.valueOf(r7l1));
                                rootDr.child(uid).child("user").child("m7").setValue(String.valueOf(r7m1));
                                rootDr.child(uid).child("user").child("n7").setValue(String.valueOf(n17));

                                rootDr.child(uid).child("user").child("a8").setValue(String.valueOf(n18));
                                rootDr.child(uid).child("user").child("d8").setValue(String.valueOf(d18));
                                rootDr.child(uid).child("user").child("l8").setValue(String.valueOf(r8l1));
                                rootDr.child(uid).child("user").child("m8").setValue(String.valueOf(r8m1));
                                rootDr.child(uid).child("user").child("n8").setValue(String.valueOf(n18));

                                rootDr.child(uid).child("user").child("a9").setValue(String.valueOf(n19));
                                rootDr.child(uid).child("user").child("d9").setValue(String.valueOf(d19));
                                rootDr.child(uid).child("user").child("l9").setValue(String.valueOf(r9l1));
                                rootDr.child(uid).child("user").child("m9").setValue(String.valueOf(r9m1));
                                rootDr.child(uid).child("user").child("n9").setValue(String.valueOf(n19));

                                rootDr.child(uid).child("user").child("a1").setValue(String.valueOf(n221));
                                rootDr.child(uid).child("user").child("d1").setValue(String.valueOf(d221));
                                rootDr.child(uid).child("user").child("l1").setValue(String.valueOf(r11l1));
                                rootDr.child(uid).child("user").child("m1").setValue(String.valueOf(r11m1));
                                rootDr.child(uid).child("user").child("n1").setValue(String.valueOf(n221));

                                rootDr.child(uid).child("user").child("a21").setValue(String.valueOf(n231));
                                rootDr.child(uid).child("user").child("d21").setValue(String.valueOf(d231));
                                rootDr.child(uid).child("user").child("l21").setValue(String.valueOf(r12l1));
                                rootDr.child(uid).child("user").child("m21").setValue(String.valueOf(r12m1));
                                rootDr.child(uid).child("user").child("n21").setValue(String.valueOf(n231));

                                rootDr.child(uid).child("user").child("a31").setValue(String.valueOf(n241));
                                rootDr.child(uid).child("user").child("d31").setValue(String.valueOf(d241));
                                rootDr.child(uid).child("user").child("l31").setValue(String.valueOf(r13l1));
                                rootDr.child(uid).child("user").child("m31").setValue(String.valueOf(r13m1));
                                rootDr.child(uid).child("user").child("n31").setValue(String.valueOf(n241));

                                rootDr.child(uid).child("user").child("a41").setValue(String.valueOf(n251));
                                rootDr.child(uid).child("user").child("d41").setValue(String.valueOf(d251));
                                rootDr.child(uid).child("user").child("l41").setValue(String.valueOf(r14l1));
                                rootDr.child(uid).child("user").child("m41").setValue(String.valueOf(r14m1));
                                rootDr.child(uid).child("user").child("n41").setValue(String.valueOf(n251));

                                rootDr.child(uid).child("user").child("a51").setValue(String.valueOf(n261));
                                rootDr.child(uid).child("user").child("d51").setValue(String.valueOf(d261));
                                rootDr.child(uid).child("user").child("l51").setValue(String.valueOf(r16l1));
                                rootDr.child(uid).child("user").child("m51").setValue(String.valueOf(r16m1));
                                rootDr.child(uid).child("user").child("n51").setValue(String.valueOf(n261));

                                rootDr.child(uid).child("user").child("a61").setValue(String.valueOf(n271));
                                rootDr.child(uid).child("user").child("d61").setValue(String.valueOf(d271));
                                rootDr.child(uid).child("user").child("l61").setValue(String.valueOf(r17l1));
                                rootDr.child(uid).child("user").child("m61").setValue(String.valueOf(r17m1));
                                rootDr.child(uid).child("user").child("n61").setValue(String.valueOf(n271));

                                rootDr.child(uid).child("user").child("a71").setValue(String.valueOf(n281));
                                rootDr.child(uid).child("user").child("d71").setValue(String.valueOf(d281));
                                rootDr.child(uid).child("user").child("l71").setValue(String.valueOf(r18l1));
                                rootDr.child(uid).child("user").child("m71").setValue(String.valueOf(r18m1));
                                rootDr.child(uid).child("user").child("n71").setValue(String.valueOf(n261));

                                rootDr.child(uid).child("user").child("a81").setValue(String.valueOf(n291));
                                rootDr.child(uid).child("user").child("d81").setValue(String.valueOf(d291));
                                rootDr.child(uid).child("user").child("l81").setValue(String.valueOf(r19l1));
                                rootDr.child(uid).child("user").child("m81").setValue(String.valueOf(r19m1));
                                rootDr.child(uid).child("user").child("n81").setValue(String.valueOf(n291));

                                rootDr.child(uid).child("user").child("a91").setValue(String.valueOf(n301));
                                rootDr.child(uid).child("user").child("d91").setValue(String.valueOf(d301));
                                rootDr.child(uid).child("user").child("l91").setValue(String.valueOf(r20l1));
                                rootDr.child(uid).child("user").child("m91").setValue(String.valueOf(r20m1));
                                rootDr.child(uid).child("user").child("n91").setValue(String.valueOf(n301));

                                rootDr.child(uid).child("user").child("a101").setValue(String.valueOf(n321));
                                rootDr.child(uid).child("user").child("d101").setValue(String.valueOf(d321));
                                rootDr.child(uid).child("user").child("l101").setValue(String.valueOf(r21l1));
                                rootDr.child(uid).child("user").child("m101").setValue(String.valueOf(r21m1));
                                rootDr.child(uid).child("user").child("n101").setValue(String.valueOf(n321));


               // c.setText(String.valueOf(c1));
               // d.setText(String.valueOf(d1));
               // g.setText(String.valueOf(g1));
               // k.setText(String.valueOf(k1));
                //l.setText(String.valueOf(l1));
               // m.setText(String.valueOf(m1));
               // n.setText(String.valueOf(n1));
                //a.setText(String.valueOf(n1));

//a.setText(a11);
                    d.setText(String.valueOf(d1));
                    l.setText(String.valueOf(l1));
                    m.setText(String.valueOf(m1));
                    n.setText(String.valueOf(n1));

               // a2.setText(r2a11);
                d2.setText(String.valueOf(d12));
                l2.setText(String.valueOf(r2l1));
                m2.setText(String.valueOf(r2m1));
                n2.setText(String.valueOf(n12));

               // a3.setText(r3a11);
                d3.setText(String.valueOf(d13));
                l3.setText(String.valueOf(r3l1));
                m3.setText(String.valueOf(r3m1));
                n3.setText(String.valueOf(n13));

              //  a4.setText(r4a11);
                d4.setText(String.valueOf(d4));
                l4.setText(String.valueOf(r4l1));
                m4.setText(String.valueOf(r4m1));
                n4.setText(String.valueOf(n14));

              //  a5.setText(r5a11);
                d5.setText(String.valueOf(d15));
                l5.setText(String.valueOf(r5l1));
                m5.setText(String.valueOf(r5m1));
                n5.setText(String.valueOf(n15));

               // a6.setText(r6a11);
                d6.setText(String.valueOf(d16));
                l6.setText(String.valueOf(r6l1));
                m6.setText(String.valueOf(r6m1));
                n6.setText(String.valueOf(n16));

              //  a7.setText(r7a11);
                d7.setText(String.valueOf(d17));
                l7.setText(String.valueOf(r7l1));
                m7.setText(String.valueOf(r7m1));
                n7.setText(String.valueOf(n17));

              //  a8.setText(r8a11);
                d8.setText(String.valueOf(d18));
                l8.setText(String.valueOf(r8l1));
                m8.setText(String.valueOf(r8m1));
                n8.setText(String.valueOf(n18));

              //  a9.setText(r9a11);
                d9.setText(String.valueOf(d19));
                l9.setText(String.valueOf(r9l1));
                m9.setText(String.valueOf(r9m1));
                n9.setText(String.valueOf(n19));

                  a10.setText(String.valueOf(a211));
                    d10.setText(String.valueOf(d211));
                    l10.setText(String.valueOf(r10l1));
                    m10.setText(String.valueOf(r10m1));
                    n10.setText(String.valueOf(n211));

              //  al1.setText(r11a11);
                dl1.setText(String.valueOf(d221));
                ll1.setText(String.valueOf(r11l1));
                ml1.setText(String.valueOf(r11m1));
                nl1.setText(String.valueOf(n221));

               // a21.setText(r12a11);
                d21.setText(String.valueOf(d231));
                l21.setText(String.valueOf(r12l1));
                m21.setText(String.valueOf(r12m1));
                n21.setText(String.valueOf(n231));

              //  a31.setText(r13a11);
                d31.setText(String.valueOf(d241));
                l31.setText(String.valueOf(r13l1));
                m31.setText(String.valueOf(r13m1));
                n31.setText(String.valueOf(n241));

              //  a41.setText(r14a11);
                d41.setText(String.valueOf(d251));
                l41.setText(String.valueOf(r14l1));
                m41.setText(String.valueOf(r14m1));
                n41.setText(String.valueOf(n251));

               // a51.setText(r15a11);
                d51.setText(String.valueOf(d261));
                l51.setText(String.valueOf(r16l1));
                m51.setText(String.valueOf(r16m1));
                n51.setText(String.valueOf(n261));

              //  a61.setText(r16a11);
                d61.setText(String.valueOf(d271));
                l61.setText(String.valueOf(r17l1));
                m61.setText(String.valueOf(r17m1));
                n61.setText(String.valueOf(n271));

                //a71.setText(r17a11);
                d71.setText(String.valueOf(d281));
                l71.setText(String.valueOf(r18l1));
                m71.setText(String.valueOf(r18m1));
                n71.setText(String.valueOf(n281));

              //  a81.setText(r18a11);
                d81.setText(String.valueOf(d291));
                l81.setText(String.valueOf(r19l1));
                m81.setText(String.valueOf(r19m1));
                n81.setText(String.valueOf(n291));

               // a91.setText(r19a11);
                d91.setText(String.valueOf(d301));
                l91.setText(String.valueOf(r20l1));
                m91.setText(String.valueOf(r20m1));
                n91.setText(String.valueOf(n301));

               // a101.setText(r20a11);
                d101.setText(String.valueOf(d311));
                l101.setText(String.valueOf(r21l1));
                m101.setText(String.valueOf(r21m1));
                n101.setText(String.valueOf(n311));

                    a111.setText(String.valueOf(a321));
                    d111.setText(String.valueOf(d321));
                    l111.setText(String.valueOf(r22l1));
                    m111.setText(String.valueOf(r22m1));
                    n111.setText(String.valueOf(n321));

                     a121.setText(String.valueOf(a331));
                    d121.setText(String.valueOf(d331));
                    l121.setText(String.valueOf(r23l1));
                    m121.setText(String.valueOf(r23m1));
                    n121.setText(String.valueOf(n331));


		c.setText(String.valueOf(c1));
        g.setText(String.valueOf(g1));
        k.setText(String.valueOf(k1));

        c2.setText(String.valueOf(c12));
        g2.setText(String.valueOf(g12));
        k2.setText(String.valueOf(r2k1));

        c3.setText(String.valueOf(c13));
        g3.setText(String.valueOf(g13));
        k3.setText(String.valueOf(r3k1));

        c4.setText(String.valueOf(c14));
        g4.setText(String.valueOf(g14));
        k4.setText(String.valueOf(r4k1));

        c5.setText(String.valueOf(c15));
        g5.setText(String.valueOf(g15));
        k5.setText(String.valueOf(r5k1));

        c6.setText(String.valueOf(c16));
        g6.setText(String.valueOf(g16));
        k6.setText(String.valueOf(r6k1));

        c7.setText(String.valueOf(c17));
        g7.setText(String.valueOf(g17));
        k7.setText(String.valueOf(r7k1));

        c8.setText(String.valueOf(c18));
        g8.setText(String.valueOf(g18));
        k8.setText(String.valueOf(r8k1));

        c9.setText(String.valueOf(c19));
        g9.setText(String.valueOf(g19));
        k9.setText(String.valueOf(r9k1));

                    c10.setText(String.valueOf(c211));
                    g10.setText(String.valueOf(g211));
                    k10.setText(String.valueOf(r10k1));

        cl1.setText(String.valueOf(c221));
        gl1.setText(String.valueOf(g221));
        kl1.setText(String.valueOf(r11k1));

        c21.setText(String.valueOf(c231));
        g21.setText(String.valueOf(g231));
        k21.setText(String.valueOf(r12k1));

        c31.setText(String.valueOf(c241));
        g31.setText(String.valueOf(g241));
        k31.setText(String.valueOf(r13k1));

        c41.setText(String.valueOf(c251));
        g41.setText(String.valueOf(g251));
        k41.setText(String.valueOf(r14k1));

        c51.setText(String.valueOf(c261));
        g51.setText(String.valueOf(g261));
        k51.setText(String.valueOf(r16k1));

        c61.setText(String.valueOf(c271));
        g61.setText(String.valueOf(g271));
        k61.setText(String.valueOf(r17k1));

        c71.setText(String.valueOf(c281));
        g71.setText(String.valueOf(g281));
        k71.setText(String.valueOf(r18k1));

        c81.setText(String.valueOf(c291));
        g81.setText(String.valueOf(g291));
        k81.setText(String.valueOf(r19k1));

        c91.setText(String.valueOf(c301));
        g91.setText(String.valueOf(g301));
        k91.setText(String.valueOf(r20k1));

        c101.setText(String.valueOf(c311));
        g101.setText(String.valueOf(g311));
        k101.setText(String.valueOf(r21k1));

                    c111.setText(String.valueOf(c321));
                    g111.setText(String.valueOf(g321));
                    k111.setText(String.valueOf(r22k1));

                    c121.setText(String.valueOf(c331));
                    g121.setText(String.valueOf(g331));
                    k121.setText(String.valueOf(r23k1));


                Toast.makeText(MainActivity.this,"Done",Toast.LENGTH_LONG).show();
                }{
                Toast.makeText(MainActivity.this,"Fields are empty",Toast.LENGTH_LONG).show();}
            }
        });

        logout = findViewById(R.id.logout);

        gOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gClient = GoogleSignIn.getClient(this, gOptions);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gClient.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        finish();
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    }
                });
            }
        });


    }
    @RequiresApi(api = Build.VERSION_CODES.TIRAMISU)
    public void buttonPrint(View view) throws IOException {
        ActivityCompat.requestPermissions(this,
                new String[]{READ_MEDIA_IMAGES, WRITE_EXTERNAL_STORAGE},
                PackageManager.PERMISSION_GRANTED);
        PdfDocument pdfDocument = new PdfDocument();
        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(tableLayout.getWidth(),
                tableLayout.getHeight(),
                1).create();

        PdfDocument.Page page = pdfDocument.startPage(pageInfo);
        tableLayout.draw(page.getCanvas());
        pdfDocument.finishPage(page);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            pdfDocument.writeTo(Files.newOutputStream(filePDFOutput.toPath()));
        }
        pdfDocument.close();
        Toast.makeText(MainActivity.this,"Check Download Folder",Toast.LENGTH_LONG).show();
    }
}
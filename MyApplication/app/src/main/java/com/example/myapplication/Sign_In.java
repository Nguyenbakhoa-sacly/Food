package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Sign_In extends AppCompatActivity {
    Button btn_signin,btn_signup;
    CheckBox check;
    TextView txt_signin;
    ImageView back_signup;
    EditText edt_pass,edt_user;
    SharedPreferences sharedPreferences ;
    String ten,mk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
//        sharedPreferences = getSharedPreferences("dataLogin",MODE_PRIVATE);
//        edt_user.setText(sharedPreferences.getString("taikhoan",""));
//        edt_pass.setText(sharedPreferences.getString("matkhau",""));
//        check.setChecked(sharedPreferences.getBoolean("check",false));
        anhxa();

        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username= edt_user.getText().toString();
                String pass = edt_pass.getText().toString();
                if(edt_user.getText().length() != 0 && edt_pass.getText().length() != 0 ) {
                    //didlog sign up

                    if (edt_user.getText().toString().equals(ten) && edt_pass.getText().toString().equals(mk)) {
                        Toast.makeText(Sign_In.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Sign_In.this, MainActivity.class);
                        startActivity(intent);
                    }
                    //sign in
                    else if(username.equals("khoa1") && pass.equals("123")){
                        Toast.makeText(Sign_In.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
//                        if(check.isChecked()){
//                            SharedPreferences.Editor editor= sharedPreferences.edit();
//                            editor.putString("taikhoan",username);
//                            editor.putString("matkhau",pass);
//                            editor.putBoolean("check",true);
//                            editor.commit();
//
//                        }else{
//                            SharedPreferences.Editor editor= sharedPreferences.edit();
//                            editor.remove("taikhoan");
//                            editor.remove("matkhau");
//                            editor.remove("check");
//                            editor.commit();
//                        }
                        Intent intent = new Intent(Sign_In.this, MainActivity.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(Sign_In.this, "Bạn đà đăng nhập thất bại", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(Sign_In.this, "Mời bạn đăng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show();
                }
            }

        });

        txt_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(Sign_In.this );
                dialog.setCancelable(false);
                dialog.setContentView(R.layout.sign_up);
                ImageView back_signup = (ImageView) dialog.findViewById(R.id.back_signup) ;
                EditText edt_user_signup = (EditText) dialog.findViewById(R.id.edt_user_signup);
                EditText edt_pass_signup= (EditText)  dialog.findViewById(R.id.edt_pass_signup) ;
                Button btn_signup = (Button) dialog.findViewById(R.id.btn_signup);

                back_signup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.cancel();
                    }
                });

                btn_signup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ten = edt_user_signup.getText().toString().trim();
                        mk = edt_pass_signup.getText().toString().trim();
                        edt_pass.setText(mk);
                        edt_user.setText(ten);
                        dialog.cancel();
                    }
                });
                dialog.show();
            }
        });

    }

    private void anhxa() {
        btn_signin = (Button) findViewById(R.id.btn_signin);
        check = (CheckBox) findViewById(R.id.check);
        edt_pass = (EditText) findViewById(R.id.edt_pass);
        edt_user = (EditText) findViewById(R.id.edt_user);
        txt_signin = (TextView) findViewById(R.id.txt_signin);
    }
}

package com.example.bai2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTaiKhoan;
    EditText edtMatKhau;
    Button btnDangNhap,btnThoat;
    CheckBox checkboxLuu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkboxLuu.isChecked()){
                    Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống , thông tin của bạn sẽ được lưu",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"Chào mừng bạn đăng nhập hệ thống , thông tin của bạn sẽ không được lưu",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setMessage("Bạn có muốn thoát không");
                builder.setTitle("Thông báo");
                builder.setIcon(R.mipmap.ic_launcher);
                builder.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        finish();
                    }
                });
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = builder.create();
                builder.show();
            }
        });
    }

    public void AnhXa(){
        edtTaiKhoan = findViewById(R.id.edtTaiKhoan);
        edtMatKhau = findViewById(R.id.edtMatKhau);

        checkboxLuu = findViewById(R.id.checkboxLuu);

        btnDangNhap = findViewById(R.id.btnDangNhap);
        btnThoat = findViewById(R.id.btnThoat);
    }
}

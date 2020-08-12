package com.example.bai5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnDangNhap;
    EditText edtID;
    EditText edtTen;
    RadioGroup radioGroup;
    RadioButton radFull,radPart;
    List<Employee> list;
    ListView lv;
    ArrayAdapter<Employee> adapter;

    Employee emp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        list = new ArrayList<>();
        adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,list);
        lv.setAdapter(adapter);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thoivu = radioGroup.getCheckedRadioButtonId();
                String id = edtID.getText().toString();
                String ten = edtTen.getText().toString();
                if(thoivu == R.id.radFull){
                    emp = new EmployeeFullTime();
                }else{
                    emp = new EmployeePartTime();
                }
                emp.setId(id);
                emp.setTen(ten);
                list.add(emp);
                adapter.notifyDataSetChanged();
            }
        });
    }

    public void AnhXa(){
        btnDangNhap = findViewById(R.id.btnDangNhap);
        edtID = findViewById(R.id.edtID);
        edtTen = findViewById(R.id.edtTen);

        lv = findViewById(R.id.listView);
        radioGroup = findViewById(R.id.radioGroup);
        radFull = findViewById(R.id.radFull);
        radPart = findViewById(R.id.radPart);
    }
}

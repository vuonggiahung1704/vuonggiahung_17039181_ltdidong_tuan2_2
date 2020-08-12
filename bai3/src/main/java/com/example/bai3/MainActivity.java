package com.example.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText edtTaiKhoan;
    Button btnDangNhap;
    TextView textViewKQ;
    ListView lv;
    List<String> list;
    ArrayAdapter adapter;

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
                String ten = edtTaiKhoan.getText().toString();
                list.add(ten);
                adapter.notifyDataSetChanged();
                lv.setBackgroundColor(Color.GRAY);
            }
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "position: " + i +" " + "ten: " + list.get(i);
                try{
                    for (int ctr=0;ctr<= list.size() ;ctr++){
                        if(i==ctr){
                            lv.getChildAt(ctr).setBackgroundColor(Color.CYAN);
                        }else{
                            lv.getChildAt(ctr).setBackgroundColor(Color.GRAY);
                        }
                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                textViewKQ.setText(msg);
            }
        });
    }

    public void AnhXa(){
        edtTaiKhoan = findViewById(R.id.edtTaiKhoan);
        btnDangNhap = findViewById(R.id.btnDangNhap);
        lv = findViewById(R.id.listView);
        textViewKQ = findViewById(R.id.textViewKQ);
    }
}

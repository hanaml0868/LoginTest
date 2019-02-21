package sdu.cs.amornthep.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    //Explicit
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //ผูกตัวแปร Java กับ xnl
        TextView nameTextView = findViewById(R.id.tvNaneLogin);

        //รับค่าตัวแปร name จาก intent
        getNameString = getIntent().getStringExtra("Name");
        nameTextView.setText("Welcome "+ getNameString+ " เข้าสู่ระบบ");
    }//end onCreate
}//end class

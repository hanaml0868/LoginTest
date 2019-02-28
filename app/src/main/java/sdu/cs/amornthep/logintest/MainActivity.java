package sdu.cs.amornthep.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Explicit
    String nameString,userString,passString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปรบน java กับ xml
        final EditText nameEditText = findViewById(R.id.edtName);
        final EditText usernameEditText = findViewById(R.id.edtUsername);
        final EditText passnameEditText = findViewById(R.id.edtPassword);
        Button loginButton = findViewById(R.id.btnLogin);

        //onClick Login Button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nameString = nameEditText.getText().toString().trim();
                userString = usernameEditText.getText().toString().trim();
                passString = passnameEditText.getText().toString().trim();

                //Check ค่าว่าง
                if ((nameString.length()==0)|| (userString.length()==0)||(passString.length()==0)) {
                    Toast.makeText(getApplicationContext(),"กรุณากรอกข้อมูลให้ครบทุกช่อง",Toast.LENGTH_SHORT).show();
                }

                //Check username and password

                else if ((userString.equals("admin")) && (passString.equals("1234"))) {
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();

                    //ส่งข้อมูลไปหน้าเมนู
                    Intent menuIntent = new Intent(MainActivity.this,MenuActivity.class);
                    menuIntent.putExtra("Name",nameString);
                    startActivity(menuIntent);
                } else {Toast.makeText(getApplicationContext(),"Login Fail",Toast.LENGTH_SHORT).show();
                }
                }

        }

        );//end setOnClickListener

    }//end onCreate
}// end class
 // Toast ข้อความที่แสดงออกมาครู่หนึ่งแล้วหานไปเอง

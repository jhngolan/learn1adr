package id.web.devgolan.pert1;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.security.KeyStore;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tv;
    EditText et;
    RadioButton rb1,rb2;

    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.cbutton); //button aksi

        tv=(TextView)findViewById(R.id.tvshow); //textview show

        et=(EditText)findViewById(R.id.etInput);

        rg=(RadioGroup)findViewById(R.id.rgid);

        rb1=(RadioButton)findViewById(R.id.radioButton);

        rb2=(RadioButton)findViewById(R.id.radioButton2);


        //Below is how you to set your word change by button

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Change Success", Toast.LENGTH_LONG).show();
                // tv.setText("PERTEMUAN 1");

                getData(et.getText().toString());

            }
        });






    }


    public String getData(String a){

            tv.setText(a);

        return a ;

        /*
           KOnsep parameter Java
        */

    }

}

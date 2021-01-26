package com.example.medhelp.ui.more;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medhelp.R;

import org.w3c.dom.Text;

import javax.annotation.Nullable;

public class Help extends AppCompatActivity {
    private EditText search;
    private Button b1;
    private TextView t1;
    private TextView t2;
    private TextView t3;

    protected void onCreate (@Nullable Bundle savedInstanceState ){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_layout);
        search=findViewById(R.id.editText);
        b1=(Button)findViewById(R.id.button);
        t1= (TextView)findViewById(R.id.textView);
        t2= (TextView)findViewById(R.id.textView1);
        t3= (TextView)findViewById(R.id.textView2);

    }
}

package com.example.sayla.report_card;

import android.content.Intent;
import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageButton floatButton;


    ArrayList<String> arrayList = new ArrayList<String>();

    ArrayAdapter<String> arrayAdapter;

    int clickcounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(arrayAdapter);

        floatButton = (ImageButton) findViewById(R.id.imageButton);
        floatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItems(v);
                Toast.makeText(getApplicationContext(),
                        "Button is clicked", Toast.LENGTH_LONG).show();
            }
        });
   /*     Button button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitebutton();

            }
        });*/
    }

    public void addItems(View v) {
        arrayList.add("Clicked : " + clickcounter++);
        arrayAdapter.notifyDataSetChanged();
    }
   /*
    private void submitebutton(){
        EditText Schoolname = (EditText) findViewById(R.id.schoolnameeditview);
        EditText studentname = (EditText) findViewById(R.id.studentnameeditview);
        EditText cource1 = (EditText) findViewById(R.id.course1editview);
        int courcemark1 = Integer.valueOf(String.valueOf(cource1.getText()));
        EditText cource2 = (EditText) findViewById(R.id.course2editview);
        int courcemark2 = Integer.valueOf(String.valueOf(cource2.getText().toString()));
        EditText cource3 = (EditText) findViewById(R.id.course3editview);
        int courcemark3 = Integer.valueOf(String.valueOf(cource3.getText().toString()));
        EditText cource4 = (EditText) findViewById(R.id.course4editview);
        int courcemark4 = Integer.valueOf(String.valueOf(cource4.getText().toString()));
        EditText cource5 = (EditText) findViewById(R.id.course5editview);
        int courcemark5 = Integer.valueOf(String.valueOf(cource5.getText().toString()));

        coursedetail coursedetail = new coursedetail(courcemark1,courcemark2,courcemark3,courcemark4,courcemark5);
        double percentage = markscalculation(coursedetail);
        String detail = "School name "+Schoolname.getText();
        detail += "\nStudent Name "+studentname.getText();
        detail += "\nPercentage "+ percentage;

        Toast.makeText(this,detail,Toast.LENGTH_LONG).show();

    }
    private double markscalculation(coursedetail coursedetails){

        double totalgetmarks = coursedetails.getIslamiat();
        totalgetmarks += coursedetails.getEnglish();
        totalgetmarks += coursedetails.getMath();
        totalgetmarks += coursedetails.getScience();
        totalgetmarks += coursedetails.getUrdu();

        double percentag = (totalgetmarks/500)*100;
        Log.d("percentage",totalgetmarks+"");
        return percentag;

    }
}*/
}

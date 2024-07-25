package com.example.scratchapplication;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView dataRV, horizDataRV;
    AppCompatButton addDBButton;
//       String[] data = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grapes", "Honeydew", "Kiwi", "Lemon"};


//    String[] dataArray = {"Data1", "Data2", "Data3", "Data4", "Data5", "Data6", "Data7", "Data8", "Data9", "Data10"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataRV = findViewById(R.id.dataRV);
        addDBButton = findViewById(R.id.addDBButton);
        // Create a list of students
        List<Student> studentList = createStudentList();

        //Create a list of students for horizontal recycler view
        List<Student> horizStudentList = createHorizStudentList();
        dataRV.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(studentList);

        dataRV.setAdapter(adapter);


        horizDataRV = findViewById(R.id.horizontalRV);
        horizDataRV.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        HorzAdapter horzAdapter = new HorzAdapter(horizStudentList);
        horizDataRV.setAdapter(horzAdapter);

        addDBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddActivtity.class));
                Toast.makeText(MainActivity.this, "Add activity clicked ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<Student> createHorizStudentList() {
//    List<Student> studentList=new ArrayList<>();
//    studentList.add(new Student("Abhi","abhi@dubakmail.com","AIT"))

        List<Student> studentList = new ArrayList<>();

        // Add 20 different students to the list
        for (int i = 1; i <= 20; i++) {
            String name = "Student " + i;
            String email = "student" + i + "@example.com";
            String college = "College " + i;

            studentList.add(new Student(name, email, college));

        }

        return studentList;

    }

    private List<Student> createStudentList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John Doe", "john.doe@email.com", "XYZ College"));
        studentList.add(new Student("Jane Smith", "jane.smith@email.com", "ABC University"));
        studentList.add(new Student("Daz Smith", "daz.smith@email.com", "RTU University"));
        studentList.add(new Student("Kin Jon", "kin.jon@email.com", "VTU University"));
        studentList.add(new Student("Tom  ", "tom.ski@email.com", "KVU University"));
        // Add more students as needed
        return studentList;

    }
}
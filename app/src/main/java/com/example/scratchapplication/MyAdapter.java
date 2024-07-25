package com.example.scratchapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.holder> {
    List<Student> studentList;

    public MyAdapter(List<Student> data) {
        this.studentList = data;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_data_row, parent, false); //it creates a view for singledata row
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        Student student = studentList.get(position);
        holder.nameTV.setText(student.getName());
        holder.collegeTV.setText(student.getCollege());
        holder.emailTV.setText(student.getEmail());
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    /*
        The ViewHolder: The ViewHolder is a java class that stores the reference to
        the card layout views that have to be dynamically modified during the execution
         of the program by a list of data obtained either by online databases or added
          in some other way.
         */
    class holder extends RecyclerView.ViewHolder {
        TextView nameTV, emailTV, collegeTV;

        public holder(@NonNull View itemView) {
            super(itemView);
            nameTV = itemView.findViewById(R.id.nameTV);
            emailTV = itemView.findViewById(R.id.emailTV);
            collegeTV = itemView.findViewById(R.id.collegeTV);
        }
    }
}

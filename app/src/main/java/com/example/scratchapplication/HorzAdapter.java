package com.example.scratchapplication;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorzAdapter extends RecyclerView.Adapter<HorzAdapter.horizonHolder> {
    List<Student> studentList;

    public HorzAdapter(List<Student> horzData) {
        this.studentList = horzData;
    }

    @NonNull
    @Override
    public horizonHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View viewH = inflater.inflate(R.layout.horiz_single_data_row, parent, false);
        return new horizonHolder(viewH);
    }

    @Override
    public void onBindViewHolder(@NonNull horizonHolder holder, int position) {
        Student student = studentList.get(position);
        holder.nameHTV.setText(student.getName());
        holder.collegeHTV.setText(student.getCollege());
        holder.emailHTV.setText(student.getEmail());
        final String TAG = "MainActivity";
        Log.d(TAG, "This is a LOG Button is clicked");
    }

    @Override
    public int getItemCount() {
        return studentList.size();
    } // very important ,if not given app crashes

    static class horizonHolder extends RecyclerView.ViewHolder {
        TextView nameHTV, emailHTV, collegeHTV;

        public horizonHolder(@NonNull View itemView) {
            super(itemView);
            nameHTV = itemView.findViewById(R.id.nameHTV);
            emailHTV = itemView.findViewById(R.id.emailHTV);
            collegeHTV = itemView.findViewById(R.id.collegeHTV);
        }
    }
}


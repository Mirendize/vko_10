package com.random.testi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<User> students = new ArrayList<>();

    public UserListAdapter(Context context, ArrayList<User> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.textName.setText(students.get(position).getFirstName() + " " + students.get(position).getLastName());
        holder.textDegree.setText(students.get(position).getDegreeProgram());
        holder.textEmail.setText(students.get(position).getEmail());
        holder.textDiploma.setText(students.get(position).getDiploma());

    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}


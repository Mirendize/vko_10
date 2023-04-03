package com.random.testi;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView textName, textEmail, textDegree, textDiploma;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        textName = itemView.findViewById(R.id.txtName);
        textDegree = itemView.findViewById(R.id.txtDegree);
        textEmail = itemView.findViewById(R.id.txtEmail);
        textDiploma = itemView.findViewById(R.id.txtDiploma);
    }
}
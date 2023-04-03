package com.random.testi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class UserListActivity extends AppCompatActivity {

    private UserStorage storage;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        storage = UserStorage.getInstance();
        ArrayList<User> sortedStudents = storage.getUsers();
        Collections.sort(sortedStudents, new Comparator<User>() {
            @Override
            public int compare(User t1, User t2) {
                return t1.firstName.compareToIgnoreCase(t2.firstName);
            }
        });

        recyclerView = findViewById(R.id.rvUserList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new UserListAdapter(getApplicationContext(), sortedStudents));

    }
}
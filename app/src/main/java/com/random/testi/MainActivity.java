package com.random.testi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //pääohjelma
        context = MainActivity.this;
        UserStorage.getInstance().loadUsers(this);

        Button btnSwitchToAdd = findViewById(R.id.btnGoToAdd);
        Button btnSwitchToShow = findViewById(R.id.btnShowUsers);
    }

    public void switchToAddUser (View view) {
        Intent intent = new Intent(this, AddUserActivity.class);
        startActivity(intent);
    }

    public void switchToList (View view) {
        Intent intent = new Intent(this, UserListActivity.class);
        startActivity(intent);
    }
}
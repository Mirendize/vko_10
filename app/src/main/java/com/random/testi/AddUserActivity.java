package com.random.testi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
    }

    public void addUser (View view) {

        Button btnTite = findViewById(R.id.btnTite);
        Button btnTuta = findViewById(R.id.btnTuta);
        Button btnLate = findViewById(R.id.btnLate);
        Button btnSate = findViewById(R.id.btnSate);
        Button btnAddUser = findViewById(R.id.btnAddUser);

        CheckBox checkKandi = findViewById(R.id.chkKandi);
        CheckBox checkDippa = findViewById(R.id.chkDippa);
        CheckBox checkTohtori = findViewById(R.id.chkTohtori);
        CheckBox checkUimamaisteri = findViewById(R.id.chkUimamaisteri);

        RadioGroup rgDegreeProgram = findViewById(R.id.radioGroupDegree);
        RadioGroup rgDiploma = findViewById(R.id.radioGroupDiploma);

        EditText firstNameEditText = (EditText) findViewById(R.id.textFirstName);
        EditText lastNameEditText = findViewById(R.id.textLastName);
        EditText emailEditText = findViewById(R.id.textEmail);

        String userDiplomas = null;

        if (checkKandi.isChecked()) {
            if (userDiplomas == null) {
                userDiplomas = ("Suoritetut tutkinnot: \n" + checkKandi.getText().toString());
            }
            else {
                userDiplomas = (userDiplomas + "\n" + checkKandi.getText().toString());
            }
        }
        if (checkDippa.isChecked()) {
            userDiplomas = (userDiplomas + "\n" + checkDippa.getText().toString());
        }
        if (checkTohtori.isChecked()) {
            userDiplomas = (userDiplomas + "\n" + checkTohtori.getText().toString());
        }
        if (checkUimamaisteri.isChecked()) {
            if (userDiplomas == null) {
                userDiplomas = ("Suoritetut tutkinnot: \n" + checkUimamaisteri.getText().toString());
            }
            else {
                userDiplomas = (userDiplomas + "\n" + checkUimamaisteri.getText().toString());
            }
        }


        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.btnTite:
                UserStorage.getInstance().addUser(new User(firstNameEditText.getText().toString(), lastNameEditText.getText().toString(), emailEditText.getText().toString(), "Tietotekniikka", userDiplomas));
                UserStorage.getInstance().saveUsers(this);
                break;
            case R.id.btnTuta:
                UserStorage.getInstance().addUser(new User(firstNameEditText.getText().toString(), lastNameEditText.getText().toString(), emailEditText.getText().toString(), "Tuotantotalous", userDiplomas));
                UserStorage.getInstance().saveUsers(this);
                break;
            case R.id.btnLate:
                UserStorage.getInstance().addUser(new User(firstNameEditText.getText().toString(), lastNameEditText.getText().toString(), emailEditText.getText().toString(), "Laskennallinen tekniikka", userDiplomas));
                UserStorage.getInstance().saveUsers(this);
                break;
            case R.id.btnSate:
                UserStorage.getInstance().addUser(new User(firstNameEditText.getText().toString(), lastNameEditText.getText().toString(), emailEditText.getText().toString(), "Sähkötekniikka", userDiplomas));
                UserStorage.getInstance().saveUsers(this);
                break;
            //UserStorage.getInstance().saveUsers(this);

        }
    }
}
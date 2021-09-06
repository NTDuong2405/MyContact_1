package com.example.mylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listviewContact;
    private List<ContactModel> listContacts = new ArrayList<ContactModel>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        listviewContact = findViewById(R.id.listviewContact);
        ContactAdapter contactAdapter = new ContactAdapter(listContacts, this);
        listviewContact.setAdapter(contactAdapter);
    }

    private void initData() {
        listContacts.add(new ContactModel("Huy 2", "03333237860", R.drawable.ic_avatar1));
        listContacts.add(new ContactModel("Huy 1", "03333237860", R.drawable.ic_avatar2));
        listContacts.add(new ContactModel("Huy 3", "03333237860", R.drawable.ic_avatar3));
        listContacts.add(new ContactModel("Huy 4", "03333237860", R.drawable.ic_avatar4));
        listContacts.add(new ContactModel("Huy 5", "03333237860", R.drawable.ic_avatar2));
        listContacts.add(new ContactModel("Huy 6", "03333237860", R.drawable.ic_avatar1));
    }
}
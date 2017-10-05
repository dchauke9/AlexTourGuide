package com.example.ekasilabalexcdtb.alextourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class PublicActivity extends AppCompatActivity {
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public);

        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        List<Contact> contactList = new ArrayList<>();

        Contact contact1 = new Contact();
        contact1.setTitle("Mr.");
        contact1.setName("Difference");
        contact1.setSurname("Chauke");
        contact1.setEmail("dchauke9@gmail.com");
        //Contact 2

        Contact contact2 = new Contact();
        contact2.setTitle("Mr.");
        contact2.setName("Difference");
        contact2.setSurname("Chauke");
        contact2.setEmail("dchauke9@gmail.com");

        //contact list

        contactList.add(contact1);
        contactList.add(contact2);

        adapter = new MyAdapter(this, contactList);
        recList.setAdapter(adapter);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.nav_camera) {
            // Handle the camera action
            Intent intent = new Intent(PublicActivity.this, PublicActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(PublicActivity.this, ShopActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_slideshow) {
            Intent intent = new Intent(PublicActivity.this, CorporateFirmActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_manage) {
            Intent intent = new Intent(PublicActivity.this, EntertainmentActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_share){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Try our new Alexandra Gomora Tour Guide app on you phone");
            intent.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=com.example.ekasilabalexcdtb.alextourguide");
            Intent mailer = Intent.createChooser(intent, null);
            startActivity(mailer);
        } else if (id == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return true;
    }
}

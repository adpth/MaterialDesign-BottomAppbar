package com.ath.bottomabbbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView= findViewById(R.id.detail_image);
        int img = getIntent().getExtras().getInt("image");
        imageView.setImageResource(img);

        TextView textView1 = findViewById(R.id.detail_name);
        String line1 = getIntent().getStringExtra("name");
        textView1.setText(line1);

        TextView textView2 = findViewById(R.id.detail_info);
        String line2 = getIntent().getStringExtra("info");
        textView2.setText(line2);

        BottomAppBar bar = (BottomAppBar) findViewById(R.id.detail_bar);
        setSupportActionBar(bar);

        FloatingActionButton fab = findViewById(R.id.detail_fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        bar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.archive:
                        Toast.makeText(getApplicationContext(),"Archive is clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.email:
                        Toast.makeText(getApplicationContext(),"email is clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.label:
                        Toast.makeText(getApplicationContext(),"label is clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.trash:
                        Toast.makeText(getApplicationContext(),"delete is clicked",Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}

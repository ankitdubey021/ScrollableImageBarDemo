package org.ankit.scrollableimagebardemo;

import android.os.Build;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    Toolbar bar;
    AppBarLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar=(Toolbar)findViewById(R.id.myToolbar);
        bar.setTitle("Lucifer");



        setSupportActionBar(bar);

    }
}

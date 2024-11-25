package com.example.recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecycleDescriptionActivity extends AppCompatActivity {

    TextView title, subtitle;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_description);

        title = findViewById(R.id.title);
        subtitle = findViewById(R.id.subtitle);
        imageView = findViewById(R.id.imageView);

        String titleText = getIntent().getStringExtra("title");
        String subtitleText = getIntent().getStringExtra("subtitle");
        int imageId = getIntent().getIntExtra("image", -1);

        title.setText(titleText);
        subtitle.setText(subtitleText);
        imageView.setImageResource(imageId);
    }
}


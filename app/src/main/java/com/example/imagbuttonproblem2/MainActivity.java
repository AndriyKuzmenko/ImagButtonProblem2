package com.example.imagbuttonproblem2;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView myImageView;
    Random myRandom;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageView=(ImageView)findViewById(R.id.imageView);
        myRandom=new Random();
    }

    public void buttonPressed(View view)
    {
        x=myRandom.nextInt(3)+1;

        switch(x)
        {
            case 1:
                myImageView.setImageResource(R.drawable.londoneye);
                break;
            case 2:
                myImageView.setImageResource(R.drawable.wullie);
                break;
            case 3:
                myImageView.setImageResource(R.drawable.niagara);
                break;
        }
    }
}

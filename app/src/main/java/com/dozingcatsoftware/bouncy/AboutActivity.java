package com.dozingcatsoftware.bouncy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutActivity extends Activity {
    /** Called when the activity is first created. */
    ImageView annaunivlogo; TextView t1,t2,t3,t4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

   // annaunivlogo=(ImageView)findViewById(R.id.imageView);
     //   annaunivlogo.setImageResource(R.drawable.annaunivlogo);
       // t1=(TextView)findViewById((R.id.Karthikname));
        //t2=(TextView)findViewById(R.id.krnum);
        //t3=(TextView)findViewById((R.id.harishname));
        //t4=(TextView)findViewById(R.id.hrnum);

        //t1.setText("Karthick Ramjee");
        //t2.setText("2013103507");
        //t3.setText("Harish M");
        //t4.setText("2013103011");
    }

    public static Intent startForLevel(Context context, int level) {
        Intent aboutIntent = new Intent(context, AboutActivity.class);
        aboutIntent.putExtra("level", level);
        context.startActivity(aboutIntent);
        return aboutIntent;
    }

}

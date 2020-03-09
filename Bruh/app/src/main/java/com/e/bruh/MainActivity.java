package com.e.bruh;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int bruh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button Bruh = (Button) findViewById(R.id.button);
        final TextView Count = (TextView) findViewById(R.id.textView);
        bruh = 0;
        Count.setText("" + bruh);

        Bruh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bruh++;
                Count.setText("" + bruh);
            }
        });
    }
}

package ty.corp.ord.ordunitmix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ty.corp.ord.ordunitmix.mix.Mix;
import ty.corp.ord.ordunitmix.magic.Magic;
import ty.corp.ord.ordunitmix.natural.Natural;
import ty.corp.ord.ordunitmix.stsl.St_Sl;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, SplashActivity.class));

        Button mix_bt = (Button) findViewById(R.id.mix_bt);
        mix_bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Mix.class);
                startActivity(intent);
            }
        });

        Button natural_clear = (Button) findViewById(R.id.natural_clear);
        natural_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Natural.class);
                startActivity(intent);
            }
        });

        Button magic_clear = (Button) findViewById(R.id.magic_clear);
        magic_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Magic.class);
                startActivity(intent);
            }
        });

        Button standsl = (Button) findViewById(R.id.standsl);
        standsl.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, St_Sl.class);
                startActivity(intent);
            }
        });

        Button cam = (Button) findViewById(R.id.cam);
        cam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Ord_Cam.class);
                startActivity(intent);
            }
        });
    }
}

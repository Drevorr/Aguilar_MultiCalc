package mcm.edu.ph.aguiilar_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button Geometry, Physics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Geometry=findViewById(R.id.button);
        Physics=findViewById(R.id.button2);

        Geometry.setOnClickListener(this);
        Physics.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                Intent intent=new Intent(MainActivity.this,MenuGeometry.class);
                startActivity(intent);
                break;

            case R.id.button2:
                Intent intent2=new Intent(MainActivity.this,MenuPhysics.class);
                startActivity(intent2);
                break;
        }
    }
}
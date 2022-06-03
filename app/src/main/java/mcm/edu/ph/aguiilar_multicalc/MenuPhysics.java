package mcm.edu.ph.aguiilar_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPhysics extends AppCompatActivity implements View.OnClickListener{
    Button Weight, Density, Velocity, Force, Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_physics);
        Weight=findViewById(R.id.btnWeight);
        Density=findViewById(R.id.btnDensity);
        Velocity=findViewById(R.id.btnVelocity);
        Force=findViewById(R.id.btnForce);
        Back=findViewById(R.id.btnBackPhys);

        Weight.setOnClickListener(this);
        Density.setOnClickListener(this);
        Velocity.setOnClickListener(this);
        Force.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnWeight:
                Intent intent=new Intent(MenuPhysics.this,Weight.class);
                startActivity(intent);
                break;

            case R.id.btnDensity:
                Intent intent2=new Intent(MenuPhysics.this,Density.class);
                startActivity(intent2);
                break;

            case R.id.btnVelocity:
                Intent intent3=new Intent(MenuPhysics.this,Velocity.class);
                startActivity(intent3);
                break;

            case R.id.btnForce:
                Intent intent4=new Intent(MenuPhysics.this,Force.class);
                startActivity(intent4);
                break;

            case R.id.btnBackPhys:
                Intent intent5=new Intent(MenuPhysics.this,MainActivity.class);
                startActivity(intent5);
                break;
        }
    }
}
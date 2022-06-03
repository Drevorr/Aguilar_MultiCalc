package mcm.edu.ph.aguiilar_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuGeometry extends AppCompatActivity implements View.OnClickListener{
    Button Cone, Capsule, Sphere, Cylinder, Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_geometry);
        Cone=findViewById(R.id.btnCone);
        Capsule=findViewById(R.id.btnCapsule);
        Sphere=findViewById(R.id.btnSphere);
        Cylinder=findViewById(R.id.btnCylinder);
        Back=findViewById(R.id.btnBackGeo);

        Cone.setOnClickListener(this);
        Capsule.setOnClickListener(this);
        Sphere.setOnClickListener(this);
        Cylinder.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCone:
                Intent intent=new Intent(MenuGeometry.this,Cone.class);
                startActivity(intent);
                break;

            case R.id.btnCapsule:
                Intent intent2=new Intent(MenuGeometry.this,Capsule.class);
                startActivity(intent2);
                break;

            case R.id.btnSphere:
                Intent intent3=new Intent(MenuGeometry.this,Sphere.class);
                startActivity(intent3);
                break;

            case R.id.btnCylinder:
                Intent intent4=new Intent(MenuGeometry.this,Cylinder.class);
                startActivity(intent4);
                break;

            case R.id.btnBackGeo:
                Intent intent5=new Intent(MenuGeometry.this,MainActivity.class);
                startActivity(intent5);
                break;
        }
    }
}
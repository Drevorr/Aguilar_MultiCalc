package mcm.edu.ph.aguiilar_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity implements View.OnClickListener{
    EditText Radius, Height;
    Button Calculate, Back;
    TextView Volume, Area, Cylinder;
    double Solution;

    Controller Controller=new Controller();
    GetterSetter GetterSetter=new GetterSetter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        Radius=findViewById(R.id.inputRadiusCylinder);
        Height=findViewById(R.id.inputHeightCylinder);
        Calculate=findViewById(R.id.calcCylinder);
        Back=findViewById(R.id.backCylinder);
        Volume=findViewById(R.id.outputVolumeCylinder);
        Area=findViewById(R.id.outputAreaCylinder);
        Cylinder=findViewById(R.id.textView14);

        Calculate.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calcCylinder:
                GetterSetter.setRadius(Double.parseDouble(Radius.getText().toString()));
                GetterSetter.setHeight(Double.parseDouble(Height.getText().toString()));
                GetterSetter.setCylinder(Double.parseDouble(Cylinder.getText().toString()));
                Solution = Controller.cylinderVolume(GetterSetter.getRadius(), GetterSetter.getHeight(), GetterSetter.getCylinder());
                Volume.setText("" + Solution);
                Area.setText("" + Solution);

                break;

        }

    }
}
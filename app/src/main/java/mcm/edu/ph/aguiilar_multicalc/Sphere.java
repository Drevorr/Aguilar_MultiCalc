package mcm.edu.ph.aguiilar_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity implements View.OnClickListener{
    EditText Radius;
    Button Calculate, Back;
    TextView Volume, Area, Sphere;
    double Solution;

    Controller Controller=new Controller();
    GetterSetter GetterSetter=new GetterSetter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        Radius=findViewById(R.id.inputRadiusSphere);
        Calculate=findViewById(R.id.calcSphere);
        Back=findViewById(R.id.backSphere);
        Volume=findViewById(R.id.outputVolumeSphere);
        Area=findViewById(R.id.outputAreaSphere);
        Sphere=findViewById(R.id.textView49);

        Calculate.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calcSphere:
                GetterSetter.setRadius(Double.parseDouble(Radius.getText().toString()));
                GetterSetter.setSphere(Double.parseDouble(Sphere.getText().toString()));
                Solution = Controller.sphereSA(GetterSetter.getRadius(), GetterSetter.getSphere());
                Volume.setText("" + Solution);
                Area.setText("" + Solution);

                break;

        }
    }
}
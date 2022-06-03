package mcm.edu.ph.aguiilar_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Force extends AppCompatActivity implements View.OnClickListener{
    EditText Mass, Acceleration;
    Button Calculate, Back;
    TextView Force;
    double Solution;

    Controller Controller=new Controller();
    GetterSetter GetterSetter=new GetterSetter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_force);
        Mass=findViewById(R.id.inputMassForce);
        Acceleration=findViewById(R.id.inputAccelerationForce);
        Calculate=findViewById(R.id.calcForce);
        Back=findViewById(R.id.backForce);
        Force=findViewById(R.id.outputForce);
        Force=findViewById(R.id.textView19);

        Calculate.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calcForce:
                GetterSetter.setMass(Double.parseDouble(Mass.getText().toString()));
                GetterSetter.setAcceleration(Double.parseDouble(Acceleration.getText().toString()));
                GetterSetter.setForce(Double.parseDouble(Force.getText().toString()));
                Solution = Controller.force(GetterSetter.getMass(), GetterSetter.getAcceleration(), GetterSetter.getForce());
                Force.setText("" + Solution);

                break;

        }

    }
}
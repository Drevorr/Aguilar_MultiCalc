package mcm.edu.ph.aguiilar_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Density extends AppCompatActivity implements View.OnClickListener{
    EditText Mass, Volume;
    Button Calculate, Back;
    TextView Density;
    double Solution;

    Controller Controller=new Controller();
    GetterSetter GetterSetter=new GetterSetter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_density);
        Mass=findViewById(R.id.inputMassDensity);
        Volume=findViewById(R.id.inputVolumeDensity);
        Calculate=findViewById(R.id.calcDensity);
        Back=findViewById(R.id.backDensity);
        Density=findViewById(R.id.outputDensity);
        Density=findViewById(R.id.textView34);

        Calculate.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calcDensity:
                GetterSetter.setMass(Double.parseDouble(Mass.getText().toString()));
                GetterSetter.setVolume(Double.parseDouble(Volume.getText().toString()));
                GetterSetter.setDensity(Double.parseDouble(Density.getText().toString()));
                Solution = Controller.density(GetterSetter.getMass(), GetterSetter.getVolume(), GetterSetter.getDensity());
                Density.setText("" + Solution);

                break;

        }

    }
}
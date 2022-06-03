package mcm.edu.ph.aguiilar_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Weight extends AppCompatActivity implements View.OnClickListener {
    EditText Mass, Gravity;
    Button Calculate, Back;
    TextView Weight;
    double Solution;

    Controller Controller=new Controller();
    GetterSetter GetterSetter=new GetterSetter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        Mass=findViewById(R.id.inputMassWeight);
        Gravity=findViewById(R.id.inputGravityWeight);
        Calculate=findViewById(R.id.calcWeight);
        Back=findViewById(R.id.backWeight);
        Weight=findViewById(R.id.outputWeight);
        Weight=findViewById(R.id.textView35);

        Calculate.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calcWeight:
                GetterSetter.setMass(Double.parseDouble(Mass.getText().toString()));
                GetterSetter.setGravity(Double.parseDouble(Gravity.getText().toString()));
                GetterSetter.setWeight(Double.parseDouble(Weight.getText().toString()));
                Solution = Controller.weight(GetterSetter.getMass(), GetterSetter.getGravity(), GetterSetter.getWeight());
                Weight.setText("" + Solution);

                break;

        }

    }
}
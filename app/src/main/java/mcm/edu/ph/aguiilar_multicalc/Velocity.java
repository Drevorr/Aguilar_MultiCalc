package mcm.edu.ph.aguiilar_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Velocity extends AppCompatActivity implements View.OnClickListener{
    EditText Distance, Time;
    Button Calculate, Back;
    TextView Velocity;
    double Solution;

    Controller Controller=new Controller();
    GetterSetter GetterSetter=new GetterSetter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_velocity);
        Distance=findViewById(R.id.inputDistanceVelocity);
        Time=findViewById(R.id.inputTimeVelocity);
        Calculate=findViewById(R.id.calcVelocity);
        Back=findViewById(R.id.backVelocity);
        Velocity=findViewById(R.id.outputVelocity);
        Velocity=findViewById(R.id.textView42);

        Calculate.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calcVelocity:
                GetterSetter.setDistance(Double.parseDouble(Distance.getText().toString()));
                GetterSetter.setTime(Double.parseDouble(Time.getText().toString()));
                GetterSetter.setVelocity(Double.parseDouble(Velocity.getText().toString()));
                Solution = Controller.velocity(GetterSetter.getDistance(), GetterSetter.getTime(), GetterSetter.getVelocity());
                Velocity.setText("" + Solution);

                break;

        }

    }
}
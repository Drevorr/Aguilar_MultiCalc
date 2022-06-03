package mcm.edu.ph.aguiilar_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Capsule extends AppCompatActivity implements View.OnClickListener{
    EditText BaseRadius, Height;
    Button Calculate, Back;
    TextView Volume, Area, Capsule;
    double Solution;

    Controller Controller=new Controller();
    GetterSetter GetterSetter=new GetterSetter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capsule);
        BaseRadius=findViewById(R.id.inputRadiusCapsule);
        Height=findViewById(R.id.inputHeightCapsule);
        Calculate=findViewById(R.id.calcCapsule);
        Back=findViewById(R.id.backCapsule);
        Volume=findViewById(R.id.outputVolumeCapsule);
        Area=findViewById(R.id.outputAreaCapsule);
        Capsule=findViewById(R.id.textView48);

        Calculate.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.calcCapsule:
                GetterSetter.setRadius(Double.parseDouble(BaseRadius.getText().toString()));
                GetterSetter.setHeight(Double.parseDouble(Height.getText().toString()));
                GetterSetter.setCapsule(Double.parseDouble(Capsule.getText().toString()));
                Solution = Controller.capsuleVolume(GetterSetter.getBaseRadius(), GetterSetter.getHeight(), GetterSetter.getCapsule());
                Volume.setText("" + Solution);
                Area.setText("" + Solution);

                break;

        }
    }
}
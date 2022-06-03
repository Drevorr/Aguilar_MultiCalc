package mcm.edu.ph.aguiilar_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cone extends AppCompatActivity implements View.OnClickListener{
    EditText Radius, Height;
    Button Calculate, Back;
    TextView Volume, Area, Cone;
    double Solution;

    Controller Controller=new Controller();
    GetterSetter GetterSetter=new GetterSetter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);
        Radius=findViewById(R.id.inputRadiusCone);
        Height=findViewById(R.id.inputHeightCone);
        Calculate=findViewById(R.id.calcCone);
        Back=findViewById(R.id.backCone);
        Volume=findViewById(R.id.outputVolumeCone);
        Area=findViewById(R.id.outputAreaCone);
        Cone=findViewById(R.id.textView2);

        Calculate.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.calcCone:
                GetterSetter.setRadius(Double.parseDouble(Radius.getText().toString()));
                GetterSetter.setHeight(Double.parseDouble(Height.getText().toString()));
                GetterSetter.setCone(Double.parseDouble(Cone.getText().toString()));
                Solution = Controller.coneVolume (GetterSetter.getRadius(), GetterSetter.getHeight(), GetterSetter.getCone());
                Volume.setText(""+Solution);
                Area.setText(""+Solution);

                break;
        }
    }
}
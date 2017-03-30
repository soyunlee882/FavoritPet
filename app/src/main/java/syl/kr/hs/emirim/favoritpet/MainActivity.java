package syl.kr.hs.emirim.favoritpet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox checkselect;
    RadioGroup rg;
    RadioButton radiocat1,radiocat2,radiocat3;
    Button butok;
    ImageView imgvPet;
    TextView textQuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkselect=(CheckBox)findViewById(R.id.check_select);
        textQuest = (TextView) findViewById(R.id.text_quest);
        rg=(RadioGroup) findViewById(R.id.rg);
        radiocat1=(RadioButton) findViewById(R.id.radio_cat1);
        radiocat2=(RadioButton) findViewById(R.id.radio_cat2);
        radiocat3=(RadioButton) findViewById(R.id.radio_cat3);
        butok=(Button)findViewById(R.id.but_ok);
        imgvPet=(ImageView)findViewById(R.id.imgv_pet);
        checkselect.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if(checkselect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butok.setVisibility(View.VISIBLE);
            imgvPet.setVisibility(View.VISIBLE);
        }
        else if(checkselect.isChecked()){
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butok.setVisibility(View.INVISIBLE);
            imgvPet.setVisibility(View.INVISIBLE);
        }
    }
}

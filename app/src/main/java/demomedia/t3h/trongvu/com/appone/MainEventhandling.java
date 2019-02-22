package demomedia.t3h.trongvu.com.appone;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;


public class MainEventhandling extends AppCompatActivity {
    private RadioGroup radioGroup;

    private  RadioButton radioButton;
    private TextView tv_color;
    private Button btn_red;
    private Button btn_blue;
    private Button btn_yellow;
    private Button btn_ramdom;
    private  int[] ramdomColor = {Color.RED,Color.BLACK,Color.BLUE,Color.GREEN,Color.MAGENTA};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventhandling);
        radioGroup = (RadioGroup) findViewById(R.id.rgcheck);
        tv_color = findViewById(R.id.tvcolor);
        btn_red = (Button) findViewById(R.id.btnred);
        btn_blue = ( Button) findViewById(R.id.btnblue);
        btn_yellow= (Button) findViewById(R.id.btnyellow);
        btn_ramdom = (Button) findViewById(R.id.btnramdom);
       // checkColer();
        checkRadioGroup();
        btn_red.setOnClickListener(new OnClickBtnRed());
        btn_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_color.setBackgroundColor(Color.BLUE);
            }
        });
        btn_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_color.setBackgroundColor(Color.YELLOW);
            }
        });
        btn_ramdom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(ramdomColor.length);
                tv_color.setBackgroundColor(ramdomColor[index]);

            }
        });


    }
    private void checkColer(){
        int idcheck = radioGroup.getCheckedRadioButtonId();
        switch (idcheck){
            case 0:
                tv_color.setBackgroundColor(Color.RED);
                break;
            case 1:
                tv_color.setBackgroundColor(Color.BLUE);
                break;
            case 2:
                tv_color.setBackgroundColor(Color.YELLOW);
                break;
        }
    }
    private void checkRadioGroup(){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                    radioButton =radioGroup.findViewById(checkedId);
                    int index = radioGroup.indexOfChild(radioButton);
                    switch (index){
                        case 0:
                            tv_color.setBackgroundColor(Color.RED);
                            break;
                        case 1:
                            tv_color.setBackgroundColor(Color.BLUE);
                            break;
                        case 2:
                            tv_color.setBackgroundColor(Color.YELLOW);
                            break;
                    }
            }
        });
    }
    private class OnClickBtnRed implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            tv_color.setBackgroundColor(Color.RED);
        }
    }


}

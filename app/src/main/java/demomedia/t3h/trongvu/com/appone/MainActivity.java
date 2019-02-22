package demomedia.t3h.trongvu.com.appone;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bt_one;
    private Button bt_two;
    private TextView tv_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_one = (Button) findViewById(R.id.btone);
        bt_two = (Button) findViewById(R.id.btwo);
        tv_name = (TextView) findViewById(R.id.tvnam);
        bt_one.setOnClickListener(new OnClick());
        bt_two.setOnClickListener(new OnClicktwo());

    }
    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            bt_one.setBackgroundColor(Color.BLUE);
            tv_name.setBackgroundColor(Color.RED);
            //tv_name.setText("âfa");
            Toast.makeText(MainActivity.this,"This Push",Toast.LENGTH_SHORT).show();
        }
    }
    private class OnClicktwo implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            bt_two.setBackgroundColor(Color.RED);
            tv_name.setBackgroundColor(Color.BLUE);
        }
    }
}

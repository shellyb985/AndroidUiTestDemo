package learning.spb.com.new_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.INVISIBLE;


public class AppSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_setting);


//        Button backButton = (Button)findViewById(R.id.back);
//        backButton.setVisibility(INVISIBLE);
    }

    public void onClickBack (View view) {

    }
}

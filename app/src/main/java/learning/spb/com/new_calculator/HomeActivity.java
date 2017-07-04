package learning.spb.com.new_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {


    String firstNumber;
    String symbol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        EditText editText = (EditText) findViewById(R.id.editText2);
        editText.setSelected(false);
        firstNumber = new String();
        symbol = new String();
    }

    public void onClickAdd (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);

        if (editText.getText().toString().length() > 0) {
            firstNumber = editText.getText().toString();
            symbol = "1";
            editText.setText("");
            updateTextView();
        }
        else if (firstNumber.length() > 0) {
            symbol = "1";
            editText.setText("");
            textView.setText("");
            updateTextView();
        }
        else {
            textView.setText("Please enter first number");
        }



    }
    public void onClickSub (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);

        if (editText.getText().toString().length() > 0) {
            firstNumber = editText.getText().toString();
            symbol = "2";
            editText.setText("");
            updateTextView();
        }
        else if (firstNumber.length() > 0) {
            symbol = "2";
            editText.setText("");
            textView.setText("");
            updateTextView();
        }
        else {
            textView.setText("Please enter first number");
        }

    }
    public void onClickMultiple (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);

        if (editText.getText().toString().length() > 0) {
            firstNumber = editText.getText().toString();
            symbol = "3";
            editText.setText("");
            updateTextView();
        }
        else if (firstNumber.length() > 0) {
            symbol = "3";
            editText.setText("");
            textView.setText("");
            updateTextView();
        }
        else {
            textView.setText("Please enter first number");
        }
    }
    public void onClickDivide (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);

        if (editText.getText().toString().length() > 0) {
            firstNumber = editText.getText().toString();
            symbol = "4";
            editText.setText("");
            updateTextView();
        }
        else if (firstNumber.length() > 0) {
            symbol = "4";
            editText.setText("");
            textView.setText("");
            updateTextView();
        }
        else {
            textView.setText("Please enter first number");
        }
    }


    public void updateTextView() {
        TextView textView = (TextView) findViewById(R.id.textView2);
        switch (Integer.parseInt(symbol)) {
            case 1 : {
                textView.setText(firstNumber.concat(" +"));
                break;
            }
            case 2 : {
                textView.setText(firstNumber.concat(" -"));
                break;
            }
            case 3 : {
                textView.setText(firstNumber.concat(" *"));
                break;
            }
            case 4 : {
                textView.setText(firstNumber.concat(" /"));
                break;
            }
            default: {

            }
        }
    }

    public void onClickClear (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);
        String strEditText = editText.getText().toString();


        editText.setText("");
        textView.setText("");
        firstNumber = "";
        symbol = "";
    }

    public void onClickEqual (View view) {
        if (firstNumber.length() > 0 && symbol.length() > 0) {
            EditText editText = (EditText) findViewById(R.id.editText2);
            TextView textView = (TextView) findViewById(R.id.textView2);
            String strEditText = editText.getText().toString();

            double result = 0.0;
            switch (Integer.parseInt(symbol)) {
                case 1 : {
                    result = Float.valueOf(firstNumber) + Float.valueOf(strEditText);
                    break;
                }
                case 2 : {
                    result = Float.valueOf(firstNumber) - Float.valueOf(strEditText);
                    break;
                }
                case 3 : {
                    result = Float.valueOf(firstNumber) * Float.valueOf(strEditText);
                    break;
                }
                case  4 : {
                    result = Float.valueOf(firstNumber) / Float.valueOf(strEditText);
                    break;
                }
                default: {

                    break;
                }
            }
            textView.setText(Double.toString(result));
            firstNumber = Double.toString(result);
            editText.setText("");

        }
        else {
            TextView textView = (TextView) findViewById(R.id.textView2);
            textView.setText("Please enter proper inputs");
        }


    }


    public void onClickOne (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);

        String strEditText = editText.getText().toString();
        editText.setText(strEditText.concat("1"));

    }
    public void onClickTwo (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);
        String strEditText = editText.getText().toString();
        editText.setText(strEditText.concat("2"));
    }
    public void onClickThree (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);
        String strEditText = editText.getText().toString();
        editText.setText(strEditText.concat("3"));
    }
    public void onClickFour (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);
        String strEditText = editText.getText().toString();
        editText.setText(strEditText.concat("4"));
    }
    public void onClickFive (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);
        String strEditText = editText.getText().toString();
        editText.setText(strEditText.concat("5"));
    }
    public void onClickSix (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);
        String strEditText = editText.getText().toString();
        editText.setText(strEditText.concat("6"));
    }
    public void onClickSeven (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);
        String strEditText = editText.getText().toString();
        editText.setText(strEditText.concat("7"));
    }
    public void onClickEight (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);
        String strEditText = editText.getText().toString();
        editText.setText(strEditText.concat("8"));
    }

    public void onClickNine (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);
        String strEditText = editText.getText().toString();
        editText.setText(strEditText.concat("9"));
    }
    public void onClickZero (View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        TextView textView = (TextView) findViewById(R.id.textView2);
        String strEditText = editText.getText().toString();
        editText.setText(strEditText.concat("0"));
    }

    public void onClickGoToSetting (View view) {
        Intent settingIntent = new Intent(this,AppSettingActivity.class);
        startActivity(settingIntent);
    }
}

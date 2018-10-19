package com.karynboyd.csc315finalpart2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double usExchange = 1.15d;
    double euroExchange = .87d;
    double result;

    double usInfo;
    double euroInfo;

    EditText usd;
    EditText euro;
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText usd = findViewById(R.id.usd);
        EditText euro = findViewById(R.id.euro);
        TextView info = findViewById(R.id.info);
    }

    public void convert(View view) {
        usInfo = Double.parseDouble(usd.getText().toString());
        euroInfo = Double.parseDouble(euro.getText().toString());

        usExchange = 1.15d;
        euroExchange = 0.87d;

        if(usInfo != 0 && euroInfo > 0 ) {
            result = usInfo * euroExchange;
        } else if (usInfo > 0 && euroInfo != 0) {
            result = usExchange * euroInfo;
        } else {
            info.setText("At least one field must not be empty.");
        }

        info.setText(""+result);
    }

    public void clear(View view) {
        euro.setText("");
        usd.setText("");
        info.setText("");
    }

    public boolean OnCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.about:
                startActivity(new Intent(this, AboutActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

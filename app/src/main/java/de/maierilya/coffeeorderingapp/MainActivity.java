package de.maierilya.coffeeorderingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView name, price;
    EditText etName, num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.tv_name);
        price = findViewById(R.id.tv_price);
        etName = findViewById(R.id.et_name);
        num = findViewById(R.id.et_num_cups);

        findViewById(R.id.btn_calculate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = getString(R.string.your_name) + " " + etName.getText().toString();
                name.setText(text);

                int t = Integer.parseInt(num.getText().toString()) * 2;
                text = getString(R.string.total_price) + " " + String.valueOf(t) + " $";
                price.setText(text);
            }
        });
    }

}

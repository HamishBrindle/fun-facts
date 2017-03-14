package com.brindle.funfactsactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FunFactsActivity extends AppCompatActivity {

    // Declare our view variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;
    private FactBook mFactBook = new FactBook();
    private ColorBook mColorBook = new ColorBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.activity_fun_facts);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update screen with dynamic fact
                mFactTextView.setText(mFactBook.getFact());
                int color = mColorBook.getColors();
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);

            }
        };
        mShowFactButton.setOnClickListener(listener);

        Toast.makeText(FunFactsActivity.this, "Yay! Activity created.", Toast.LENGTH_SHORT).show();

    }
}

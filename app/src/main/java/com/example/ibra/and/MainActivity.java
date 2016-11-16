package com.example.ibra.and;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mBtnSecond;

    // mListener da object mn OnClickListener 3l4an a7dd l action l y7sl lma ados 3la l btn 
    View.OnClickListener mListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Intent de 7aga b2dr aft7 beha layout tanya aw 7ta aft7 application tane zay youtube masln !
            Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(mIntent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // b3rf l btn bta3e l na mdelo id btn_second
        mBtnSecond = (Button) findViewById(R.id.btn_second);
        // hena b2olo lma ados 3la l btn nfz l mogod fe mListener
        mBtnSecond.setOnClickListener(mListener);
    }
}

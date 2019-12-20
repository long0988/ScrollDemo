package com.skyworth.scrolltext;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private Handler mHandler= new Handler();
   private RepeatScrollview scrollview;
   private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setSelected(true);
        scrollview= findViewById(R.id.scrollview);
        scrollview.setRepeatTieme(5);
        scrollview.setContextText("Hello World!dadfasdf" +
                "asdfsaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "asdfdadasfasdfsfsdfa" +
                "asdfffffffffffffffffffffffffff" +
                "asdffffffffffffffffffffffffff" +
                "asdfffffffffffffffffffffffff" +
                "asdffffffffffffffffffffffffffffffff" +
                "adfassssssssssssssssssssssssssss" +
                "asdfsaaaaaaaaaaaaaaa" +
                "asssssssssssssssssss" +
                "asssssssssssssss" +
                "assssssssssssssssssss" +
                "asssssssss" +
                "assssssssssssssssssss" +
                "asdfaaaaaaaaaaaaasdasdasdas" +
                "adsssssssssssdadsssssssss" +
                "asdddddddddddddddddddddddddddd" +
                "adssssssssssssssssssssss" +
                "adsssssssssssssssssssssssss" +
                "adsssssssssssssssssssssssssssssss" +
                "asdfaaaaaaaaaaaaaaa" +
                "adssssadsfffffffffffffffffffff" +
                "asdfffffffffffffffffff");
        scrollview.setFontSize(18);
        scrollview.setTextColor(R.color.colorAccent);
//        if(scrollview.getHeight()<scrollview.getMaxHeight()){
//            scrollview.startScroll();
//        }
    }
}

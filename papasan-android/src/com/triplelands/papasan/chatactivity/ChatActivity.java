package com.triplelands.papasan.chatactivity;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.widget.TextView;

public class ChatActivity extends RoboActivity {
//    @InjectView(R.layout.main) private LinearLayout mainLayout;
    @InjectView(R.id.txtHello) protected TextView txtHello;
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        txtHello.setText("Hello Text dari Jaka!");
    }
}
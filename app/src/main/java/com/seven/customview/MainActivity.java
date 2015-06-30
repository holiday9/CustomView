package com.seven.customview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.seven.customview.average_panel.AveragePanelActivity;


public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.average_panel) {
            entry(AveragePanelActivity.class);
        }
    }

    private void entry(Class<?> activityzz) {
        Intent intent = new Intent(this, activityzz);
        startActivity(intent);
    }
}

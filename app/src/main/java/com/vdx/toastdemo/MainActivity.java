package com.vdx.toastdemo;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.vdx.designertoast.DesignerToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DesignerToast.Success(MainActivity.this, "Success", "Hello this is demo success!", Gravity.CENTER, Toast.LENGTH_SHORT, DesignerToast.STYLE_DARK);
                DesignerToast.Error(MainActivity.this, "Error", "Hello this is demo error!", Gravity.CENTER, Toast.LENGTH_SHORT, DesignerToast.STYLE_DARK);
                DesignerToast.Warning(MainActivity.this, "Warning", "Hello this is demo warning!", Gravity.CENTER, Toast.LENGTH_SHORT, DesignerToast.STYLE_DARK);
                DesignerToast.Info(MainActivity.this, "Info", "Hello this is demo info!", Gravity.CENTER, Toast.LENGTH_SHORT, DesignerToast.STYLE_DARK);
            }
        });

// ALL FEATURES DEMO
/*
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            int c = 0;

            @Override
            public void run() {
                c = c + 1;
                switch (c) {
                    case 5:
                        DesignerToast.Custom(MainActivity.this, "Custom Toast", Gravity.CENTER, Toast.LENGTH_SHORT, R.drawable.my_custom_shape, 20, "#FFFFFF", R.drawable.ic_person, 200, 200);
                        break;
                    case 10:
                        DesignerToast.Success(MainActivity.this, "Success Toast", Gravity.CENTER, Toast.LENGTH_SHORT);
                        break;
                    case 15:
                        DesignerToast.Error(MainActivity.this, "Error Toast", Gravity.CENTER, Toast.LENGTH_SHORT);
                        break;
                    case 20:
                        DesignerToast.Warning(MainActivity.this, "Warning Toast", Gravity.CENTER, Toast.LENGTH_SHORT);
                        break;
                    case 25:
                        DesignerToast.Info(MainActivity.this, "Info Toast", Gravity.CENTER, Toast.LENGTH_SHORT);
                        break;
                    default:
                }
                handler.postDelayed(this, 1000);
            }
        }, 1000);
*/
    }
}

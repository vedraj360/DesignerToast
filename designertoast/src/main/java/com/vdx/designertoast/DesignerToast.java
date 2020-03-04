package com.vdx.designertoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class DesignerToast {

    public static void defaultToast(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(view);
    }
}

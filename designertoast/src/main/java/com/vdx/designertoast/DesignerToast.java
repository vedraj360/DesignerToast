package com.vdx.designertoast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

public class DesignerToast {

    public static void defaultToast(Context context, String message, int gravity, int duration) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
            LinearLayout background = layout.findViewById(R.id.toast_background_type);
            TextView toast_message = layout.findViewById(R.id.toast_message);
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            background.setBackground(context.getResources().getDrawable(R.drawable.default_background));
            toast_message.setText(message);
            toast_icon.setVisibility(View.GONE);
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "defaultToast: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT);
        }

    }

    public static void Success(Context context, String message, int gravity, int duration) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
            LinearLayout background = layout.findViewById(R.id.toast_background_type);
            TextView toast_message = layout.findViewById(R.id.toast_message);
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            background.setBackground(context.getResources().getDrawable(R.drawable.success_background));
            toast_message.setText(message);
            toast_icon.setBackground(context.getResources().getDrawable(R.drawable.ic_success));
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Success: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT);
        }

    }

    public static void Error(Context context, String message, int gravity, int duration) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
            LinearLayout background = layout.findViewById(R.id.toast_background_type);
            TextView toast_message = layout.findViewById(R.id.toast_message);
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            background.setBackground(context.getResources().getDrawable(R.drawable.error_background));
            toast_message.setText(message);
            toast_icon.setBackground(context.getResources().getDrawable(R.drawable.ic_error));
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Error: ", e);
        }
    }

    public static void Warning(Context context, String message, int gravity, int duration) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
            LinearLayout background = layout.findViewById(R.id.toast_background_type);
            TextView toast_message = layout.findViewById(R.id.toast_message);
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            background.setBackground(context.getResources().getDrawable(R.drawable.warning_background));
            toast_message.setText(message);
            toast_icon.setBackground(context.getResources().getDrawable(R.drawable.ic_warning));
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Warning: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT);


        }
    }

    public static void Info(Context context, String message, int gravity, int duration) {
        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
            LinearLayout background = layout.findViewById(R.id.toast_background_type);
            TextView toast_message = layout.findViewById(R.id.toast_message);
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            background.setBackground(context.getResources().getDrawable(R.drawable.info_background));
            toast_message.setText(message);
            toast_icon.setBackground(context.getResources().getDrawable(R.drawable.ic_info));
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Info: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT);
        }
    }

    public static void Custom(Context context, String message, int gravity, int duration, int background_drawable, int text_size, String text_color, int toast_image, int layout_height, int layout_width) {

        try {
            @SuppressLint("InflateParams") View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
            LinearLayout background = layout.findViewById(R.id.toast_background_type);
            TextView toast_message = layout.findViewById(R.id.toast_message);
            background.setBackground(context.getResources().getDrawable(background_drawable));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(layout_width, layout_height);
            layout.setLayoutParams(layoutParams);
            toast_message.setTextSize(text_size);
            toast_message.setTextColor(Color.parseColor(text_color));
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            toast_message.setText(message);
            toast_icon.setBackground(context.getResources().getDrawable(toast_image));
            toast_icon.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            Toast toast = new Toast(context);
            toast.setDuration(duration);
            toast.setGravity(gravity, 0, 20);
            toast.setView(layout);
            toast.show();
        } catch (Exception e) {
            Log.e(TAG, "Custom: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT);
        }

    }

}

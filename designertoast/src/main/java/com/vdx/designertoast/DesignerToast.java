package com.vdx.designertoast;

import static android.content.ContentValues.TAG;

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

public class DesignerToast {

    public static String STYLE_DARK = "STYLE_DARK";

    private static View layout;
    private static LinearLayout background;
    private static TextView toast_message, toast_description;
    private static ImageView toast_icon;

    //    Create layout once, no need to write again and again.
    private static void setUpLayout(Context context) {
        View layout = LayoutInflater.from(context).inflate(R.layout.designer_layout, null, false);
        findViews(layout);
    }

    //    Connect all component with layout
    private static void findViews(View layout) {
        background = layout.findViewById(R.id.toast_background_type);
        toast_message = layout.findViewById(R.id.toast_message);
        toast_icon = layout.findViewById(R.id.toast_icon);
        toast_description = layout.findViewById(R.id.dark_toast_description);
    }

    //    SetUp Background once, and use again and again.
    private static void setUpBackground(int drawable, Context context) {
        background.setBackground(context.getResources().getDrawable(drawable));
    }

    private static void setUpTv(String message) {
        toast_message.setText(message);
    }

    private static void setUpTv(String message, String description) {
        toast_message.setText(message);
        toast_description.setText(description);
    }

    // drawable for setBackground
    private static void setUpTv(String message, int drawable, Context context) {
        toast_message.setText(message);
        toast_icon.setBackground(context.getResources().getDrawable(drawable));
    }

    // drawable for setImageResource
    private static void setUpTv(String message, String description, int drawable, int color, Context context) {
        toast_message.setText(message);
        toast_description.setText(description);
        toast_icon.setImageResource(drawable);
        toast_message.setTextColor(context.getResources().getColor(color));
    }

    private static void toastCreation(Context context, int duration, int gravity) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        toast.setGravity(gravity, 0, 20);
        toast.setView(layout);
        toast.show();
    }

    public static void defaultToast(Context context, String message, int gravity, int duration) {
        try {
            setUpBackground(R.drawable.default_background, context);
            setUpLayout(context);
            setUpTv(message);
            toast_icon.setVisibility(View.GONE);
            toastCreation(context, duration, gravity);
        } catch (Exception e) {
            Log.e(TAG, "defaultToast: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT);
        }
    }

    public static void Success(Context context, String message, int gravity, int duration) {
        try {
            setUpLayout(context);
            setUpBackground(R.drawable.success_background, context);
            setUpTv(message, R.drawable.ic_success, context);
            toastCreation(context, duration, gravity);
        } catch (Exception e) {
            Log.e(TAG, "Success: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT);
        }
    }

    public static void Success(Context context, String message, String description, int gravity, int duration, String type) {
        try {
            setUpLayout(context);
            setUpTv(message, description, R.drawable.ic_success_2, R.color.success_color, context);
            toastCreation(context, duration, gravity);
        } catch (Exception e) {
            Log.e(TAG, "Success: ", e);
        }
    }

    public static void Error(Context context, String message, int gravity, int duration) {
        try {
            setUpLayout(context);
            setUpBackground(R.drawable.error_background, context);
            setUpTv(message, R.drawable.ic_error, context);
            toastCreation(context, duration, gravity);
        } catch (Exception e) {
            Log.e(TAG, "Error: ", e);
        }
    }

    public static void Error(Context context, String message, String description, int gravity, int duration, String type) {
        try {
            setUpLayout(context);
            setUpTv(message, description, R.drawable.ic_error_2, R.color.error_color, context);
            toastCreation(context, duration, gravity);
        } catch (Exception e) {
            Log.e(TAG, "Error: ", e);
        }
    }

    public static void Warning(Context context, String message, int gravity, int duration) {
        try {
            setUpLayout(context);
            setUpBackground(R.drawable.warning_background, context);
            setUpTv(message, R.drawable.ic_warning, context);
            toastCreation(context, duration, gravity);
        } catch (Exception e) {
            Log.e(TAG, "Warning: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT);
        }
    }

    public static void Warning(Context context, String message, String description, int gravity, int duration, String type) {
        try {
            setUpLayout(context);
            setUpTv(message, description, R.drawable.ic_warning_2, R.color.warning_color, context);
            toastCreation(context, duration, gravity);
        } catch (Exception e) {
            Log.e(TAG, "Warning: ", e);
        }
    }

    public static void Info(Context context, String message, int gravity, int duration) {
        try {
            setUpLayout(context);
            setUpBackground(R.drawable.info_background, context);
            setUpTv(message, R.drawable.ic_info, context);
            toastCreation(context, duration, gravity);
        } catch (Exception e) {
            Log.e(TAG, "Info: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT);
        }
    }

    public static void Info(Context context, String message, String description, int gravity, int duration, String type) {
        try {
            setUpLayout(context);
            setUpTv(message, description, R.drawable.ic_info_2, R.color.info_color, context);
            toastCreation(context, duration, gravity);
        } catch (Exception e) {
            Log.e(TAG, "Info: ", e);
        }
    }

    public static void Custom(Context context, String message, int gravity, int duration, int background_drawable, int text_size, String text_color, int toast_image, int layout_height, int layout_width) {

        try {
            setUpLayout(context);
            setUpBackground(background_drawable, context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(layout_width, layout_height);
            layout.setLayoutParams(layoutParams);
            toast_message.setTextSize(text_size);
            toast_message.setTextColor(Color.parseColor(text_color));
            ImageView toast_icon = layout.findViewById(R.id.toast_icon);
            setUpTv(message);
            toast_icon.setImageDrawable(context.getResources().getDrawable(toast_image));
            toast_icon.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            toastCreation(context, duration, gravity);
        } catch (Exception e) {
            Log.e(TAG, "Custom: ", e);
            Error(context, String.valueOf(e), Gravity.BOTTOM, Toast.LENGTH_SHORT);
        }
    }
}

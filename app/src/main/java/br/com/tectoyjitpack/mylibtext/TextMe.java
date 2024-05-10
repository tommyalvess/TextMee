package br.com.tectoyjitpack.mylibtext;

import android.content.Context;
import android.os.Build;

public class TextMe {
    Context context;

    public TextMe(Context context) {
        this.context = context;
    }

    public String getManufacturer(){
        return Build.MANUFACTURER.toString();
    }
    public String getModel(){
        return Build.MODEL.toString();
    }
}

package kg.geektech.lessons6;

import android.content.Context;
import android.widget.Toast;

public class CustomMath {
    public String add(int a,int b){
        return String.valueOf(a+b);
    }
    public String sub(int a,int b){
        return String.valueOf(a-b);
    }
    public String multiply(int a,int b){
        return String.valueOf(a*b);
    }
    public String div(int a,int b){
        if (b==0){
            return "нельзя делить на ноль";

        }
        return String.valueOf(a/b);
    }

}

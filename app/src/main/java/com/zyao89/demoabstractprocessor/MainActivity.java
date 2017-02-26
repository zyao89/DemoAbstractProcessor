package com.zyao89.demoabstractprocessor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.zyao89.ZyaoAnnotation;
import com.zyao89.demoprocessor.auto.Zyao$$ZYAO;

@ZyaoAnnotation(
        name = "Zyao",
        text = "Hello !!! Welcome "
)
public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeText(View view) {
        Zyao$$ZYAO zyao$$ZYAO = new Zyao$$ZYAO();
        String message = zyao$$ZYAO.getMessage();
        ((TextView)view).setText(message);
    }
}

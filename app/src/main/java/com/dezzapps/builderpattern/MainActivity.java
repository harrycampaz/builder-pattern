package com.dezzapps.builderpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dezzapps.builderpattern.builder.LayoutBuilder;
import com.dezzapps.builderpattern.builder.LayoutView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        final int width = ViewGroup.LayoutParams.MATCH_PARENT;
        final int height = ViewGroup.LayoutParams.MATCH_PARENT;
        super.onCreate(savedInstanceState);
        linearLayout  = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(width,height));

        setContentView(linearLayout);


        LayoutBuilder builder = new LayoutBuilder();
        List<LayoutView> layoutViews = builder.displayDetailed();
        for (LayoutView layoutView: layoutViews){
            ViewGroup.LayoutParams params = layoutView.layoutParams();
            textView = new TextView(this);
            textView.setText(layoutView.content());
            textView.setTextSize(layoutView.textSize());
            textView.setTextColor(layoutView.shading().shade());
            textView.setBackgroundResource(layoutView.shading().background());

            int [] padding = layoutView.padding();

            textView.setPadding(dp(padding[0]), dp(padding[1]), dp(padding[2]), dp(padding[3]));

            linearLayout.addView(textView);
        }



    }

    private int dp(int px) {

        final float scalefactor = getResources().getDisplayMetrics().density;

        int numberOfRealPixels = (int) (px * scalefactor + 0.5f);

        return  numberOfRealPixels;


    }
}

package com.aseprojali.faqpresiden.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import com.aseprojali.faqpresiden.R;
import com.aseprojali.faqpresiden.io.rest.ProgressService;
import com.aseprojali.faqpresiden.io.rest.QuestionService;


public class MainActivity extends ActionBarActivity {

    private TextView textView;
    private ProgressService progressService;
    private QuestionService questionService;
    private String test = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.txtTest);
        questionService = new QuestionService(this);
        progressService = new ProgressService(this);

        getQuestion();
    }

    public void getQuestion() {
        progressService.setProgressDialog();
        questionService.getAll();

        progressService.dissmisProgressDialog();
    }


}

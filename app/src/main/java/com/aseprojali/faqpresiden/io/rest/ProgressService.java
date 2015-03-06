package com.aseprojali.faqpresiden.io.rest;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by avew on 3/6/15.
 */
public class ProgressService {
    private Context context;
    private ProgressDialog progressDialog;

    public ProgressService(Context context) {
        this.context = context;
    }

    public void setProgressDialog() {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading..");
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    public void dissmisProgressDialog() {
        progressDialog.dismiss();
    }
}

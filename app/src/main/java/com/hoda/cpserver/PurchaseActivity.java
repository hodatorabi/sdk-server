package com.hoda.cpserver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class PurchaseActivity extends AppCompatActivity {

    public PurchaseActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.purchase_activity);
    }

    public static Intent setIntent(CalService var0, Bundle var1) {
        Intent var3 = new Intent(var0, PurchaseActivity.class);
        var3.putExtra("bundle", var1);
        return var3;
    }
}

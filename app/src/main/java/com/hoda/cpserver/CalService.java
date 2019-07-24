package com.hoda.cpserver;
import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

public class CalService extends Service {
//    private static CalService calService;
//
//    public CalService() {
//        calService = this;
//    }

    @Override
    public IBinder onBind(Intent arg0) {
        return binder;
    }
    private final ICalService.Stub binder = new ICalService.Stub() {

        @Override
        public int getResult(int val1, int val2) throws RemoteException {
            return val1 * val2;
        }
        @Override
        public String getMessage(String name) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            Intent var3 = PurchaseActivity.setIntent(CalService.this, bundle);
            var3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            CalService.this.startActivity(var3);
            return "Hello "+ name+", Result is:";
        }
    };
}

package com.cnj.naslink.connect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.cnj.naslink.R;
import com.cnj.naslink.databinding.ActivityConnectBinding;

/**
 * The activity that allows a user to connect to a freeNAS server.
 */
public class ConnectActivity extends AppCompatActivity {
    private ConnectViewModel mConnectViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // creates the view model and attaches it to the activity to allow for binding
        ActivityConnectBinding dataBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_connect);
        mConnectViewModel = ViewModelProviders.of(this).get(ConnectViewModel.class);
        dataBinding.setViewModel(mConnectViewModel);
    }
}

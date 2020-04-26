package com.cnj.naslink.filebrowse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.cnj.naslink.R;
import com.cnj.naslink.databinding.ActivityFileBrowseBinding;

/**
 * The activity that allows users to browser files on a freeNAS server.
 */
public class FileBrowseActivity extends AppCompatActivity {
    private FileBrowseViewModel mFileBrowseViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // creates the view model and attaches it to the activity to allow for binding
        ActivityFileBrowseBinding dataBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_file_browse);
        mFileBrowseViewModel = ViewModelProviders.of(this).get(FileBrowseViewModel.class);
        dataBinding.setViewmodel(mFileBrowseViewModel);
    }
}

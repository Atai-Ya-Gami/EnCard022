package com.geekteck.encard02.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geekteck.encard02.BaseFragment;
import com.geekteck.encard02.R;
import com.geekteck.encard02.databinding.FragmentBaseBinding;
import com.geekteck.encard02.databinding.FragmentWorksBinding;

public class WorksFragment extends BaseFragment<FragmentWorksBinding> {

    @Override
    protected FragmentWorksBinding bind() {
        return FragmentWorksBinding.inflate(getLayoutInflater());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

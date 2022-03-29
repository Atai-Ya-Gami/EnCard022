package com.geekteck.encard02.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geekteck.encard02.BaseFragment;
import com.geekteck.encard02.R;
import com.geekteck.encard02.databinding.FragmentAddWordBinding;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class AddWordFragment extends BottomSheetDialogFragment  {

    @Override
    protected FragmentAddWordBinding bind() {
        return FragmentAddWordBinding.inflate(getLayoutInflater());
    }
}

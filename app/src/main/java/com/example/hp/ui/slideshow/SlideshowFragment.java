package com.example.hp.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.hp.R;
import com.example.hp.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Object binding = null;
    }
}
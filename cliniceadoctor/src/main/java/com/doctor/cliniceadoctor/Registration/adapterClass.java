package com.doctor.cliniceadoctor.Registration;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class adapterClass extends FragmentStateAdapter {
    public adapterClass(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            case 1:
                return new fragmentDetails2();
            case 2:
                return new fragmentDetails3();
        }
        return new fragmentDetails1();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}

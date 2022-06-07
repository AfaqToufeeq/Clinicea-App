package com.doctor.cliniceadoctor.Registration;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.doctor.cliniceadoctor.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class registrationActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    adapterClass fragmentClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        tabLayout = findViewById(R.id.tab_layout);
        viewPager2 = findViewById(R.id.viewpager);

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentClass = new adapterClass(fragmentManager,getLifecycle());

        viewPager2.setAdapter(fragmentClass);
        tabLayout.addTab(tabLayout.newTab().setText("First Page"));
        tabLayout.addTab(tabLayout.newTab().setText("Second Page"));
        tabLayout.addTab(tabLayout.newTab().setText("Third Page"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });
    }
}
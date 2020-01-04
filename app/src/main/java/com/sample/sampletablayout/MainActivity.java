package com.sample.sampletablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    //TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
   //  tabLayout.addTab(tabLayout.newTab().setText("Send & Post"));

    private TabLayout mTabLayout;
    private LoginFragment mLoginFragment;
    private SignUpFragment mSignUpFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = findViewById(R.id.tabs);

        mTabLayout.addTab(mTabLayout.newTab().setText("Login"));
        mTabLayout.addTab(mTabLayout.newTab().setText("signup"));

        mLoginFragment = new LoginFragment();

        mSignUpFragment = new SignUpFragment();


    setTabListener();
    }

    private void setTabListener() {
    mTabLayout.addOnTabSelectedListener(
            new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {



                    switch (tab.getText().toString()){

                        case "Login":

                            getSupportFragmentManager().beginTransaction().replace(R.id.container, mLoginFragment).commit();

                            break;

                        case "signup":
                            getSupportFragmentManager().beginTransaction().replace(R.id.container, mSignUpFragment).commit();
                                break;


                    }




                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            }

    );

    }
}

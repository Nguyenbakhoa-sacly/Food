package com.example.myapplication;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new TrangChu()).commit();

                bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment= null;
                        switch (item.getItemId()){
                            case R.id.nav_food:
                                selectedFragment= new TrangChu();
                                break;
                            case R.id.nav_order:
                                selectedFragment= new DowLoad();
                                break;
                            case R.id.nav_profile:
                                    selectedFragment= new Profile();
                                break;
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                        return true;
                    }
                });
            }
        }
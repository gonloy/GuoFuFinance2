package com.example.sinotl.guofufinance;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

import com.example.sinotl.guofufinance.fragment.LiCaiBao;
import com.example.sinotl.guofufinance.fragment.SanBiaoZhiTou;
import com.example.sinotl.guofufinance.fragment.ZaiQuanZhuanRang;
import com.example.sinotl.guofufinance.fragment.all_fragment;

public class ShanBiaoZhiTou extends FragmentActivity {

    FragmentManager fm;

    RadioGroup rg;
    RadioButton all, zq, lcb, zt;
    //存放 fragment界面
    private Class fragmentArray[] = {all_fragment.class, LiCaiBao.class, SanBiaoZhiTou.class, ZaiQuanZhuanRang.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shan_biao_zhi_tou);

        fm = getSupportFragmentManager();

        rg = (RadioGroup) findViewById(R.id.sbzt_rg);

        rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.sanbiao_lcb:
                        fm.beginTransaction().replace(R.id.zt_fragment, new LiCaiBao()).commit();
                        Toast.makeText(ShanBiaoZhiTou.this, "1", 1).show();
                        break;
                    case R.id.sanbiao_all:
                        fm.beginTransaction().replace(R.id.zt_fragment, new all_fragment()).commit();
                        Toast.makeText(ShanBiaoZhiTou.this, "2", 1).show();
                        break;
                    case R.id.sanbiao_zq:
                        fm.beginTransaction().replace(R.id.zt_fragment, new ZaiQuanZhuanRang()).commit();
                        Toast.makeText(ShanBiaoZhiTou.this, "3", 1).show();
                        break;
                    case R.id.sanbiao_zt:
                        fm.beginTransaction().replace(R.id.zt_fragment, new SanBiaoZhiTou()).commit();
                        break;

                }
            }
        });
        //找到布局中 radiobutton

    }


    public class fragment extends FragmentPagerAdapter {

        public fragment(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Bundle b = new Bundle();
            Fragment f = new Fragment();
            return null;
        }

        @Override
        public int getCount() {
            return fragmentArray.length;
        }
    }

    public void check() {

        rg = (RadioGroup) findViewById(R.id.sbzt_rg);

        //找到布局中 radiobutton


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.sanbiao_zq:
                        fm.beginTransaction().replace(R.id.zt_fragment, new ZaiQuanZhuanRang())
                                .commit();
                        break;
                    case R.id.sanbiao_zt:
                        fm.beginTransaction()
                                .replace(R.id.zt_fragment, new SanBiaoZhiTou()).commit();
                        break;
                    case R.id.sanbiao_all:
                        fm.beginTransaction().replace(R.id.zt_fragment, new all_fragment())
                                .commit();
                        break;
                    case R.id.sanbiao_lcb:
                        fm.beginTransaction().replace(R.id.zt_fragment, new LiCaiBao())
                                .commit();
                        break;
                }
            }
        });

    }

    //    public void showFragem
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shan_biao_zhi_tou, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

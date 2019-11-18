package bw.com.zhoumengqi1118.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import bw.com.zhoumengqi1118.R;
import bw.com.zhoumengqi1118.adapter.FragAdapter;
import bw.com.zhoumengqi1118.adapter.RecyAdapter;
import bw.com.zhoumengqi1118.base.BaseActivity;
import bw.com.zhoumengqi1118.base.BasePresenter;
import bw.com.zhoumengqi1118.entity.HomeBean;
import bw.com.zhoumengqi1118.fragment.FragmentA;
import bw.com.zhoumengqi1118.fragment.FragmentB;
import bw.com.zhoumengqi1118.icontract.IContract;
import bw.com.zhoumengqi1118.presenter.HomePresenter;

public class MainActivity extends BaseActivity<HomePresenter> {

    @BindView(R.id.vp)
    ViewPager vp;
    @BindView(R.id.btn_sy)
    Button btnSy;
    @BindView(R.id.btn_wd)
    Button btnWd;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected HomePresenter providePresenter() {
        return new HomePresenter();
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add( new FragmentA());
        fragments.add( new FragmentB());


        vp.setAdapter(new FragAdapter(fragments,getSupportFragmentManager()));
    }

    @Override
    protected void initData() {

    }

    @OnClick({R.id.btn_sy, R.id.btn_wd})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_sy:
                vp.setCurrentItem(0);
                break;
            case R.id.btn_wd:
                vp.setCurrentItem(1);
                break;
        }
    }
}

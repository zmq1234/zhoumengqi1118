package bw.com.zhoumengqi1118.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import bw.com.zhoumengqi1118.R;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    P mpresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());

        mpresenter = providePresenter();

        initView();

        initData();
    }

    protected abstract int setLayoutId();

    protected abstract P providePresenter();

    protected abstract void initView();

    protected abstract void initData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mpresenter.detachView();
    }
}

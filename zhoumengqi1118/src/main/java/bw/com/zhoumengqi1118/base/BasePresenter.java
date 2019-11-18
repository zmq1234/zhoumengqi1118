package bw.com.zhoumengqi1118.base;

import bw.com.zhoumengqi1118.icontract.IContract;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public abstract class BasePresenter<V extends IContract.IView> {

    public V v;

    public BasePresenter(){
        initModel();
    }

    protected abstract void initModel();

    public void attachView(V v){
        this.v = v;
    }

    public void detachView(){
        if (v != null){
            v = null;
        }
    }
}

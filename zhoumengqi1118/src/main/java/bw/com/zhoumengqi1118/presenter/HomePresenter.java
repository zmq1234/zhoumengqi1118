package bw.com.zhoumengqi1118.presenter;

import bw.com.zhoumengqi1118.base.BasePresenter;
import bw.com.zhoumengqi1118.icontract.IContract;
import bw.com.zhoumengqi1118.model.HomeModel;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public class HomePresenter extends BasePresenter implements IContract.IPresenter {

    private HomeModel homeModel;

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }


    @Override
    public void getHomeData(String title, String page, String count) {
        homeModel.getData(title, page, count, new IContract.IModel() {
            @Override
            public void OnSuccess(Object data) {
                v.OnSuccess(data);
            }

            @Override
            public void OnFailure(String error) {
                v.OnFailure(error);
            }
        });
    }
}

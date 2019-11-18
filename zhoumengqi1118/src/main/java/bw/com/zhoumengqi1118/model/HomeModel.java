package bw.com.zhoumengqi1118.model;

import bw.com.zhoumengqi1118.api.HomeService;
import bw.com.zhoumengqi1118.entity.HomeBean;
import bw.com.zhoumengqi1118.icontract.IContract;
import bw.com.zhoumengqi1118.utils.RetrofitUtil;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public class HomeModel {

    public void getData(String title, String page, String count, IContract.IModel iModel){
        RetrofitUtil.getInstance().CreateService(HomeService.class)
                .homeService(title,page,count)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HomeBean>() {
                    @Override
                    public void accept(HomeBean homeBean) throws Exception {
                        iModel.OnSuccess(homeBean);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        iModel.OnFailure(throwable.getMessage());
                    }
                });
    }
}

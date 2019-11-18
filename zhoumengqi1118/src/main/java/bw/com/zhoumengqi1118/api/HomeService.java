package bw.com.zhoumengqi1118.api;

import bw.com.zhoumengqi1118.entity.HomeBean;
import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public interface HomeService {

    @GET("techApi/information/v1/findInformationByTitle")
    Observable<HomeBean> homeService(String title,String page,String count);
}

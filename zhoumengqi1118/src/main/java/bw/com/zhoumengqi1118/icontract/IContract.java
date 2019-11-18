package bw.com.zhoumengqi1118.icontract;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public interface IContract {

    //interface IView
    interface IView{
        void OnSuccess(Object data);
        void OnFailure(String error);
    }

    //interface IModel
    interface IModel{
        void OnSuccess(Object data);
        void OnFailure(String error);
    }

    //interface IPresenter
    interface IPresenter{
        void getHomeData(String title,String page,String count);
    }
}

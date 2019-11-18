package bw.com.zhoumengqi1118.app;

import android.app.Application;
import android.content.Context;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public class App extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}

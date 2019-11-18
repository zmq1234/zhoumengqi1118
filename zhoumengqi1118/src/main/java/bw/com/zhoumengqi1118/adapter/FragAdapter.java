package bw.com.zhoumengqi1118.adapter;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import retrofit2.http.FieldMap;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public class FragAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> list;
    FragmentManager fm;

    public FragAdapter(ArrayList<Fragment> list, FragmentManager fm) {
        super(fm);

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return list.get(position);
    }


    @Override
    public int getCount() {
        return list.size();
    }
}

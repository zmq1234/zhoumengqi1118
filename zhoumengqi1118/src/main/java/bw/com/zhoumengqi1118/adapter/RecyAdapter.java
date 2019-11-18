package bw.com.zhoumengqi1118.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import bw.com.zhoumengqi1118.entity.HomeBean;
import bw.com.zhoumengqi1118.fragment.FragmentA;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public class RecyAdapter extends RecyclerView.Adapter<RecyAdapter.MyViewHolder> {

    List<HomeBean.ResultBean> result;
    FragmentA context;

    public RecyAdapter(List<HomeBean.ResultBean> result, FragmentA context) {

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater.from(conte)
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

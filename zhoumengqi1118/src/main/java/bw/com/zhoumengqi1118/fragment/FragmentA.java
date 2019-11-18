package bw.com.zhoumengqi1118.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import bw.com.zhoumengqi1118.R;
import bw.com.zhoumengqi1118.adapter.RecyAdapter;
import bw.com.zhoumengqi1118.entity.HomeBean;
import bw.com.zhoumengqi1118.icontract.IContract;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public class FragmentA extends Fragment implements IContract.IView {
    @BindView(R.id.edit_sr)
    EditText editSr;
    @BindView(R.id.btn_qr)
    Button btnQr;
    @BindView(R.id.rlv)
    RecyclerView rlv;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragmenta, null);

        rlv.setAdapter(new RecyAdapter());
        return view;
    }

    @Override
    public void OnSuccess(Object data) {

        List<HomeBean.ResultBean> result = ((HomeBean) data).result;

        RecyAdapter recyAdapter = new RecyAdapter(result,this);

        rlv.setAdapter(recyAdapter);
    }

    @Override
    public void OnFailure(String error) {

    }
}

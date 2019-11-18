package bw.com.zhoumengqi1118.fragment;

import android.app.VoiceInteractor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import bw.com.zhoumengqi1118.R;

/**
 * Time:2019/11/18
 * Author:周盟棋
 * Description:
 */
public class FragmentB extends Fragment {

    @BindView(R.id.tx_zl)
    TextView txZl;
    @BindView(R.id.img)
    ImageView img;

    ArrayList<>

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentb, null);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File file = new File();

            }
        });

        return view;
    }
}

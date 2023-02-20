package hcmute.edu.vn.fragmentcommunication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.ViewModelProvider;

import org.w3c.dom.Text;

public class fragment1 extends Fragment {
    View view;
    ItemViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        Button button = view.findViewById(R.id.sendData1btn);

//        getParentFragmentManager().setFragmentResultListener("dataFrom2", this, new FragmentResultListener() {
//            @Override
//            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
//
//                String data = result.getString("df2");
//                TextView textView = view.findViewById(R.id.dataFrom2);
//                textView.setText(data);
//            }
//        });
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                EditText editText = view.findViewById(R.id.fragment1Data);
//                Bundle result = new Bundle();
//                result.putString("df1", editText.getText().toString());
//                getParentFragmentManager().setFragmentResult("dataFrom1", result);
//                editText.setText("");
//            }
//        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);

        Button button = view.findViewById(R.id.sendData1btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = view.findViewById(R.id.fragment1Data);
                viewModel.setData(editText.getText().toString());
            }
        });
    }
}

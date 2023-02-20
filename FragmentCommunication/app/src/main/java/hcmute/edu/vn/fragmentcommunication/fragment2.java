package hcmute.edu.vn.fragmentcommunication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class fragment2 extends Fragment {
    View view;
    ItemViewModel viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        view = inflater.inflate(R.layout.fragment_fragment2, container, false);

        Button button = view.findViewById(R.id.sendData2btn);

//        getParentFragmentManager().setFragmentResultListener("dataFrom2", this, new FragmentResultListener() {
//            @Override
//            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
//
//                String data = result.getString("df1");
//                TextView textView = view.findViewById(R.id.dataFrom2);
//                textView.setText(data);
//            }
//        });
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                EditText editText = view.findViewById(R.id.fragment2Data);
//                Bundle result = new Bundle();
//                result.putString("df2", editText.getText().toString());
//                getParentFragmentManager().setFragmentResult("dataFrom2", result);
//                editText.setText("");
//            }
//        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel = new ViewModelProvider(requireActivity()).get(ItemViewModel.class);

        Button button = view.findViewById(R.id.sendData2btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = view.findViewById(R.id.fragment2Data);
                viewModel.setData(editText.getText().toString());
            }
        });
    }
}

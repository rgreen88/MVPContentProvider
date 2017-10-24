package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.rynel.mvpbutterknifecalc.CalculatorContract;
import com.example.rynel.mvpbutterknifecalc.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class InputFragment extends Fragment {

    //setting up communication with the fragments to the presenter
    private CalculatorContract.ForwardInputInteractionToPresenter forwardInteraction;

    public void setPresenter (CalculatorContract.ForwardInputInteractionToPresenter
                              forwardInteraction){

        this.forwardInteraction = forwardInteraction;
    }

    @OnClick ({R.id.btn_number_one, R.id.btn_number_two, R.id.btn_number_three,
    R.id.btn_number_four, R.id.btn_number_five, R.id.btn_number_six, R.id.btn_number_seven,
    R.id.btn_number_eight, R.id.btn_number_nine, R.id.btn_number_zero})
    //numbers 0-9
    public void onNumberClick(Button v){

        //int parsing to get text to string format for display
        forwardInteraction.onNumberClick(Integer.parseInt(v.getText().toString()));


    }

    @OnClick({R.id.btn_operator_add, R.id.btn_operator_sub, R.id.btn_operator_mult,
    R.id.btn_operator_div})
    //operators for add, sub, mult, div
    public void onOperatorClick(Button v){

        forwardInteraction.onOperatorClick(v.getText().toString());

    }

    @OnClick(R.id.btn_decimal)
    //decimal
    public void onDecimalClick(Button v){

        forwardInteraction.onDecimalClick();

    }

    @OnClick(R.id.btn_equal)
    //= sign
    public void onEvaluateClick(Button v){

        forwardInteraction.onEvaluateClick();

    }

    public InputFragment() {
        // Required empty public constructor
    }

    public static InputFragment newInstance(){
        return new InputFragment();
    }

    @Override  //might need later or not at all
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment in View object v
        View v = inflater.inflate(R.layout.fragment_input, container, false);

        //butterknife setup for annotation use
        ButterKnife.bind(this, v);
        return v;
    }

}

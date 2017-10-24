package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rynel.mvpbutterknifecalc.CalculatorContract;
import com.example.rynel.mvpbutterknifecalc.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment implements CalculatorContract.PublishToView{

    //creating communication between fragments and presenter
    private CalculatorContract.ForwardDisplayInteractionToPresenter forwardInteraction;

    public void setPresenter (CalculatorContract.ForwardDisplayInteractionToPresenter
                              forwardInteraction){

        this.forwardInteraction = forwardInteraction;
    }

    @BindView(R.id.lbl_display)
    TextView display;
    //equivalent to TextView display = v.findViewIdby();

    @OnClick(R.id.imb_delete)
    public void onDeleteShortClick(View v){

        forwardInteraction.onDeleteShortClick();

    }
    //standard delete

    @OnLongClick(R.id.imb_delete)
    public void onDeleteLongClick(View v){

        forwardInteraction.onDeleteLongClick();

    }
    //allows delete to clear display if held long enough if user is notified lol...


    public DisplayFragment() {
        // Required empty public constructor
    }

    public static DisplayFragment newInstance() {

        return new DisplayFragment();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_display, container, false);

        //setting up butterknife for display frag
        ButterKnife.bind(this, v);
        return v;
    }

    @Override
    public void showResult(String result) {

    }

    @Override
    public void showToastMessage(String message) {

    }
}

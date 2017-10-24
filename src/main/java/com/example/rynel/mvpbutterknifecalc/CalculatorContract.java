package com.example.rynel.mvpbutterknifecalc;

/**
 * Created by rynel on 10/23/2017.
 */

public interface CalculatorContract {


    //explicit naming convention
    //Our view handles these methods (DisplayFragment)
    interface PublishToView{

        void showResult(String result);//if valid

        void showToastMessage(String message);//if invalid

    }


    //explicit naming convention
    //passes click events from our View (DisplayFragment), to the presenter
    interface ForwardDisplayInteractionToPresenter{

        void onDeleteShortClick();

        void onDeleteLongClick();

    }

    //explicit naming convention
    //passes click events from our View (InputFragment), to the presenter
    interface ForwardInputInteractionToPresenter{

        void onNumberClick(int number);

        void onDecimalClick();

        void onEvaluateClick();

        void onOperatorClick(String operator);

    }

}

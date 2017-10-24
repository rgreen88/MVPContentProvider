package com.example.rynel.mvpbutterknifecalc;

/**
 * Created by rynel on 10/23/2017.
 */

public class CalculatorPresenter implements CalculatorContract.ForwardInputInteractionToPresenter,
        CalculatorContract.ForwardDisplayInteractionToPresenter{

    private CalculatorContract.PublishToView publishResult;

    //constructor for displaying on view... An object of DisplayFragment
    public CalculatorPresenter (CalculatorContract.PublishToView publishResult){

        this.publishResult = publishResult;  //using interface from CalculatorContract

    }

    @Override
    public void onDeleteShortClick() {

    }

    @Override
    public void onDeleteLongClick() {

    }

    @Override
    public void onNumberClick(int number) {

    }

    @Override
    public void onDecimalClick() {

    }

    @Override
    public void onEvaluateClick() {

    }

    @Override
    public void onOperatorClick(String operator) {

    }
}

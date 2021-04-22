package kz.funkner.funknercalculater.ui;
import android.graphics.Path;
import android.util.ArraySet;
import android.util.Log;


import java.util.ArrayList;

import kz.funkner.funknercalculater.domain.Calculater;
import kz.funkner.funknercalculater.domain.Operation;

public class CalculaterPresenter {

    private CalculaterView view;
    private Calculater calculater;
    private ArrayList<Double> valuesArrays = new ArrayList<>();
    private ArrayList<Operation> actionArrays = new ArrayList<>();
    private StringBuilder numberValue = new StringBuilder();
    private StringBuilder textResult = new StringBuilder();
    private int curValue = 0;




    public CalculaterPresenter(CalculaterView view, Calculater calculater) {
        this.view = view;
        this.calculater = calculater;
    }

    public void addNumber(String num) {
        numberValue.append(num);
        textResult.append(num);
        view.showResult(textResult.toString());
    }


    public void updateArrayValues() {
        valuesArrays.add(Double.valueOf(numberValue.toString()));
        Log.v("CURRVALUE",valuesArrays.get(curValue).toString());
        curValue++;
        numberValue.setLength(0);
        Log.v("ADD",numberValue.toString());
    }

    public void addOperation(Operation operation) {
        actionArrays.add(operation);
        if(operation == Operation.MUL)
            textResult.append(" * ");
        if(operation == Operation.DIV)
            textResult.append(" / ");
        if(operation == Operation.SUM)
            textResult.append(" + ");
        if(operation == Operation.SUB)
            textResult.append(" - ");
        view.showResult(textResult.toString());
    }

    public void getResult() {
        updateArrayValues();
        result();
        curValue = 0;
        textResult.setLength(0);
        numberValue.setLength(0);
        numberValue.append(valuesArrays.get(0));
        textResult.append(valuesArrays.get(0).toString());
        valuesArrays.clear();
        view.showResult(textResult.toString());
        Log.v("COUNTARRAYS",actionArrays.size()+" "+valuesArrays.size());
    }

    private void result() {
        searchFirstAction();
        operateSumAndSub();
    }

    private void searchFirstAction() {
        for (int i = 0; i< actionArrays.size(); i++){
            if(actionArrays.get(i) == Operation.DIV){
                setNewValue(operateDiv(i), i);
                actionArrays.remove(i);
                continue;
            }
            if(actionArrays.get(i) == Operation.MUL){
                setNewValue(operateMul(i), i);
                actionArrays.remove(i);
                continue;
            }
        }
    }

    private void setNewValue(double newValue, int i) {
        valuesArrays.set(i,newValue);
        valuesArrays.remove(i+1);
    }

    private double operateMul(int i) {
        return valuesArrays.get(i) * valuesArrays.get(i+1);
    }

    private double operateDiv(int i) {
        return valuesArrays.get(i) / valuesArrays.get(i+1);
    }

    private void operateSumAndSub() {
        for (int i = 0; i< actionArrays.size(); i++){
            if(actionArrays.get(i) == Operation.SUM){
                setNewValue(operateSum(i), i);
                actionArrays.remove(i);
                continue;
            }
            if(actionArrays.get(i) == Operation.SUB){
                setNewValue(operateSub(i), i);
                actionArrays.remove(i);
                continue;
            }
        }
    }

    private double operateSum(int i) {
        return valuesArrays.get(i) + valuesArrays.get(i+1);
    }

    private double operateSub(int i) {
        return valuesArrays.get(i) - valuesArrays.get(i+1);
    }


    public void clearAll() {
        curValue = 0;
        valuesArrays.clear();
        actionArrays.clear();
        numberValue.setLength(0);
        textResult.setLength(0);
        view.showResult("0");
    }

    public void clearLastChar() {
        if(textResult.length()>0){
            textResult.delete(textResult.length()-1,textResult.length());
            view.showResult(textResult.toString());
        }
    }
}

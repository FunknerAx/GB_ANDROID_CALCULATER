package kz.funkner.funknercalculater.domain;

public class CalculaterImpl implements Calculater {
    @Override
    public double doAction(double valueOne, double valueTwo, Operation operation) {
        switch (operation) {
            case SUM: {
                return valueOne + valueTwo;
            }
            case DIV: {
                return valueOne / valueTwo;
            }
            case MUL: {
                return valueOne * valueTwo;
            }
            case SUB: {
                return valueOne - valueTwo;
            }
            default:
                return 0;
        }
    }
}

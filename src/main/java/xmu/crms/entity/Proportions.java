package xmu.crms.entity;

/**
 * @author LuLongfei
 * @date 2017-12-2
 */
public class Proportions {
    private int a;
    private int b;
    private int c;
    private int report;
    private int presentation;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getReport() {
        return report;
    }

    public void setReport(int report) {
        this.report = report;
    }

    public int getPresentation() {
        return presentation;
    }

    public void setPresentation(int presentation) {
        this.presentation = presentation;
    }

    public Proportions(int a, int b, int c, int report, int presentation) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.report = report;
        this.presentation = presentation;
    }

    @Override
    public String toString() {
        return "Proportions{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", report=" + report +
                ", presentation=" + presentation +
                '}';
    }
}

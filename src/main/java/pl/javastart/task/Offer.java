package pl.javastart.task;

public class Offer {

    private boolean valid;
    private double value;
    private double percentage;

    protected Offer() {
    }

    protected boolean isValid() {
        return valid;
    }

    protected void setValid(boolean valid) {
        this.valid = valid;
    }

    protected void setValue(double value) {
        this.value = value;
    }

    protected double getValue() {
        return value;
    }

    protected double getPercentage() {
        return percentage;
    }

    protected void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}

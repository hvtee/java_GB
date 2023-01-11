package seminar6;

public class Phone {
    private String model;
    public String number;
    private double weight;

    public Phone(String model, String number, double weight) {
        this(model, number);
        this.weight = weight;
    }

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String name) {
        System.out.println(" ");
        System.out.printf("Number %s receives call from %s", number, name);
    }

    public void receiveCall(String name, String number) {
        System.out.println(" ");
        System.out.printf("Number %s receives call from %s with number %s.", this.number, name, number);
    }

    public void sendMessage(String message, String... numbers) {
        for (String number :
                numbers) {
            System.out.println();
            System.out.printf("From %s to %s sent %s", this.number, number, message);

        }
    }
}

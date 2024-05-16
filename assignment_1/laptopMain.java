package sem_4_Assignments.assignment_1;

public class laptopMain {
    public static void main(String[] args) {
        laptop l = new laptop(null,0);
        l.setModel("HP");
        l.setPrice(100000);
        System.out.println(l.getModel()+" "+l.getPrice());
        System.out.println(l);
    }
}
class laptop{
    private String model;
    private double price;
    laptop(String model,double price){
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){

        return price +" "+ model;
    }
}
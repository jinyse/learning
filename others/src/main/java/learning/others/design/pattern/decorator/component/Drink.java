/*
 *
 */
package learning.others.design.pattern.decorator.component;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/29 10:02
 * @Version V1.0
 */
public abstract class Drink {
    private String description = "";
    private double price = 0;

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

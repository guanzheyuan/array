package dto;

/**
 * @author：guan.zheyuan
 * @date： 2021/2/7下午2:32
 * @description：
 */
public class items {
    private String name;
    private double price;

    public items(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

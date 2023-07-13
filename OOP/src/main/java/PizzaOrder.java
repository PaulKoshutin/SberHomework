public class PizzaOrder {
    private String name, address;

    private enum Size {SMALL, MEDIUM, BIG};
    private Size size;
    private boolean sauceNeeded, orderAccepted;

    PizzaOrder(String name, String address, String size, boolean sauceNeeded) {
        this.name = name;
        this.address = address;
        switch (size) {
            case "SMALL" -> this.size = Size.SMALL;
            case "MEDIUM" -> this.size = Size.MEDIUM;
            case "BIG" -> this.size = Size.BIG;
        }
        this.sauceNeeded = sauceNeeded;
    }

    public void order() {
        if (orderAccepted) {
            System.out.println("Заказ уже принят.");
        } else {
            orderAccepted = true;
            String output = "Заказ принят. ";
            switch (size) {
                case SMALL -> output += "Маленькая ";
                case MEDIUM -> output += "Средняя ";
                case BIG -> output += "Большая ";
            }
            output += "пицца " + name + " ";
            if (sauceNeeded)
                output += "с соусом ";
            output += "на адрес " + address;
            System.out.println(output);
        }
    }

    public void cancel() {
        if (orderAccepted) {
            System.out.println("Заказ отменен.");
            orderAccepted = false;
        } else
            System.out.println("Заказ не был принят.");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Size getSize() {
        return size;
    }

    public boolean getSauceNeeded() {
        return sauceNeeded;
    }

    public String toString() {
        String str = name + " " + address + " " + size + " " + sauceNeeded + " " + orderAccepted;
        System.out.println(str);
        return str;
    }
}

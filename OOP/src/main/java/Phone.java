public class Phone {
    private String number, model;
    private float weight;
    Phone(String number, String model, float weight)
    {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    Phone (String number, String model)
    {
        this.number = number;
        this.model = model;
    }
    Phone()
    {

    }
    public void receiveCall(String name)
    {
        System.out.println("Звонит "+name);
    }
    public void receiveCall(String name, String number)
    {
        System.out.println("Звонит "+name+" "+number);
    }
    public String getNumber()
    {
        return number;
    }
    public void sendMessage(String[] numbers)
    {
        for (String num: numbers)
        {
            System.out.println(num);
        }
    }
    public String toString()
    {
        String str = number+" "+model+" "+weight;
        System.out.println(str);
        return str;
    }
}

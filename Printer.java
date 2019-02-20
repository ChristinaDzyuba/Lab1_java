public class Printer
{
    public static void main(String []args)
    {
        Printer epson = new Printer("Epson",4000,"TR20",15);
        Printer canon = new Printer("A4","laser");
        Printer hp = new Printer();

        epson.printPrice();
        canon.resetValues("Canon",500,2500,"Vasya",6,"A48","laser");
        hp.printStaticDpi();
        epson.toString();
    }
    
    private String name;
    private int speed;
    private int price;
    private String modelName;
    private int amountOfColors;

    static int dpi;

    protected String paperSize;
    protected String printTechnology;

    Printer()
    {
    }

    Printer(String name, int price, String modelName, int speed)
    {
        this.name = name;
        this.price = price;
        this.modelName = modelName;
        this.speed = speed;
    }

    Printer(String paperSize,String printTechnology)
    {
        this.paperSize = paperSize;
        this.printTechnology = printTechnology;
    }

    public String getName()
    {
        return name;
    }
    public int getSpeed()
    {
        return speed;
    }

    public int getPrice()
    {
        return price;
    }
    public String getModelName()
    {
        return modelName;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    public void printStaticDpi()
    {
        System.out.println("Static field dpi is "+dpi);
    }

    @Override
    public String toString()
    {
        return "Printer{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", modelName='" + modelName + '\'' +
                ", amountOfColors=" + amountOfColors +
                ", paperSize='" + paperSize + '\'' +
                ", printTechnology='" + printTechnology + '\'' +
                '}';
    }

    public void printPrice()
    {
        System.out.println(" Epson's price is "+price);
    }

    public void resetValues(String name, int speed, int price, String modelName,int amountOfColors,String paperSize, String printTechnology)
    {
        this.name = name;
        this.speed = speed;
        this.price = price;
        this.modelName = modelName;
        this.amountOfColors = amountOfColors;
        this.paperSize = paperSize;
        this.printTechnology = printTechnology;

        System.out.println("Name is "+this.name+"\n"+"Speed is "+this.speed+"\n"+"Price is "+this.price);
    }

}





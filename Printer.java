public class Printer
{
    public static void main(String []args)
    {
        Printer epson = new Printer();
        Printer canon = new Printer();
        Printer hp = new Printer();

        epson.printPrice();
        canon.resetValues("Canon",500,5000,"Vasya",6,"A48","laser");
        hp.printStaticDpi();
    }


    private String name;
    private int speed;
    private int price;
    private String modelName;
    private int amountOfColors;

    static int dpi;

    protected String paperSize;
    protected String printTechnology;

    Printer(String name)
    {
        this.name = name;
        price = 2500;
        modelName = "Pixma";
        speed = 15;
    }

    Printer()
    {
        name = "HP";
        speed = 50;
        price = 3000;
        modelName = "LaserJet";
        amountOfColors = 5;
        dpi = 1200;
        paperSize = "A4";
        printTechnology = "laser";
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

    public void setName(String Samsung)
    {
        name = Samsung;
    }

    public void setSpeed(int speed)
    {
        speed = 200;
    }

    public void setPrice(int price)
    {
        price = 3500;
    }
    public void setModelName(String SL)
    {
        modelName = SL;
    }

    public void printStaticDpi()
    {
        System.out.println("dpi is "+dpi);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void printPrice()
    {
        System.out.println(price);
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





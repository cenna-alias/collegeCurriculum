public class CPU
{
    int price;

    CPU(int p)
    {
        price = p;
    }

    class Processor
    {
        int cores;
        String producer;

        Processor(int noC, String manu)
        {
            cores = noC;
            producer = manu;
        }

        void display()
        {
            System.out.println("Processor Info");
            System.out.println("No. of Cores  = " + cores);
            System.out.println("Manufacturer  = " + producer);
        }
    }

    static class RAM
    {
        int mem;
        String manufacturer;

        RAM(int memory, String producer)
        {
            mem      = memory;
            manufacturer = producer;
        }

        void display()
        {
            System.out.println("RAM Info");
            System.out.println("Memory        = " + mem + " GB");
            System.out.println("Manufacturer  = " + manufacturer);
        }
    }

    public static void main(String[] args)
    {
        CPU obj        = new CPU(500);
        CPU.RAM obj1   = new CPU.RAM(8, "Intel");
        CPU.Processor obj2 = obj.new Processor(8, "Samsung");

        System.out.println("CPU Info");
        System.out.println("Price         = " + obj.price);
        System.out.println();
        obj1.display();
        System.out.println();
        obj2.display();
    }
}
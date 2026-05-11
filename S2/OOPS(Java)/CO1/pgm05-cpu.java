public class CPU {

    int price;

    class Processor {

        int cores;
        String producer;

        Processor(int noC, String manu) {
            cores = noC;
            producer = manu;
        }

        void display() {
            System.out.println("\nProcessor info");
            System.out.println("No. of Cores = " + cores);
            System.out.println("Manufacturer = " + producer + "\n");
        }
    }

    static class RAM {

        int mem;
        String manufacturer;

        RAM(int memory, String producer) {
            mem = memory;
            manufacturer = producer;
        }

        void display() {
            System.out.println("\nRAM info");
            System.out.println("Memory = " + mem + " GB");
            System.out.println("Manufacturer = " + manufacturer + "\n");
        }
    }

    public static void main(String[] args) {

        CPU.RAM obj1 = new CPU.RAM(8, "Intel");

        CPU obj2 = new CPU();

        CPU.Processor obj3 = obj2.new Processor(8, "Samsung");

        obj1.display();
        obj3.display();
    }
}
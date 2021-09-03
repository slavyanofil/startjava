public class Variable {   
    public static void main(String[] args) {

        byte cpus=6;
        short pagefileSize=18749;
        int ramSize=16384;
        long diskCapacity=976166908;
        float cpuFreq=2.9f;
        double connectSpeed=94.8;
        char cpuFamily='i';
        boolean personal=true;

        System.out.println("- PC info -");
        System.out.println("CPUs "+cpus);
        System.out.println("Pagefile size "+pagefileSize+"MB");
        System.out.println("RAM "+ramSize+"MB");
        System.out.println("Hard disk "+diskCapacity+"KBytes");
        System.out.println("CPU @ "+cpuFreq+"GHz");
        System.out.println("Connection speed "+connectSpeed+"MBps");
        System.out.println("CPU family "+cpuFamily);
        System.out.println("Is this a personal computer? "+personal);
    }
}
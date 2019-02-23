public class Computer implements Comparable<Computer> {
    private String name;
    private double cpu;
    private int memory;

    public Computer(String name, double cpu, int memory) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer [" +
                "name=" + name +
                ", cpu=" + cpu +
                ", memory=" + memory +
                ']';
    }

    @Override
    public int compareTo(Computer o) {
        if (this.cpu > o.cpu)
            return 1;
        else if (this.cpu < o.cpu)
            return -1;
        else {
            if (this.memory > o.memory)
                return 1;
            else if (this.memory < o.memory)
                return -1;
            else return this.name.compareTo(o.name);
        }
    }
}

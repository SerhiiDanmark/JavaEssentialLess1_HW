package Task4;

public class Computer {
    String computers;

    public static void main(String[] args) {
        Computer[] computers = new Computer [5];
        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();

        for (int i = 0; i < 5; i++) {
           computers[i].computers = "Computer " + i;
        }

        for (Computer comp: computers) {
            System.out.println("Detail: " + comp.computers);
        }
    }
}

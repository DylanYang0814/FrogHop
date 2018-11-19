public class Runner {

    public static void main(String[] args) {
        FrogSimulation frog1 = new FrogSimulation(31, 5);
        FrogSimulation frog2 = new FrogSimulation(32, 5);
        FrogSimulation frog3 = new FrogSimulation(33, 5);

        System.out.println("Frog1 Success Rate: " + frog1.runSimulations(5));
        System.out.println("Frog2 Success Rate: " + frog2.runSimulations(5));
        System.out.println("Frog3 Success Rate: " + frog3.runSimulations(5));

    }
}

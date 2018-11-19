public class FrogSimulation {
    private int goalDistance;
    private int maxHops;
    private String report;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        int posOrNeg = 0;

        if ((Math.random() * 100) > 25) {
            posOrNeg = 1;
        }
        if ((Math.random() * 100) <= 25) {
            posOrNeg = -1;
        }
        int num = ((int) (Math.random() * 20) * posOrNeg);
        return num;
    }

//        public boolean simulate()
//    {
//        int currentPos = 0;
//        while (currentPos >-1 && maxHops != 0 && currentPos <= goalDistance)
//        {
//            currentPos += hopDistance();
//            System.out.println(currentPos);
//            maxHops--;
//            if(currentPos>=goalDistance)
//            {
//                return true;
//            }
//            if(maxHops==0 || currentPos <=-1)
//            {
//                return false;
//            }
//        }
//        if(currentPos>=goalDistance)
//        {
//            return true;
//        }
//        return false;
//
//    }
    public boolean simulate() {
        report = "Goal: " + goalDistance + " Hops:";
        int position = 0;
        for (int count = 0; count < maxHops; count++) {
            int rannum = hopDistance();
            position += rannum;
            report += " " + rannum + " ";
            if (position >= goalDistance) {
                System.out.println(report + " Final Distance: " + position + " Reached Goal");
                return true;
            } else if (position < 0) {
                System.out.println(report + " Final Distance: " + position + " Failed, Past Start");
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num) {
        double count = 0;
        double runs = (double)num;
        while (num > 0) {
            if (simulate()) {
                count++;
                num--;
            }
            if (!simulate()) {
                num--;
            }
        }
        return (count / runs);
    }
}

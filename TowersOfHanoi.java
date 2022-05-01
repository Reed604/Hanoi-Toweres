
public class TowersOfHanoi {

    private int totalDisks;
    private int step;

    TowersOfHanoi() {

        totalDisks = 0;
    }

    TowersOfHanoi(int disks) {

        totalDisks = disks;
        step = 1;
    }

    public void solve() {

        moveTower(totalDisks, 1, 3, 2);

    }

    private void moveTower(int totalDisks, int start, int end, int temp) {

        if (totalDisks == 1) {

            moveOneDisk(start, end);

        } else {

            moveTower(totalDisks - 1, start, temp, end);

            moveOneDisk(start, end);

            moveTower(totalDisks - 1, temp, end, start);
        }
    }

    private void moveOneDisk(int start, int end) {

        System.out.println("Step #" + step + "-----");
        System.out.println("Action: Move one disk from tower #" + start + " to tower #" + end);
        step++;
    }

}

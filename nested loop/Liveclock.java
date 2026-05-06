
class Liveclock {

    public static void main(String[] args) {
        int h = 0, m = 0, s = 0;
        for (h = 0; h <= 23; h++) {
            for (m = 0; m <= 60; m++) {
                for (s = 0; s <= 59; s++) {
                    System.out.println(h + ":" + m + ":" + s);
                    try {
                        Thread.sleep(1000); // wait 1 second
                    } catch (InterruptedException e) {
                        System.out.println("Clock interrupted: " + e.getMessage());
                    }
                }
            }
        }
    }
}

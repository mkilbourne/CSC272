public class Microwave {

    private int timeInSeconds;
    private int powerLevel;

    public Microwave() {
        this.timeInSeconds = 0;
        this.powerLevel = 1; // default power level
    }

    // Button 1: Increase time by 30 seconds
    public void addThirtySeconds() {
        timeInSeconds += 30;
        System.out.println("Added 30 seconds. Current time: " + timeInSeconds + " seconds.");
    }

    // Button 2: Switch between power levels 1 and 2
    public void togglePowerLevel() {
        powerLevel = (powerLevel == 1) ? 2 : 1;
        System.out.println("Power level switched. Current power level: " + powerLevel);
    }

    // Button 3: Start button
    public void start() {
        if (timeInSeconds == 0) {
            System.out.println("Cannot start. Time is set to 0 seconds.");
        } else {
            System.out.println("Cooking for " + timeInSeconds + " seconds at level " + powerLevel + ".");
        }
    }

    // Button 4: Reset button
    public void reset() {
        timeInSeconds = 0;
        powerLevel = 1;
        System.out.println("Microwave reset. Time: 0 seconds, Power level: 1.");
    }

    // Main method to test all buttons
    public static void main(String[] args) {
        Microwave mw = new Microwave();

        System.out.println("=== Microwave Test Sequence ===");

        // Add time twice
        mw.addThirtySeconds();
        mw.addThirtySeconds();

        // Change power level
        mw.togglePowerLevel();

        // Start cooking
        mw.start();

        // Reset microwave
        mw.reset();

        // Try starting with zero time
        mw.start();

        // Add time again and start
        mw.addThirtySeconds();
        mw.start();

        System.out.println("=== End of Test ===");
    }
}
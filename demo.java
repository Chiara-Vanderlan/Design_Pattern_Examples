public class demo {

    public static void main(String[] args) {
        OldCoffeeMachine oldMachine = new OldCoffeeMachine();
        CoffeeMachineInterface touchscreen = new CoffeeTouchscreenAdapter(oldMachine);

    }
}


public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    private OldCoffeeMachine OldVendingMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine OldVendingMachine) {
        this.OldVendingMachine = OldVendingMachine;
    }

    public void chooseFirstSelection(){
        OldVendingMachine.selectA();
    }
    public void chooseDecondSelection(){
        OldVendingMachine.selectB();
    }


}

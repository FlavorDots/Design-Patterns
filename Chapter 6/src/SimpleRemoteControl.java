public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    void setCommand(Command command){
        this.slot = command;
    }

    void buttonWasPressed(){
        slot.execute();
    }
}

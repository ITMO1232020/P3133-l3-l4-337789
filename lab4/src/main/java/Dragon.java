public class Dragon implements SpecialAction{
    private int NumberOfHead;

    public Dragon(int numberOfHead){
        this.NumberOfHead = numberOfHead;
    }


    @Override
    public String action() {
        return "The " + NumberOfHead + "-head dragon was already running away";
    }
}

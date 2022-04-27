public class MediatorImpl extends Mediator{
    @Override
    public void attach(String msg, Person person) {
        if(person==getHouseOwner()){
            getTenant().getMessage(msg);
        }
        else{
            getHouseOwner().getMessage(msg);
        }
    }
}

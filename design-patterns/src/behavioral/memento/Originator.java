package behavioral.memento;

public class Originator {
   private String state;

   public void setState(String state){
      this.state = state;
   }

   public Memento createMemento() {
       return new Memento(state);
   }
   
   public String getState(){
      return state;
   }

   public void getStateFromMemento(Memento memento){
      state = memento.getState();
   }
}

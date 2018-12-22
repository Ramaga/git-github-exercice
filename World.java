public class World{
    String worldName;
    
    public World(String worldName){
        this.worldName = worldName;
    }
    
    public void hello(){
        System.out.println("Hello world " + this.worldName);
    }
}
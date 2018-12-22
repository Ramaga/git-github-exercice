public class World{
    private String worldName;
    
    public String getWorldName(){
        return this.worldName;
    }
    
    public void setWorldName(String worldName){
        this.worldName = worldName;
    }
    
    private World(){
        
    }
    
    public World(String worldName){
        this();
        this.setWorldName(worldName);
    }
    
    public void hello(){
        System.out.println("Hello world " + this.getWorldName());
    }
}
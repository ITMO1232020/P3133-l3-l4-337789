public class Thing {
    private String Name;

    public Thing(String name){
        this.Name = name;
        System.out.println(this.Name + " was created");
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    public String beBuilt(String where){
        Thing Obj = this;
        class Worker{
            String built(){
                return (Obj.getName() + " has been built");
            }
        }
        Worker worker = new Worker();
        return worker.built();
    }

    public static class Cloud extends Thing{
        private static String Location;
        private static String Element = "dust";

        public Cloud(String name) {
            super(name);
        }

        public static void setLocation(String location) throws CloudLocationException{
            if(location!="on the road in the distance") throw new CloudLocationException();
            Location = location;
            System.out.println("Set cloud's location is " + location);
        }

        public static String appeared(){
            return "Cloud " + "of " + Element + " appeared " + Location;
        }

        public static String approachedAndGrew(String how){
            return "It " + how + " approached and grew larger";
        }
    }
}

package work;


public class Controler {
    private final Sorter method;
    private final Container monsters;
    private String log;

    public Controler(Sorter st, Container ct){
        method = st;
        monsters = ct;
        log = "";
    }

    public void run(){
        method.load(monsters);
        while(!method.finish()){
            String []res = method.sortStep();
            for(String str : res){
                log += str;
            }
            log+="\n";
        }
    }

    public String getlog(){
        return log;
    }
}

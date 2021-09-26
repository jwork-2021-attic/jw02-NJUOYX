package work.basic;

public class Controler {
    private final Sorter method;
    private final Container monsters;
    private String log;

    public Controler(Sorter st, Container ct) {
        method = st;
        monsters = ct;
        log = "";
    }

    public void run() {
        log += "[frame]\n";
        String[] res = method.load(monsters);
        for (String str : res) {
            log += str;
        }
        log += "\n[frame]\n";
        while (!method.finish()) {
            res = method.sortStep();
            for (String str : res) {
                log += str;
            }
            log += "\n[frame]\n";
        }
    }

    public String getlog() {
        return log;
    }
}

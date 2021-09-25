package work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {
    public static void main(String []args) throws IOException{
        final int n = 6;
        Container monsters = new Vector(n);
        monsters.put(new Colorbk(232), 0);
        monsters.put(new Colorbk(42), 1);
        monsters.put(new Colorbk(122), 2);
        monsters.put(new Colorbk(72), 3);
        monsters.put(new Colorbk(82), 4);
        monsters.put(new Colorbk(192), 5);

        Sorter method = new BubbleSorter();
        Controler snake = new Controler(method, monsters);
        snake.run();
        String buffer = snake.getlog();
        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(buffer);
        writer.flush();
        writer.close();
    }
}

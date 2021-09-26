package work.task3;

import work.basic.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Scene {
    public static void main(String[] args) throws IOException {
        final int n = 256;
        Container monsters = new Matrix(16, 16);
        Set<Integer> set = new HashSet<Integer>();
        Random random = new Random();
        int i = 0;
        while (set.size() < n) {
            int s = random.nextInt(n);
            Boolean res = set.add(s);
            if (res) {
                monsters.put(new Colorbk(s), i++);
            }
        }

        Sorter method = new BubbleSorter();
        //Sorter method = new MergeSorter();
        Controler snake = new Controler(method, monsters);
        snake.run();
        String buffer = snake.getlog();
        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter("result3.txt"));
        writer.write(buffer);
        writer.flush();
        writer.close();
    }
}

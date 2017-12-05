package nio.channel;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by chywoo.park on 2017. 2. 22..
 */
public class NioFirstApp {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("data/textfile.txt");
        FileChannel fic = fis.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(100);

        fic.read(buf);

        System.out.println(new String(buf.array()));

        fic.close();
        fis.close();

    }
}

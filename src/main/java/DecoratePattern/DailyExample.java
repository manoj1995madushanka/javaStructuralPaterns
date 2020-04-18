package DecoratePattern;

import org.w3c.dom.CDATASection;

import java.io.*;

public class DailyExample {
    public void dailyDecorator() throws IOException {
        File file = new File("./text.txt");
        file.createNewFile();

        OutputStream oStream = new FileOutputStream(file);

        DataOutputStream doStream = new DataOutputStream(oStream);
        doStream.writeChars("text");

        doStream.close();
        oStream.close();
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader  {

    public int readInteger() throws NumberFormatException ,IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine().trim());
    }

    public String readString()  {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine().trim();
        } catch (Exception e){ return "";}
    }
}


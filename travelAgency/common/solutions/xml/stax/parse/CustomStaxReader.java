package travelAgency.common.solutions.xml.stax.parse;

import java.io.FileInputStream;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

public class CustomStaxReader implements AutoCloseable {
    private XMLStreamReader reader = null;
    private FileInputStream fileInputStream;


    private CustomStaxReader(){

    }

    public static CustomStaxReader newInstance(String file) throws Exception {
        CustomStaxReader instance = new CustomStaxReader();
        instance.fileInputStream = new FileInputStream(file);
        instance.reader = XMLInputFactory.newInstance()
            .createXMLStreamReader(instance.fileInputStream);
        return instance;
    }

    @Override
    public void close() throws Exception {
        if (reader != null) {
            reader.close();
        }

        if (fileInputStream != null) {
            fileInputStream.close();
        }
    }


    public XMLStreamReader getReader() {
        return reader;
    }
}
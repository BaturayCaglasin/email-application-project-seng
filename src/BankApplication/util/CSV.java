package BankApplication.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    public static List < String [] > read(String file){

        List <String[]> data = new LinkedList<String[]>();
        String dataRow;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

           while((dataRow = reader.readLine()) != null );
           String[] dataRecords =  dataRow.split(",");
            data.add(dataRecords);

        } catch (FileNotFoundException e) {
            System.out.println("COULD NOT FOUND THE FILE");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("COULD NO READ THE FILE");
            e.printStackTrace();
        }
        return data;
    }

    }


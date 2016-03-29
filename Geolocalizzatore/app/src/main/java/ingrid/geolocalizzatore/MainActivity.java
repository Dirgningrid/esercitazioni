package ingrid.geolocalizzatore;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends Activity {

    /*FileReader fr = new FileReader("dati.csv");

    BufferedReader br = new BufferedReader(fr);

    */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Map<Address, List<Integer>> indirizzi = new HashMap<>();
        InputStream is = getResources().openRawResource(R.raw.dati);


        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            List<Integer> t;
            String csvLine;

            br.readLine(); //salto la riga di intestazione

            while ((csvLine = br.readLine()) != null) {
                String[] row = csvLine.split(";");
                if (row.length = "\r") {
                    continue;
                }

                Address a = new Address();

                a.setTipoVia(row[3]);
                a.setIndirizzo(row[4]);
                a.setNumCivico(row[5]);
                a.setCitta("Milano");

            }
            br.close();
        }
            catch (IOException ex) {
                throw new RuntimeException("Error in reading CSV file: "+ex);
            }
            finally {
                try {
                    inputStream.close();
                }
                catch (IOException e) {
                    throw new RuntimeException("Error while closing input stream: "+e);
                }
            }
            return resultList;
        }
        }


    }
}

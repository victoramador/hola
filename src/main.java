

import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.List;


public class main {

    public static void main(String[] args) {
        List<coche> cochesList = new ArrayList<>();

        coche jaguar = new coche("2534HJG", "Jaguar", "F-type", 80000.0, "rojo");
        coche audi = new coche("1324GJK", "Audi", "R8", 810000.0, "azul");
        coche mercedes = new coche("2342KJH", "Mercedes", "a45 AMG", 800400.0, "negro");

        cochesList.add(jaguar);
        cochesList.add(audi);
        cochesList.add(mercedes);

        System.out.println("Muestro el jaguar " + cochesList.get(0));




    }
}


package odyssey;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

/**
 * Clase Nodo del Huffman para crear el arbol
 *
 * @author josek
 */
class HuffmanNode {

    int data;
    char c;
    HuffmanNode left;
    HuffmanNode right;
}

/**
 * Comparator classe para realizar comparaciones
 *
 * @author josek
 */
class MyComparator implements Comparator<HuffmanNode> {

    @Override
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.data - y.data;
    }
}

/**
 * Algoritmo de compresion:Huffman
 *
 * @author josek
 */
public class Huffman {

    static String d, goConsole, nada, codeBytes, codeMSJ = "";
    //Hashtable<String, Integer> diccionario = new Hashtable<String, Integer>();
    static HashMap<String, Integer> map;
    static HashMap<String, String> mapFinally = new HashMap<String, String>();
    static TreeMap<String, Integer> sorted_map;

    /**
     * print del arbol Huffman
     *
     * @param root Node of the Tree
     * @param s Binary Number
     */
    public static void printCode(HuffmanNode root, String s) {
        if (root.left == null && root.right == null) {
            String cons = root.c + ":" + s;
            codeMSJ += "//" + root.c + s;
            System.out.println(cons);
            String a = "" + root.c;
            mapFinally.put(a, s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    /**
     * Método para pasar de xml a bytes
     *
     * @param msj
     * @return
     */
    public static String xmlToBytes(String msj) {
        String a;
        for (int xml_ind = 0; xml_ind < msj.length(); xml_ind++) {
            a = "" + msj.charAt(xml_ind);
            codeBytes += mapFinally.get(a);
        }
        return codeBytes;
    }

    /**
     * Método para generar compresion del texto
     *
     * @param dataToCompress
     * @return
     */
    public static String compress(String dataToCompress) {

        char[] charArray = new char[1024];
        int[] charfreq = new int[1024];
        int n;
        String UI = dataToCompress;
        on_SplitFrecuency_clicked(UI);
        int indice = 0;
        for (Map.Entry<String, Integer> entry : sorted_map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            charfreq[indice] = value;
            charArray[indice] = key.charAt(0);
            indice++;
        }
        n = map.size();
        // fffffffffffffffffffffffffffffffffffffffffffffaaaaadddddddddddddccccccccccccbbbbbbbbbeeeeeeeeeeeeeeee

        PriorityQueue<HuffmanNode> q = new PriorityQueue<>(n, new MyComparator());

        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();
            hn.c = charArray[i];
            hn.data = charfreq[i];
            hn.left = null;
            hn.right = null;
            q.add(hn);
        }

        HuffmanNode root = null;
        while (q.size() > 1) {
            HuffmanNode x = q.peek();
            q.poll();
            HuffmanNode y = q.peek();
            q.poll();
            HuffmanNode f = new HuffmanNode();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;
            q.add(f);
        }
        printCode(root, "");
        return xmlToBytes(UI);
    }

    /**
     * Método para dividor texto por frecuencia
     *
     * @param text1
     * @return
     */
    public static String on_SplitFrecuency_clicked(String text1) {
        String str = text1;
        String cant = "";
        map = new HashMap<String, Integer>();
        System.err.println(">>> SiZe:" + str.length());

        for (int i = 0; i < str.length(); ++i) {
            String s = "" + (str.charAt(i));
            int cont1 = 0;
            for (int p = 0; p < str.length(); p++) {
                String word = "" + str.charAt(p);
                if (word.equals(s)) {
                    cont1++;
                }
            }
            if (!map.containsKey(s)) {
                map.put(s, cont1);
            }
        }
        System.out.println("unsorted map: " + map);
        ValueComparator bvc = new ValueComparator(map);
        sorted_map = new TreeMap<String, Integer>(bvc);
        sorted_map.putAll(map);
        System.out.println("results: " + sorted_map);
        nada = "Finish..\n";
        return nada;

    }

    /**
     * Clase para comparar valores
     */
    static class ValueComparator implements Comparator<String> {

        Map<String, Integer> base;

        public ValueComparator(Map<String, Integer> base) {
            this.base = base;
        }

        public int compare(String a, String b) {
            if (base.get(a) >= base.get(b)) {
                return -1;
            } else {
                return 1;
            } // returning 0 would merge keys
        }
    }

    /**
     * Obtencion de la linea de 01
     *
     * @return
     */
    public static String getCodeBytes() {
        return codeBytes;
    }

    /**
     * Asignación del mensaje con 01
     *
     * @return
     */
    public static String getCodeMSJ() {
        return codeMSJ;
    }

}

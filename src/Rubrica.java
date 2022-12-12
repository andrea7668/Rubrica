import java.util.HashMap;
public class Rubrica {
    HashMap<String, String> rubrica = new HashMap<>();

    public void add(String nome, String numero) {
        rubrica.put(nome, numero);
    }

    public void remove(String nome) {
        rubrica.remove(nome);
    }   

    public void print(Rubrica r) {
        for (String nome : rubrica.keySet()) {
            System.out.println(nome + " " + rubrica.get(nome));
        }
    }

    public String[] toArray(Rubrica r){
        String[] vettoreNomi = new String[rubrica.size()];
        int i = 0;
        for(String nome : rubrica.keySet()){
            vettoreNomi[i] = nome;
            i++;
        }
        return vettoreNomi;
    }

    public String[] toArrayNum(){
        String[] vettoreNumeri = new String[rubrica.size()];
        int i = 0;
        for(String nome : rubrica.values()){
            vettoreNumeri[i] = nome;
            i++;
        }
        return vettoreNumeri;
    }
    

}

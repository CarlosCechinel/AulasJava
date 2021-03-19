package exercicios.exercicio04;

public class Marcacao {
    private int hora, minuto, segundo;

    Marcacao( int hora, int minuto, int segundo){
        sethora(hora);
        setminuto(minuto);
        setsegundo(segundo);
    }
    public void mostrar(){
        System.out.printf("%02dh:%02dmin:%02dseg", hora, minuto, segundo);

    }
    void sethora(int nHora){
        if ((nHora<=24) && (nHora>=0)) {
            hora=nHora;
        }
    }
    void setminuto(int nMinuto){
        if ((nMinuto<60) && (nMinuto>=0)){
            minuto=nMinuto;
        }}
    void setsegundo(int nSegundo){
        if ((nSegundo<60) && (nSegundo>=0)){
            segundo=nSegundo;
        }
    }
}

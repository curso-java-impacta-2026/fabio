package br.com.impacta.cap10;

public interface Eletrodomestico {

    void ligar();
    void desligar();
    
    public final int VOLTAGEM = 110;
    
    default void acionarTimer(int minutos) {

        /* Aguarda a quantidade de minutos informada. */
        try { Thread.sleep(minutos * 6000); } catch (Exception e) {
        	System.out.println("Deu erro na THREAD!!!");
        }

        /* Executa o método desligar conforme implementado na classe. */
        desligar();
    }
    
//    static void ligarTudo(Eletrodomestico... eletroArray) {
//        for (Eletrodomestico eletro : eletroArray) {
//            eletro.ligar();
//        }
    
}


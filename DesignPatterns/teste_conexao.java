package EzPet.DesignPatterns;

import java.sql.Connection;

public class teste_conexao {
    public static void main(String[] args) {
        try {
            Connection conn = conexao_Banco_Singleton.getInstancia().getConexao();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

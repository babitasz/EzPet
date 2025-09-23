package EzPet.Entidades;

import EzPet.DesignPatterns.configs_Singleton;
import EzPet.Entidades.ConfiguracoesUsuario;

public class RelatorioConfigsSistema {

    private configs_Singleton configs;
    private ConfiguracoesUsuario usuario;

    public RelatorioConfigsSistema(ConfiguracoesUsuario usuario) {
        this.configs = configs_Singleton.getInstancia();
        this.usuario = usuario;
    }

    public void gerarRelatorio() {
        System.out.println("=== Relatório de Configurações do Sistema ===");

        //Configs do Singleton (padrão)
        System.out.println("Versão do Sistema: " + configs.getVersaoSistema());
        System.out.println("Idioma Padrão: " + configs.getIdiomaPadrao());
        System.out.println("Formato de Data: " + configs.getFormatoData());
        System.out.println("Moeda do Sistema: " + configs.getMoedaSistema());
        System.out.println("Taxa de Serviço: " + configs.getTaxaServico());
        System.out.println("Taxa de Cancelamento: " + configs.getTaxaCancelamento());
        System.out.println("Tempo de Sessão: " + configs.getTempoSessao() + " minutos");
        System.out.println("Tentativas de Login Permitidas: " + configs.getTentativasLogin());
        System.out.println("Push Notification Ativado: " + configs.isHabilitarPushNotification());

        // Configs do usuário
        System.out.println("\n=== Configurações Personalizadas do Usuário ===");
        System.out.println("Nome da Empresa: " + usuario.getNomeEmpresa());
        System.out.println("Horário de Funcionamento: " + usuario.getHorarioFuncionamento());
        System.out.println("Tema do Sistema: " + usuario.getTemaSistema());
        System.out.println("Endereço: " + usuario.getEndereco());
        System.out.println("Telefone de Suporte: " + usuario.getTelefoneSuporte());
        System.out.println("============================================");
    }
}

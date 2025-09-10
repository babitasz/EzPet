package EzPet.DesignPatterns;

import java.util.HashMap;
import java.util.Map;

public class configs_Singleton {

    private static configs_Singleton instancia;
    private Map<String, Object> configuracoes;

    private configs_Singleton() {
        configuracoes = new HashMap<>();

        // Financeiro e serviços
        configuracoes.put("taxa_servico", 0.10);
        configuracoes.put("taxa_cancelamento", 0.20);
        configuracoes.put("moeda_sistema", "BRL");
        configuracoes.put("limite_transacoes_diarias", 50);

        // Notificações e comunicação
        configuracoes.put("template_notificacao", "Olá, obrigado por usar o EzPet!");
        configuracoes.put("template_email_boas_vindas", "Bem-vindo ao EzPet!");
        configuracoes.put("template_sms_alerta", "Alerta: verifique seu serviço EzPet!");
        configuracoes.put("habilitar_push_notification", true);

        // Parâmetros do sistema
        configuracoes.put("versao_sistema", "1.0.0");
        configuracoes.put("idioma_padrao", "pt_BR");
        configuracoes.put("formato_data", "dd/MM/yyyy");
        configuracoes.put("max_itens_pagina", 20);

        // Integrações externas
        configuracoes.put("api_google_maps", "CHAVE-API-FICTICIA");
        configuracoes.put("api_gateway_pagamento", "https://gateway.ficticio.com");
        configuracoes.put("webhook_notificacao", "https://webhook.ficticio.com");

        // Segurança
        configuracoes.put("tempo_sessao", 30); // minutos
        configuracoes.put("tentativas_login", 5);
        configuracoes.put("criptografia_senha", "SHA-256");
    }

    // Instância única
    public static configs_Singleton getInstancia() {
        if (instancia == null) {
            instancia = new configs_Singleton();
        }
        return instancia;
    }

    // Getters e Setters - geral
    public void setConfiguracao(String chave, Object valor) {
        configuracoes.put(chave, valor);
    }

    public Object getConfiguracao(String chave) {
        return configuracoes.get(chave);
    }

    // Getters - específicos
    public double getTaxaServico() {
        return (double) configuracoes.get("taxa_servico");
    }

    public double getTaxaCancelamento() {
        return (double) configuracoes.get("taxa_cancelamento");
    }

    public String getMoedaSistema() {
        return (String) configuracoes.get("moeda_sistema");
    }

    public int getLimiteTransacoesDiarias() {
        return (int) configuracoes.get("limite_transacoes_diarias");
    }

    public String getTemplateNotificacao() {
        return (String) configuracoes.get("template_notificacao");
    }

    public String getTemplateEmailBoasVindas() {
        return (String) configuracoes.get("template_email_boas_vindas");
    }

    public String getTemplateSmsAlerta() {
        return (String) configuracoes.get("template_sms_alerta");
    }

    public boolean isHabilitarPushNotification() {
        return (boolean) configuracoes.get("habilitar_push_notification");
    }

    public String getHorarioFuncionamento() {
        return (String) configuracoes.get("horario_funcionamento");
    }

    public String getVersaoSistema() {
        return (String) configuracoes.get("versao_sistema");
    }

    public String getIdiomaPadrao() {
        return (String) configuracoes.get("idioma_padrao");
    }

    public String getFormatoData() {
        return (String) configuracoes.get("formato_data");
    }

    public int getMaxItensPagina() {
        return (int) configuracoes.get("max_itens_pagina");
    }

    public String getApiGoogleMaps() {
        return (String) configuracoes.get("api_google_maps");
    }

    public String getApiGatewayPagamento() {
        return (String) configuracoes.get("api_gateway_pagamento");
    }

    public String getWebhookNotificacao() {
        return (String) configuracoes.get("webhook_notificacao");
    }

    public int getTempoSessao() {
        return (int) configuracoes.get("tempo_sessao");
    }

    public int getTentativasLogin() {
        return (int) configuracoes.get("tentativas_login");
    }

    public String getCriptografiaSenha() {
        return (String) configuracoes.get("criptografia_senha");
    }
}

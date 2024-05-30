package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Eduardo", 123456);
        agendaContatos.adicionarContato("Eduardo", 5665);
        agendaContatos.adicionarContato("Eduardo Rodrigues", 11111111);
        agendaContatos.adicionarContato("Eduardo Oliveira", 567890);
        agendaContatos.adicionarContato("Aline Muniz", 11111111);
        agendaContatos.adicionarContato("Eduardo", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Aline Muniz");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Eduardo Oliveira"));
    }
}

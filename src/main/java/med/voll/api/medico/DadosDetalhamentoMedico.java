package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoMedico(Long id, String nome, String crm, Endereco endereco, String email,
                                      Especialidade telefone, String especialidade) {
    public DadosDetalhamentoMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEndereco(), medico.getTelefone(), medico.getEspecialidade(),medico.getEmail());
    }
}

package med.voll.api.domain.Paciente;

import med.voll.api.domain.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id,String nome, String email, String Cpf, Endereco endereco, String telefone) {
    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(),paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getEndereco(), paciente.getTelefone());
    }
}

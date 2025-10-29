package med.voll.api.Paciente;

public record DadosListagemPacientes(String nome , String email, String cpf,Long id) {

    public DadosListagemPacientes (Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getId());
    }
}

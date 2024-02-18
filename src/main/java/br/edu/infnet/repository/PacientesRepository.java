package br.edu.infnet.repository;

import br.edu.infnet.entities.PacienteEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PacientesRepository {

    public List<PacienteEntity> getListPacientes() {
        List<PacienteEntity> pacientes = new ArrayList<>();
        pacientes.add(new PacienteEntity(1, 3, "Joaquim Ferreira", "joaquimferreira@gmail.com"));
//        pacientes.add(new PacienteEntity(2, 5, "Maria Silva", "maria@gmail.com"));
//        pacientes.add(new PacienteEntity(3, 1, "Pedro Almeida", "pedro@gmail.com"));
//        pacientes.add(new PacienteEntity(4, 1, "Ana Pereira", "ana@gmail.com"));
//        pacientes.add(new PacienteEntity(5, 4, "Lucas Souza", "lucas@gmail.com"));
        return pacientes;
    }

    public PacienteEntity insertNewPaciente(PacienteEntity paciente) {
        List<PacienteEntity> pacientes = getListPacientes();
        if (paciente.getIdPaciente() <= 0 || isIdDuplicated(paciente.getIdPaciente(), pacientes)) {
            System.out.println("ID do paciente inválido ou duplicado. O paciente não será inserido.");
            return null;
        }
        if (!isValidEmail(paciente.getEmail())) {
            System.out.println("O e-mail fornecido não é válido. O paciente não será inserido.");
            return null;
        }
        if (paciente.getConvenioId() <= 0) {
            System.out.println("ID do convênio inválido. O paciente não será inserido.");
            return null;
        }
        if (paciente.getNome().isEmpty()) {
            System.out.println("O nome do paciente não pode estar vazio. O paciente não será inserido.");
            return null;
        }
        paciente.setIdPaciente((pacientes.size() + 1));
        pacientes.add(paciente);
        System.out.println("Paciente criado: " + paciente.getNome());
        System.out.println("Lista Atualizada de pacientes:");
        System.out.println("| ID | Nome | Idade |");
        for (PacienteEntity p : pacientes) {
            System.out.println("| " + p.getIdPaciente() + " | " + p.getNome() + " | " );
        }
        return paciente;
    }
    private boolean isIdDuplicated(int idPaciente, List<PacienteEntity> pacientes) {
        for (PacienteEntity paciente : pacientes) {
            if (paciente.getIdPaciente() == idPaciente) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidEmail(String email) {
        String regex = "^(.+)@(.+)$";
        return email.matches(regex);
    }
    public PacienteEntity getPacienteByCodigo(Integer id) {
        List<PacienteEntity> pacientes = getListPacientes();
        for (PacienteEntity paciente : pacientes) {
            if (Objects.equals(paciente.getIdPaciente(), id)) {
                return paciente;
            }
        }
        System.err.println("Paciente não encontrado");
        return null;
    }
}

package br.edu.infnet.services;

import br.edu.infnet.entities.PacienteEntity;
import br.edu.infnet.repository.PacientesRepository;

public class PacienteService {
    PacientesRepository repository = new PacientesRepository();
    public PacienteEntity getPacienteById(Integer idPaciente) {
        return repository.getPacienteByCodigo(idPaciente);
    }
    public PacienteEntity insertPaciente(PacienteEntity paciente) {
        return repository.insertNewPaciente(paciente);
    }
}

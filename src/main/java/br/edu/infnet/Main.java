package br.edu.infnet;

import br.edu.infnet.entities.PacienteEntity;
import br.edu.infnet.services.PacienteService;

public class Main {
    public static void main(String[] args) {
        PacienteService pacienteService = new PacienteService();
        PacienteEntity paciente3 = new PacienteEntity(3, 3, "Pedro Santos", "");
        PacienteEntity paciente5 = new PacienteEntity(5, 4, "Carlos Oliveira", "carlos.oliveira@hotmail.com");
        PacienteEntity paciente6 = new PacienteEntity(6, 5, "", "roberto@hotmail.com");
        PacienteEntity paciente7 = new PacienteEntity(7, 6, "Laura Pereira", "laura.pereira@gmail.com");

        PacienteEntity paciente4 = new PacienteEntity(3, -1, "Ana Lima", "ana.lima@gmail.com");
        pacienteService.insertPaciente(paciente4);

//        pacienteService.insertPaciente(paciente2);
//        pacienteService.insertPaciente(paciente3);
//        pacienteService.insertPaciente(paciente4);
//        pacienteService.insertPaciente(paciente5);
//        pacienteService.insertPaciente(paciente6);
//        pacienteService.insertPaciente(paciente7);
    }

}
package br.edu.infnet.repository;

import br.edu.infnet.entities.Hospital;
import br.edu.infnet.entities.Medico;

import java.util.ArrayList;
import java.util.List;

public class MedicosRepository {
    public List<Medico> getListMedicos(){
        List<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico(new Hospital(1, "112125588812", "TOTUM", "totumsaude@gmail.com", "34811515"), 1,
                "Marcos Ávila", "marcosav@gmail.com", "62992490411", 3));
        medicos.add(new Medico(new Hospital(2, "112125588813", "TOTUM", "totumsaude@gmail.com", "34811516"), 2,
                "Ana Silva", "anasilva@gmail.com", "62992490412", 3));
        medicos.add(new Medico(new Hospital(3, "112125588814", "TOTUM", "totumsaude@gmail.com", "34811517"), 3,
                "Pedro Santos", "pedrosantos@gmail.com", "62992490413", 5));
        medicos.add(new Medico(new Hospital(4, "112125588815", "TOTUM", "totumsaude@gmail.com", "34811518"), 4,
                "Julia Oliveira", "juliaoliveira@gmail.com", "62992490414", 5));
        medicos.add(new Medico(new Hospital(5, "112125588816", "TOTUM", "totumsaude@gmail.com", "34811519"), 5,
                "Lucas Souza", "lucassouza@gmail.com", "62992490415", 1));
        return medicos;
    }
}

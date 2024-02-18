package br.edu.infnet.repository;

import br.edu.infnet.entities.Convenio;

import java.util.ArrayList;
import java.util.List;

public class ConveniosRepository {

    public List<Convenio> getListConvenios() {
        List<Convenio> listConvenios = new ArrayList<Convenio>();
        listConvenios.add(new Convenio(1, "Fusex", "123456789", "fusex@example.com", "123456789"));
        listConvenios.add(new Convenio(3, "Mediserv", "987654321", "mediserv@gmail", "987654321"));
        listConvenios.add(new Convenio(5, "Sulamerica", "456789123", "sulamerica@gmail", "456789123"));
        return listConvenios;
    }
}

package application.record;

import application.model.Plataforma;

public record PlataformaDTO(long id, String nome) {
    public PlataformaDTO(application.model.Plataforma plataforma) {
        this(plataforma.getId(), plataforma.getNome());
    }

}  
    


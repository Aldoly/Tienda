package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    /**
     * El siguiente método retorna una lista con las categrías
     * que están en la tabla categoría, todas o solo las activas
     */
    public List<Categoria> getCategorias(boolean activos);
}

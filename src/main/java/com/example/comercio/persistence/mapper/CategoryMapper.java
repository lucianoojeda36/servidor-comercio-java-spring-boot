package com.example.comercio.persistence.mapper;

import com.example.comercio.domain.Category;
import com.example.comercio.persistence.entity.Categoria;
import org.mapstruct.*;

@Mapper(componentModel = "Spring")
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria",target = "categoryId"),
            @Mapping(source = "descripcion",target = "category"),
            @Mapping(source = "estado",target = "active"),
    })
    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);


}

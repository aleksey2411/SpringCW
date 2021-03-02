package by.bsuir.project.service.mapper;

import by.bsuir.project.dto.SupplierDto;
import by.bsuir.project.model.Supplier;
import by.bsuir.project.service.interfaces.MapperService;
import org.springframework.stereotype.Service;

@Service
public class SupplierMapper implements MapperService<Supplier, SupplierDto> {

    @Override
    public Supplier toEntity(SupplierDto supplierDto) {
        return Supplier.builder()
                .id(supplierDto.getId())
                .name(supplierDto.getName()).build();
    }

    @Override
    public SupplierDto toDto(Supplier supplier) {
        return SupplierDto.builder()
                .id(supplier.getId())
                .name(supplier.getName()).build();
    }
}

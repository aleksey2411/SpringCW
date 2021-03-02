package by.bsuir.project.controllers;

import by.bsuir.project.dto.SupplierDto;
import by.bsuir.project.model.Supplier;
import by.bsuir.project.service.mapper.SupplierMapper;
import by.bsuir.project.service.impl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierController {
    private SupplierServiceImpl supplierService;
    private SupplierMapper supplierMapper;

    @Autowired
    public SupplierController(SupplierServiceImpl supplierService, SupplierMapper supplierMapper) {
        this.supplierService = supplierService;
        this.supplierMapper = supplierMapper;
    }

    @PostMapping("/suppliers")
    public Supplier addSupplier(@RequestBody final SupplierDto supplierDto) {
        return supplierService.save(supplierMapper.toEntity(supplierDto));
    }

    @GetMapping("/suppliers")
    public List<Supplier> findSuppliers() {
        return supplierService.findAll();
    }
}

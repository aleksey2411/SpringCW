package by.bsuir.project.service.interfaces;

import java.util.List;
import java.util.UUID;

public interface ClientService<Client> {
    Client save(Client client);
    List<Client> findAll();
    Client findById(UUID id);
}

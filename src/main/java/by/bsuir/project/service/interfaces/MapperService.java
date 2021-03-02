package by.bsuir.project.service.interfaces;

public interface MapperService<Entity, Dto> {
    Dto toDto(Entity entity);

    Entity toEntity(Dto dto);
}

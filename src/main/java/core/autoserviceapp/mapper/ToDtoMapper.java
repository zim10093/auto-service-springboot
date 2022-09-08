package core.autoserviceapp.mapper;

public interface ToDtoMapper<D, M> {
    D toDto(M model);
}

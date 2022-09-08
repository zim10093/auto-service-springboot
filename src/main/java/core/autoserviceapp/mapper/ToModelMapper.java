package core.autoserviceapp.mapper;

public interface ToModelMapper<D, M> {
    M toModel(D dto);
}

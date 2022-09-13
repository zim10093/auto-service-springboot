package core.autoserviceapp.service.impl;

import core.autoserviceapp.model.CarOwner;
import core.autoserviceapp.repository.CarOwnerRepository;
import core.autoserviceapp.service.CarOwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarOwnerServiceImpl implements CarOwnerService {
    private final CarOwnerRepository carOwnerRepository;

    @Override
    public CarOwner save(CarOwner carOwner) {
        return carOwnerRepository.save(carOwner);
    }

    @Override
    public CarOwner update(Long id, CarOwner carOwner) {
        carOwner.setId(id);
        return carOwnerRepository.save(carOwner);
    }

    @Override
    public CarOwner getById(Long id) {
        return carOwnerRepository.getReferenceById(id);
    }
}

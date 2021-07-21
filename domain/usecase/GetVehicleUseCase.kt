package seat.code.emobility.platform.domain.usecase

import seat.code.emobility.platform.checkout.domain.txus.domain.repository.LocalVehicleRepository
import seat.code.emobility.platform.checkout.domain.txus.domain.repository.RemoteVehicleRepository
import seat.code.emobility.platform.domain.model.Vehicle
import seat.code.emobility.platform.domain.repository.VehicleRepository

class GetVehicleUseCase {
    private val localRepository: VehicleRepository = LocalVehicleRepository()
    private val remoteRepository: VehicleRepository = RemoteVehicleRepository()

    fun get(id: String) : Vehicle = localRepository.get(id)

    fun save(id: String, brand: String, model: String) : Vehicle = localRepository.save(id, brand, model)
}
package seat.code.emobility.platform.checkout.domain.txus.domain.repository

import seat.code.emobility.platform.domain.model.Vehicle
import seat.code.emobility.platform.domain.repository.VehicleRepository

class RemoteVehicleRepository : VehicleRepository {
    override fun get(id: String): Vehicle = Vehicle()

    override fun save(id: String, brand: String, model: String): Vehicle = Vehicle()

    override fun read(id: String, brand: String, model: String): Vehicle {
        throw NotImplementedError();
    }
}
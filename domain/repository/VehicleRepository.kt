package seat.code.emobility.platform.domain.repository

import seat.code.emobility.platform.domain.model.Vehicle

interface VehicleRepository {
    fun get(id: String) : Vehicle
    fun save(id: String, brand: String, model: String) : Vehicle
    fun read(id: String, brand: String, model: String) : Vehicle
}
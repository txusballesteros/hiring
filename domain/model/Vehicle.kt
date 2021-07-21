package seat.code.emobility.platform.domain.model

class Vehicle(
    val id: String = "",
    val type: String = "",
    val brand: String = "",
    val model: String = ""
) {
    fun equalsTo(vehicle: Vehicle) =
        (this.id == vehicle.id && this.type == vehicle.type  && this.brand == vehicle.brand && this.model == vehicle.model)
}
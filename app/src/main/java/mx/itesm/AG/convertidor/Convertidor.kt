package mx.itesm.AG.convertidor

//Modelo de la aplicación
class Convertidor {

    fun convertirKmMi(km: Double): Double {

        val millas = km / 1.6
        return  millas

    }

    fun convertirKm(mi: Double): Double{
        return  mi * 1.6
    }

}
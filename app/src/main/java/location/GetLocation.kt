package location

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import androidx.core.content.ContextCompat
import java.util.*

class GeoLocationManager(private val context: Context) {

    interface OnCityReceivedListener {
        fun onCityReceived(city: String)
        fun onCityRequestFailed()
    }


    fun requestCity(onCityReceivedListener: OnCityReceivedListener) {
        if (ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.ACCESS_FINE_LOCATION

            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // если у приложения нет разрешения, вызываем колбэк onCityRequestFailed
            onCityReceivedListener.onCityRequestFailed()
            return
        }

        val locationManager = context.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val location: Location? = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER)
        if (location != null) {
            val geocoder = Geocoder(context, Locale.getDefault())
            val addresses = geocoder.getFromLocation(location.latitude, location.longitude, 1)
            val city = addresses?.get(0)?.locality
            if (city != null) {
                onCityReceivedListener.onCityReceived(city)
            } else {
                onCityReceivedListener.onCityRequestFailed()
            }
        } else {
            onCityReceivedListener.onCityRequestFailed()
        }
    }
}
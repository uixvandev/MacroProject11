package com.mobile.macroprojectkelompok11

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentMaps.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentMaps : Fragment(), OnMapReadyCallback {
    // TODO: Rename and change types of parameters
    private lateinit var mapView: MapView
    private lateinit var mMap: GoogleMap


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val rootView= inflater.inflate(R.layout.fragment_maps, container, false)
        mapView = rootView.findViewById(R.id.mapView)
        mapView.onCreate(savedInstanceState) // Inisialisasi peta
        mapView.getMapAsync(this)
        return rootView

    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        val locations = ArrayList<LatLng>()

        // Tambahkan lokasi-lokasi yang berbeda ke dalam array
        locations.add(LatLng(36.907346, 127.649817))
        locations.add(LatLng(37.123456, 128.789012))
        locations.add(LatLng(37.987654, 129.345678))
        // Tambahkan lokasi lainnya sesuai kebutuhan

        // Loop melalui array lokasi dan tambahkan marker untuk setiap lokasi
        for (location in locations) {
            val markerOptions = MarkerOptions()
                .position(location)
                .title("Marker Title")
                .snippet("Marker Snippet")

            mMap.addMarker(markerOptions)
        }

        // Pindahkan kamera ke lokasi terakhir dalam array (atau lokasi tertentu)
        if (locations.isNotEmpty()) {
            val lastLocation = locations.last()
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lastLocation, 8f))
        }
    }


    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }
}
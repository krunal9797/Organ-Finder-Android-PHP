package com.example.orgendonation.Donor;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.orgendonation.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class NearByHospitalsDonor extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_near_by_hospitals_donor);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng janak = new LatLng(21.1130, 73.4033);
        mMap.addMarker(new MarkerOptions().position(janak).title("Blood bank"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(janak));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(janak,15));

        LatLng GANDHI = new LatLng(23.2193, 72.6394);
        mMap.addMarker(new MarkerOptions().position(janak).title("CIVIL"));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(GANDHI,15));

        LatLng apollo = new LatLng(23.1096, 72.6264);
        mMap.addMarker(new MarkerOptions().position(janak).title("APOLLO"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GANDHI));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(apollo,15));

        LatLng ZYDUS = new LatLng(23.0585, 72.5176);
        mMap.addMarker(new MarkerOptions().position(janak).title("ZYDUS"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(janak));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ZYDUS,15));

    }
}
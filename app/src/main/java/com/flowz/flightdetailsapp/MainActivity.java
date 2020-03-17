package com.flowz.flightdetailsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.flowz.flightdetailsapp.models.Arrival;
import com.flowz.flightdetailsapp.models.PojoClass;
import com.flowz.flightdetailsapp.network.GetDataService;
import com.flowz.flightdetailsapp.network.RetrofitClientInstance;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import static com.flowz.flightdetailsapp.util.Constant.MAPVIEW_BUNDLE_KEY;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

   // private static final String TAG = "UserListActivity";

    //widgets
    //private RecyclerView mUserListRecyclerView;
    private MapView mMapView;
    private EditText city;
    private Button getFlights;
    private TextView showResponse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMapView = findViewById(R.id.user_list_map);

        init();


        Bundle mapViewBundle = null;
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY);
        }

        mMapView.onCreate(mapViewBundle);

        mMapView.getMapAsync(this);

    }

    private void init() {
        city = findViewById(R.id.entered_city);
        city.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);

        getFlights = findViewById(R.id.get_flight_schedule);
        showResponse = findViewById(R.id.display_flight_schedule);

        getFlights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchFlightScedule();

                Toast.makeText(MainActivity.this, "Network call made", Toast.LENGTH_SHORT).show();

                Log.d("CallMade", "The GET call has been made");
            }
        });

    }

    private void fetchFlightScedule() {
        Retrofit retrofit = RetrofitClientInstance.getRetrofitInstance();
        GetDataService getDataService = retrofit.create(GetDataService.class);
        Call call = getDataService.getFlightsByRoute(city.getText().toString(), "JFK");

        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {

                if (response.body() != null) {

                   Arrival arrival = (Arrival) response.body();


                   showResponse.setText(arrival.getTerminal().getName()
                           +"\n"+
                           arrival.getTerminal()+"\n"+
                           arrival.getScheduledTimeLocal()+"\n"+
                           arrival.getTimeStatus()
                   );

                    //showResponse.setText(((Arrival) response.body()).getAirportCode());

                    Log.d("TextShown", "The text has been gotten");

                    Toast.makeText(MainActivity.this, "text gotten", Toast.LENGTH_SHORT).show();

//
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {

                Toast.makeText(MainActivity.this, "This GET call failed, edit the code and try again", Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Bundle mapViewBundle = outState.getBundle(MAPVIEW_BUNDLE_KEY);
        if (mapViewBundle == null) {
            mapViewBundle = new Bundle();
            outState.putBundle(MAPVIEW_BUNDLE_KEY, mapViewBundle);
        }

        mMapView.onSaveInstanceState(mapViewBundle);
    }


    @Override
    public void onMapReady(GoogleMap map) {

        LatLng FRAairport = new LatLng(50.0379, 8.5622);
        LatLng JFKairport = new LatLng(40.6435529, -73.78211390000001);



        map.addMarker(new MarkerOptions().position((FRAairport)).title("FRAairport"));
        map.moveCamera(CameraUpdateFactory.newLatLng(FRAairport));
        map.addPolyline(new PolylineOptions()
        .clickable(true)
        .add(FRAairport)
        .add(JFKairport)
        .width(8f)
        .color(getResources().getColor(R.color.colorAccent))
        );

        map.addCircle(new CircleOptions()
        .center(JFKairport)
        .radius(50000.0)
        .strokeWidth(3f)
        .strokeColor(getResources().getColor(R.color.colorAccent))
        .fillColor(getResources().getColor(R.color.colorAccent1)));


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED
                && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        map.setMyLocationEnabled(true);

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mMapView.onLowMemory();
    }


    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onStart() {
        super.onStart();
        mMapView.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
        mMapView.onStop();
    }


    @Override
    public void onPause() {
        mMapView.onPause();
        super.onPause();
    }

    @Override
    public void onDestroy() {
        mMapView.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}

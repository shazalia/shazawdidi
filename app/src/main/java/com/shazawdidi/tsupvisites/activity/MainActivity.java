package com.shazawdidi.tsupvisites.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.shazawdidi.tsupvisites.APIs.ApiClient;
import com.shazawdidi.tsupvisites.APIs.ApiEndpoints;
import com.shazawdidi.tsupvisites.Adapter.VisitesAdapter;
import com.shazawdidi.tsupvisites.R;
import com.shazawdidi.tsupvisites.model.Visites;
import com.shazawdidi.tsupvisites.model.VisitesResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);


        final RecyclerView recyclerView = findViewById(R.id.visites_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiEndpoints apiService =
                ApiClient.getClient().create(ApiEndpoints.class);

        Call<VisitesResponse> call = apiService.getVisites();
        call.enqueue(new Callback<VisitesResponse>() {
            @Override
            public void onResponse(@NonNull Call<VisitesResponse> call, @NonNull Response<VisitesResponse> response) {
                int statusCode = response.code();
                List<Visites> movies = response.body().getResults();
                recyclerView.setAdapter(new VisitesAdapter(movies, R.layout.list_item_visites, getApplicationContext()));
            }

            @Override
            public void onFailure(@NonNull Call<VisitesResponse> call, @NonNull Throwable t) {
                Log.e(TAG, "null" );
            }
        });
    }
}
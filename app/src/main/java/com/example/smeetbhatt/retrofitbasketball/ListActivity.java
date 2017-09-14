package com.example.smeetbhatt.retrofitbasketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager manager;
    private List<Basketball> basketball;
    private RecyclerAdapter adapter;
    private ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);

        if(getIntent().getExtras() != null){
            String type = getIntent().getExtras().getString("type");
            fetchInformation(type);
        }

    }

    public void fetchInformation(String type){
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);
        Call<List<Basketball>> call = apiInterface.getTeamInfo(type);

        call.enqueue(new Callback<List<Basketball>>() {
            @Override
            public void onResponse(Call<List<Basketball>> call, Response<List<Basketball>> response) {
                basketball = response.body();
                adapter = new RecyclerAdapter(basketball,ListActivity.this);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Basketball>> call, Throwable t) {

            }
        });
    }
}

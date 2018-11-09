package com.tungthanh1497.tungtt_se04896_test3_weezy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.tungthanh1497.tungtt_se04896_test3_weezy.model.WeatherModel;
import com.tungthanh1497.tungtt_se04896_test3_weezy.network.GetWeatherService;
import com.tungthanh1497.tungtt_se04896_test3_weezy.network.RetrofitFactory;
import com.tungthanh1497.tungtt_se04896_test3_weezy.network.models.GetWeatherResponseModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    WeatherModel weatherModel;
    ImageView ivIcon;
    TextView tvWeatherMain;
    TextView tvCityMain;
    TextView tvTemp;
    TextView tvHumidity;
    TextView tvWind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        loadData();
    }

    private void setupUI() {
        ivIcon = findViewById(R.id.iv_icon);
        tvWeatherMain = findViewById(R.id.tv_weather_main);
        tvCityMain = findViewById(R.id.tv_city_name);
        tvTemp = findViewById(R.id.tv_temp);
        tvHumidity = findViewById(R.id.tv_humidity);
        tvWind = findViewById(R.id.tv_wind);
        if (weatherModel != null) {
            Picasso.with(getBaseContext()).load(weatherModel.getIcon()).into(ivIcon);
            tvWeatherMain.setText(weatherModel.getWeatherName());
            tvCityMain.setText(weatherModel.getCityName());
            tvTemp.setText((weatherModel.getTemp()- 273.15)+"℃");
            tvHumidity.setText(weatherModel.getHumidity()+"%");
            tvWind.setText(weatherModel.getSpeed()+"km/h");
        }
    }

    private void loadData() {
        final GetWeatherService getWeatherService = RetrofitFactory.getInstance().create(GetWeatherService.class);
        getWeatherService.getWeather().enqueue(new Callback<GetWeatherResponseModel>() {
            @Override
            public void onResponse(Call<GetWeatherResponseModel> call, Response<GetWeatherResponseModel> response) {

                weatherModel = new WeatherModel();
                GetWeatherResponseModel getWeatherResponseModel = response.body();
                weatherModel.setWeatherName(getWeatherResponseModel.getWeather().get(0).getMain());
                weatherModel.setTemp(getWeatherResponseModel.getMain().getTemp());
                weatherModel.setHumidity(getWeatherResponseModel.getMain().getHumidity());
                weatherModel.setSpeed(getWeatherResponseModel.getWind().getSpeed());
                weatherModel.setCityName(getWeatherResponseModel.getName());
                weatherModel.setIcon("http://openweathermap.org/img/w/" + getWeatherResponseModel.getWeather().get(0).getIcon() + ".png");

                setupUI();
            }

            @Override
            public void onFailure(Call<GetWeatherResponseModel> call, Throwable t) {
                Toast.makeText(getBaseContext(), "We need internet for this app", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

package com.example.notasenfermeria;
import android.content.Context;
import android.content.res.AssetManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.res.AssetManager;
import android.util.Log;

import com.example.notasenfermeria.models.Menu;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
public class Data {

    private Context context;
    public Data(Context context){
        this.context = context;
    }

    public List<Menu> loadMenusFromJson(){
        List<Menu> data = new ArrayList<>();
        try {
            String jsonFileName = "data.json";
            JSONObject jsonObject = loadJsonFromAssets(jsonFileName);

            if(jsonObject != null){
                JSONArray dataArray = jsonObject.getJSONArray("menu");

                for (int i = 0; i < dataArray.length(); i++) {

                    JSONObject platoObject = dataArray.getJSONObject(i);

                    String name = platoObject.getString("name");
                    JSONArray optionsArray = platoObject.getJSONArray("options");
                    List<String> options = new ArrayList<>();

                    for (int j = 0; j < optionsArray.length(); j++) {
                        String option = optionsArray.getString(j);
                        options.add(option);
                    }

                    Menu menu = new Menu(name, options);
                    data.add(menu);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return data;
    }

    private JSONObject loadJsonFromAssets(String fileName){
        try{
            AssetManager assetManager = context.getAssets();
            InputStream inputStream = assetManager.open(fileName);

            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();

            String jsonString = new String(buffer, StandardCharsets.UTF_8);
            return new JSONObject(jsonString);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}

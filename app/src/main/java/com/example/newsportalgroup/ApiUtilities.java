package com.example.newsportalgroup;

public class ApiUtilities {
    private static Retrofit retrofit=null;

    public static getApiInterface(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit.create(ApiInterface.class);
    }
}

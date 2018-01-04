package com.happytrees.retrofitsimplifiedcoding;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://simplifiedcoding.net/demos/";
    //BASE_URL + "marvel" -->  https://simplifiedcoding.net/demos/marvel/ is url we using in this example to parse JSON from
    @GET("marvel")   //"get" is http method ,which  requests data from a specified resource.there is also "post" use it when you deal with sensitive data(like passwords)
    //  @something --> called annotation
    Call<List<Hero>> getHeroes();
   // So we defined the Call type as a List and the List type as Hero."Call" is method that sends a request to a webserver and returns a response.
}

/*
As you can see we have a very simple interface above.
Inside the interface first we have a BASE_URL.
 It contains the ROOT URL of our API. For any project we make an API like myproject/api/v1/apiname.
 Retrofit divides it in two parts the first part is the base URL and then the api name.
  So in our example marvel is the api name and before it we have the BASE URL.
 */

/*
After the base URL we have an annotation @GET(“marvel”).
It means that we are defining an http GET request.
 And the String passed inside the get is the api name.
 So for this GET it will make the complete URL joining the BASE_URL and the api name.
 */
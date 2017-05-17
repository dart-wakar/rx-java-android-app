package com.wakarkhan.listusers.network;

/**
 * Created by wakar on 16/5/17.
 */

import com.wakarkhan.listusers.model.User;
import java.util.List;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;

public interface RequestInterface {

    @GET("users/")
    Observable<List<User>> getUsers(@Header("Authorization") String token);
}

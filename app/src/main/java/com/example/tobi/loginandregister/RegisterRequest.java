package com.example.tobi.loginandregister;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by Tobi on 06/02/2017.
 */

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "http://31.170.165.145/public_html/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, String psw, String mail, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", username);
        params.put("mail", mail);
        params.put("psw", psw);

    }

    @Override
    public Map<String, String> getParams(){
        return params;
    }
}

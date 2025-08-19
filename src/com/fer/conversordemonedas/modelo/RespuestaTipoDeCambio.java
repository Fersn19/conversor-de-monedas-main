package com.fer.conversordemonedas.modelo;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record RespuestaTipoDeCambio(String result,
                                    @SerializedName("error-type") String errorType,
                                    double conversion_rate) {

}

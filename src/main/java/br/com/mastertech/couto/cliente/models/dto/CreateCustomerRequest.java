package br.com.mastertech.couto.cliente.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CreateCustomerRequest {

    @NotNull
    @NotEmpty
    @JsonProperty("nome")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

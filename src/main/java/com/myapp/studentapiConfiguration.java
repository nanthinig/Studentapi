package com.myapp;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;


public class studentapiConfiguration extends Configuration {


    @NotEmpty
    private String defaultText3;
    @NotEmpty
    private String message;
    @NotEmpty
    private  String defaultText1;
    @NotEmpty
    private String defaultText2;

    public studentapiConfiguration() {
    }

    @JsonProperty
    public String getMessage() {
        return message;
    }

    @JsonProperty
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty
    public String getDefaultText1() {
        return defaultText1;
    }

    @JsonProperty
    public void setDefaultText1(String defaultText1) {
        this.defaultText1 = defaultText1;
    }

    @JsonProperty
    public String getDefaultText2() {
        return defaultText2;
    }

    @JsonProperty
    public void setDefaultText2(String defaultText2) {
        this.defaultText2 = defaultText2;
    }

    @JsonProperty
    public String getDefaultText3() {
        return defaultText3;
    }

    @JsonProperty
    public void setdefaultText3(String defaultText3) {
        this.defaultText3 = defaultText3;
    }
    // TODO: implement service configuration
}

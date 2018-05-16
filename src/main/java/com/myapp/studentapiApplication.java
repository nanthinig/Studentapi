package com.myapp;

import com.myapp.resources.studentresource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class studentapiApplication extends Application<studentapiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new studentapiApplication().run(args);
    }

    @Override
    public String getName() {
        return "studentapi";
    }

    @Override
    public void initialize(final Bootstrap<studentapiConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final studentapiConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application

    final studentresource resource = new studentresource(configuration.getMessage(),configuration.getDefaultText1(), configuration.getDefaultText2(),configuration.getDefaultText3());
    environment.jersey().register(resource);


    }

}

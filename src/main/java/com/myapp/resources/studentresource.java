package com.myapp.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.myapp.api.student;
import com.myapp.studentapiConfiguration;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
@Path("/student-details")
@Produces(MediaType.APPLICATION_JSON)
public class studentresource {

        private final String message;
        private final String defaultText1;
        private final String defaultText2;
        private final String defaultText3;
        public studentresource(String message, String defaultText1, String defaultText2, String defaultText3) {
            this.message=message;
            this.defaultText1 = defaultText1;
            this.defaultText2 = defaultText2;
            this.defaultText3 = defaultText3;
        }

        @GET
        //@Path("/stu")
        @Timed
        public student sayHello(@QueryParam("param1") Optional<String> param1,
                                @QueryParam("param2") Optional<String> param2,
                                @QueryParam("param3") Optional<String> param3)
        {
            final String value = String.format(message,param1.or(defaultText1), param2.or(defaultText2), param3.or(defaultText3));
            return new student(value);
        }

   // @Path("/consumesboth")
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void getBothRequest(studentapiConfiguration s)
    {
        System.out.println("#########Student details@@@@@@@@@");
        System.out.println("Student name:" + s.getDefaultText1());
        System.out.println("Student id:" + s.getDefaultText2());
        System.out.println("Student interest:" + s.getDefaultText3());
    }
}


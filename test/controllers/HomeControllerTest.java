package controllers;

import org.junit.Test;

import Models.UserResultHelper;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.mvc.Result;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

public class HomeControllerTest extends WithApplication {

    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

   @Test
   public void testIndex() {
       Http.RequestBuilder request = new Http.RequestBuilder()
               .method(GET)
               .uri("/");

       Result result = route(app, request);
       assertEquals(OK, result.status());
   }
    @Test
    public void testUser1() {
        Http.RequestBuilder request = new Http.RequestBuilder()
                .method(GET)
                .uri("/users/ujjawala397");

        Result result = route(app, request);
        assertEquals(404, result.status());
    }
  


   @Test
   public void testUser2() {
       Http.RequestBuilder request = new Http.RequestBuilder()
               .method(GET)
               .uri("/users");

       Result result = route(app, request);
       assertEquals(404, result.status());
   }


   @Test
   public void testUser3() {
       Http.RequestBuilder request = new Http.RequestBuilder()
               .method(GET)
               .uri("/users/ujjawala397/repos");

       Result result = route(app, request);
       assertEquals(404, result.status());
   }
   @Test
   public void testUser4() {
       Http.RequestBuilder request = new Http.RequestBuilder()
               .method(GET)
               .uri("/user/ujjawala397");

       Result result = route(app, request);
       assertEquals(200, result.status());
   }
}

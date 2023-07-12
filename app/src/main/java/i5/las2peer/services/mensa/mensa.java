package i5.las2peer.services.mensa;


import java.net.HttpURLConnection;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import i5.las2peer.api.Context;
import i5.las2peer.api.ManualDeployment;
import i5.las2peer.api.ServiceException;
import i5.las2peer.api.logging.MonitoringEvent;
import i5.las2peer.restMapper.RESTService;
import i5.las2peer.restMapper.annotations.ServicePath;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;
import org.json.simple.*;

import java.util.HashMap;
import java.util.Map;
 

/**
 *
 * 336
 *
 * This microservice was generated by the CAE (Community Application Editor). If you edit it, please
 * make sure to keep the general structure of the file and only add the body of the methods provided
 * in this main file. Private methods are also allowed, but any "deeper" functionality should be
 * outsourced to (imported) classes.
 *
 */
@ServicePath("mensa")
@ManualDeployment
public class mensa extends RESTService {





  public mensa() {
	super();
    // read and set properties values
    setFieldValues();
    
  }

  @Override
  public void initResources() {
	getResourceConfig().register(RootResource.class);
  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // REST methods
  // //////////////////////////////////////////////////////////////////////////////////////

  @Api
  @SwaggerDefinition(
      info = @Info(title = "336", version = "0.0.0",
          description = "",
          termsOfService = "",
          contact = @Contact(name = "", email = "CAEAddress@gmail.com") ,
          license = @License(name = "BSD",
              url = "https://github.com/GHProjectsTest/microservice-336/blob/master/LICENSE.txt") ) )
  @Path("/")
  public static class RootResource {

    private final mensa service = (mensa) Context.getCurrent().getService();

      /**
   * 
   * postDishRating
   *
   * 
   * @param id  a String
   * @param body  a JSONObject

   * 
   * @return Response 
   * 
   */
  @POST
  @Path("/dishes/{id}/rating")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_BAD_REQUEST, message = "bad_request"),
       @ApiResponse(code = HttpURLConnection.HTTP_CREATED, message = "created_rating"),
       @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "not_found")
  })
  @ApiOperation(value = "postDishRating", notes = " ")
  public Response postDishRating(@PathParam("id") String id, String body) {
   classes.Dish Rating payloadbodyObject = new classes().new Dish Rating();
   try { 
       payloadbodyObject.fromJSON(body);
   } catch (Exception e) { 
       e.printStackTrace();
       JSONObject result = new JSONObject();
       return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity("Cannot convert json to object").build();
   }



     
    // service method invocations

     




    // bad_request
    boolean bad_request_condition = true;
    if(bad_request_condition) {
      JSONObject bad_request = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_BAD_REQUEST).entity(bad_request.toJSONString()).build();
    }
    // created_rating
    boolean created_rating_condition = true;
    if(created_rating_condition) {
      JSONObject created_rating = new classes().new Dish Rating().toJSON();

      

      return Response.status(HttpURLConnection.HTTP_CREATED).entity(created_rating.toJSONString()).build();
    }
    // not_found
    boolean not_found_condition = true;
    if(not_found_condition) {
      JSONObject not_found = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_NOT_FOUND).entity(not_found.toJSONString()).build();
    }
    return null;
  }

  /**
   * 
   * getDishRatings
   *
   * 
   * @param id  a String
   * 
   * @return Response 
   * 
   */
  @GET
  @Path("/dishes/{id}/ratings")
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.TEXT_PLAIN)
  @ApiResponses(value = {
       @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "ratings"),
       @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "dish_not_found")
  })
  @ApiOperation(value = "getDishRatings", notes = " ")
  public Response getDishRatings(@PathParam("id") String id) {




     
    // service method invocations

     




    // ratings
    boolean ratings_condition = true;
    if(ratings_condition) {
      JSONObject ratings = new classes().new Dish Rating().toJSON();

      

      return Response.status(HttpURLConnection.HTTP_OK).entity(ratings.toJSONString()).build();
    }
    // dish_not_found
    boolean dish_not_found_condition = true;
    if(dish_not_found_condition) {
      JSONObject dish_not_found = new JSONObject();

      

      return Response.status(HttpURLConnection.HTTP_NOT_FOUND).entity(dish_not_found.toJSONString()).build();
    }
    return null;
  }



  }

  // //////////////////////////////////////////////////////////////////////////////////////
  // Service methods (for inter service calls)
  // //////////////////////////////////////////////////////////////////////////////////////
  
  

  // //////////////////////////////////////////////////////////////////////////////////////
  // Custom monitoring message descriptions (can be called via RMI)
  // //////////////////////////////////////////////////////////////////////////////////////

  public Map<String, String> getCustomMessageDescriptions() {
    Map<String, String> descriptions = new HashMap<>();
    
    return descriptions;
  }

}

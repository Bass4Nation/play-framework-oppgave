package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import services.Counter;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.FileNotFoundException;


/**
 * This controller demonstrates how to use dependency injection to
 * bind a component into a controller class. The class contains an
 * action that shows an incrementing count to users. The {@link Counter}
 * object is injected by the Guice dependency injection system.
 */
@Singleton
public class CountController extends Controller {

    private final Counter counter;

    @Inject
    public CountController(Counter counter) {
       this.counter = counter;
    }

    /**
     * An action that responds with the {@link Counter}'s current
     * count. The result is plain text. This action is mapped to
     * <code>GET</code> requests with a path of <code>/count</code>
     * requests by an entry in the <code>routes</code> config file.
     */
    public Result count() throws FileNotFoundException {
//        Tenkte kanskje det gikk å koble til en database her. Tenkte egentlig lese/skrive til en database herifra.
//        Men fant ikke ut på kort tid hvordan det er mulig å importe diverse normale dependecies som eks json.simple eller
//        andre json tools, kan hende det er bare jeg som missforstod siden til Play Framework, siden så ut som alt av
//        imports der er for scala.

//        https://www.playframework.com/documentation/2.8.x/AccessingAnSQLDatabase
//        https://www.playframework.com/documentation/2.8.x/ScalaJson


        return ok(Integer.toString(counter.nextCount())
        );
    }


}

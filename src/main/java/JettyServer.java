import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class JettyServer {
    public static void main(String[] args) throws Exception{
        Server server = new Server(7887);
        ServletContextHandler handler = new ServletContextHandler();
        server.setHandler(handler);
        handler.addServlet(GreatServlet.class, "/greet.html");
        handler.addServlet(MyServlet.class, "/");
        server.start();
    }
}

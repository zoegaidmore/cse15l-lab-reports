import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler { 

  //requests look like /add-message?s=<string>&user=<string>

  public String handleRequest(URI url) {
    if (url.getPath().equals("/add-message")) {
      String[] parameters = url.getQuery().split("&");
      
      if(parameters.length == 2) {
        String[] parameter1 = parameters[0].split("=");
        String[] parameter2 = parameters[1].split("=");
          if(parameter1[0].equals("s") && parameter2[0].equals("user")) {
            return String.format("%1$s: %2$s", parameter1[1], parameter2[1]);
          }
      }
    }
    return "404 Not Found!";
}

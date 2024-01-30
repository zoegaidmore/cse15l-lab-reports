import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler { 

  //requests look like /add-message?s=<string>&user=<string>

  public String handleRequest(URI url) {
    if (url.getPath().equals("/add-message")) {
      String[] parameters = url.getQuery().split("=");
      if(parameters.length == 2 && parameters[0].equals("s") && parameters[1].equals("user")) {
        return String.format("%s: %s", parameters[1], parameters[0]);
      }
    }
    else {
    }
}

package demo

import scala.xml.Node
import org.scalatra._
import scalate.ScalateSupport

class View extends ScalatraServlet with ScalateSupport {

  get("/") {
    contentType = "text/html"

    ssp("index", "title" -> "Example Scalatra/Maven app")
  }

  notFound {
    <html>
    <body>404</body>
    </html>
  }

}

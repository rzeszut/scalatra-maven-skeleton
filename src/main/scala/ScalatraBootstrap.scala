import org.scalatra.LifeCycle
import javax.servlet.ServletContext

import demo._

class ScalatraBootstrap extends LifeCycle {

  override def init(context: ServletContext) {
    context mount (new View, "/")
  }
}

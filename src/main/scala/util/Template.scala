package util

import org.fusesource.scalate.servlet.ServletRenderContext._

object Template {
  def url(u: String) = request.getContextPath + "/" + u
}

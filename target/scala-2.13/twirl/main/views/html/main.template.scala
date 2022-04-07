
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""


"""),format.raw/*11.1*/("""<!DOCTYPE html>
"""),format.raw/*12.90*/("""
"""),format.raw/*13.1*/("""<html lang="en">
    <head>
        """),format.raw/*15.62*/("""
        """),format.raw/*16.9*/("""<title>"""),_display_(/*16.17*/title),format.raw/*16.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*17.54*/assetsFinder/*17.66*/.path("stylesheets/main.css")),format.raw/*17.95*/("""">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Trirong">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*19.59*/assetsFinder/*19.71*/.path("images/favicon.png")),format.raw/*19.98*/("""">
        <script src=""""),_display_(/*20.23*/assetsFinder/*20.35*/.path("javascripts/hello.js")),format.raw/*20.64*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),format.raw/*24.32*/("""
        """),_display_(/*25.10*/content),format.raw/*25.17*/("""
    """),format.raw/*26.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(assetsFinder)

  def f:((String) => (Html) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (assetsFinder) => apply(title)(content)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: bf9522031cbf936e4e74183863e544846c4ea1d0
                  MATRIX: 1178->260|1339->328|1369->331|1413->436|1441->437|1505->526|1541->535|1576->543|1602->548|1691->610|1712->622|1762->651|1937->799|1958->811|2006->838|2058->863|2079->875|2129->904|2223->1060|2260->1070|2288->1077|2320->1082
                  LINES: 32->7|37->8|40->11|41->12|42->13|44->15|45->16|45->16|45->16|46->17|46->17|46->17|48->19|48->19|48->19|49->20|49->20|49->20|52->24|53->25|53->25|54->26
                  -- GENERATED --
              */
          
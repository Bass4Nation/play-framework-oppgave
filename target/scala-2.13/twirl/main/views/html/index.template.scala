
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a two arguments, a String containing a
* message to display and an AssetsFinder to locate static assets.
*/
  def apply/*5.2*/(message: String, testnum: String)(implicit assetsFinder: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Microlog - Oppgave")/*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""

    """),format.raw/*17.8*/("""

"""),format.raw/*19.53*/("""
    """),_display_(/*20.6*/increase(style = "java")),format.raw/*20.30*/("""

""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(message:String,testnum:String,assetsFinder:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(message,testnum)(assetsFinder)

  def f:((String,String) => (AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (message,testnum) => (assetsFinder) => apply(message,testnum)(assetsFinder)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 7d743b5a6a83cd0f92f848221af6530dfc446b72
                  MATRIX: 1055->134|1220->206|1248->401|1276->403|1311->429|1351->431|1384->560|1414->614|1446->620|1491->644|1524->647
                  LINES: 30->5|35->6|36->11|37->12|37->12|37->12|39->17|41->19|42->20|42->20|44->22
                  -- GENERATED --
              */
          
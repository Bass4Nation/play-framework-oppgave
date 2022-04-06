
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

object increase extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*Lignende parameter / konstruktører Den forventer message, style og testnum for å lages. */
  def apply/*2.2*/(style: String = "java"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.26*/("""


"""),_display_(/*5.2*/defining(play.core.PlayVersion.current)/*5.41*/ { version =>_display_(Seq[Any](format.raw/*5.54*/("""

  """),format.raw/*7.3*/("""<section id="topHeader">
      <h1 class="topTitle"> Oppgave fra microlog</h1>
  </section>
  <section id="task">
      <p> Under skal det være en knapp og en verdi. Verdien skal øke når knappen blir trykket på</p>
      <button class="buttonIncrease" onclick="increaseNumber()">Øk nummeret under</button>
      <p  class="numField" id="numberId"></p>
  </section>

""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(style:String): play.twirl.api.HtmlFormat.Appendable = apply(style)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (style) => apply(style)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/increase.scala.html
                  HASH: 12de58a1c57e03136c5e95e56a961d9a486732e2
                  MATRIX: 998->95|1117->119|1149->126|1196->165|1246->178|1278->184|1684->560
                  LINES: 27->2|32->2|35->5|35->5|35->5|37->7|46->16
                  -- GENERATED --
              */
          
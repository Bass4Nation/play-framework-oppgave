
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

object oppgaven extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*Lignende parameter / konstruktører. */
  def apply/*2.2*/(style: String = "java"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.26*/("""


"""),_display_(/*5.2*/defining(play.core.PlayVersion.current)/*5.41*/ { version =>_display_(Seq[Any](format.raw/*5.54*/("""

  """),format.raw/*7.3*/("""<section id="topHeader">
      <h1 class="topTitle"> Oppgave fra Microlog</h1>
  </section>
  <section id="task">
      <p> Under skal det være en knapp og en verdi. Verdien skal øke når knappen blir trykket på</p>
"""),format.raw/*13.48*/("""
      """),format.raw/*14.7*/("""<button class="buttonIncrease" onclick="increaseNumber()">Øk nummeret under</button>
      <p  class="numField" id="numberId"></p>
  </section>

""")))}),format.raw/*18.2*/("""
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
                  SOURCE: app/views/oppgaven.scala.html
                  HASH: 407a0bebdd05b47557b450245b851f5d378f4442
                  MATRIX: 946->43|1065->67|1097->74|1144->113|1194->126|1226->132|1474->486|1509->494|1689->644
                  LINES: 27->2|32->2|35->5|35->5|35->5|37->7|42->13|43->14|47->18
                  -- GENERATED --
              */
          
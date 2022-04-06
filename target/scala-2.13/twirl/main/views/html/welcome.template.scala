
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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /*Lignende parameter / konstruktører Den forventer message, style og testnum for å lages. */
  def apply/*2.2*/(message: String, style: String = "java", testnum: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/defining(play.core.PlayVersion.current)/*4.41*/ { version =>_display_(Seq[Any](format.raw/*4.54*/("""

    """),format.raw/*6.5*/("""<section id="top">
        <div class="wrapper">
            <h1><a href="https://playframework.com/documentation/"""),_display_(/*8.67*/version),format.raw/*8.74*/("""/Home">"""),_display_(/*8.82*/message),format.raw/*8.89*/("""</a></h1>
        </div>
    </section>

    <div id="content" class="wrapper doc">
        <article>

            <h1>Button Increase Task</h1>

            <p>
               """),_display_(/*18.17*/testnum),format.raw/*18.24*/("""
            """),format.raw/*19.13*/("""</p>

            <blockquote>
                <p>
                    You’re using Play """),_display_(/*23.40*/version),format.raw/*23.47*/("""
                """),format.raw/*24.17*/("""</p>
            </blockquote>

            <h2>Why do you see this page?</h2>

            <p>
                The <code>conf/routes</code> file defines a route that tells Play to invoke the <code>HomeController.index</code> action
                whenever a browser requests the <code>/</code> URI using the GET method:
            </p>

            <pre><code># Home page
GET     /               controllers.HomeController.index</code></pre>


            <p>
                Play has invoked the <code>controllers.HomeController.index</code> method:
            </p>

            <pre><code>public Result index() """),format.raw/*42.46*/("""{"""),format.raw/*42.47*/("""
    """),format.raw/*43.5*/("""return ok(
        index.render(
            "Your new application is ready.",
            assetsFinder
        ));
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""</code></pre>

            <p>
                An action method handles the incoming HTTP request, and returns the HTTP result to send back to the web client.
                Here we send a <code>200 OK</code> response, using a template to fill its content.
            </p>

            <p>
                The template is defined in the <code>app/views/index.scala.html</code> file and compiled as a standard Java class.
            </p>

            <pre><code>@(message: String)(implicit assetsFinder: AssetsFinder)

  @main("Welcome to Play") """),format.raw/*61.29*/("""{"""),format.raw/*61.30*/("""

  """),format.raw/*63.3*/("""@welcome(message, style = "Java")

"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/("""</code></pre>

            <p>
                The first line of the template defines the function signature. Here it just takes a single <code>String</code> parameter.
                Then this template calls another function defined in <code>app/views/main.scala.html</code> which displays the HTML layout, and another
                function that displays this welcome message. You can freely add any HTML fragment mixed with Scala code in this file.
            </p>

            <blockquote>
                <p>
                    <strong>Note</strong> that Scala is fully compatible with Java, so if you don’t know Scala don’t panic, a Scala statement is very similar to a Java one.
                </p>
            </blockquote>

            <p>You can read more about <a href="https://www.playframework.com/documentation/"""),_display_(/*79.94*/version),format.raw/*79.101*/("""/ScalaTemplates">Twirl</a>, the template language used by Play, and how Play handles <a href="https://www.playframework.com/documentation/"""),_display_(/*79.240*/version),format.raw/*79.247*/("""/JavaActions">actions</a>.</p>

            <h2>Async Controller</h2>

            Now that you've seen how Play renders a page, take a look at <code>AsyncController.java</code>, which shows how to do asynchronous programming when handling a request.  The code is almost exactly the same as <code>HomeController.java</code>, but instead of returning <code>Result</code>, the action returns <code>CompletionStage&lt;Result&gt;</code> to Play.  When the execution completes, Play can use a thread to render the result without blocking the thread in the mean time.

            <p>
                <a href=""""),_display_(/*86.27*/routes/*86.33*/.AsyncController.message),format.raw/*86.57*/("""">Click here for the AsyncController action!</a>
            </p>

            <p>
                You can read more about <a href="https://www.playframework.com/documentation/"""),_display_(/*90.95*/version),format.raw/*90.102*/("""/JavaAsync">asynchronous actions</a> in the documentation.
            </p>

            <h2>Count Controller</h2>

            <p>
                Both the HomeController and AsyncController are very simple, and typically controllers present the results of the interaction of several services.  As an example, see the <code>CountController</code>, which shows how to inject a component into a controller and use the component when handling requests.  The count controller increments every time you refresh the page, so keep refreshing to see the numbers go up.
            </p>

            <p>
                <a href=""""),_display_(/*100.27*/routes/*100.33*/.CountController.count),format.raw/*100.55*/("""">Click here for the CountController action!</a>
            </p>

            <p>
                You can read more about <a href="https://www.playframework.com/documentation/"""),_display_(/*104.95*/version),format.raw/*104.102*/("""/JavaDependencyInjection">dependency injection</a> in the documentation.
            </p>

            <h2>Need more info on the console?</h2>

            <p>
                For more information on the various commands you can run on Play, i.e. running tests and packaging applications for production, see <a href="https://playframework.com/documentation/"""),_display_(/*110.199*/version),format.raw/*110.206*/("""/PlayConsole">Using the Play console</a>.
            </p>

            <h2>Need to set up an IDE?</h2>

            <p>
                You can start hacking your application right now using any text editor. Any changes will be automatically reloaded at each page refresh,
                including modifications made to Scala source files.
            </p>

            <p>
                If you want to set-up your application in <strong>IntelliJ IDEA</strong> or any other Java IDE, check the
                <a href="https://www.playframework.com/documentation/"""),_display_(/*122.71*/version),format.raw/*122.78*/("""/IDE">Setting up your preferred IDE</a> page.
            </p>

            <h2>Need more documentation?</h2>

            <p>
                Play documentation is available at <a href="https://www.playframework.com/documentation/"""),_display_(/*128.106*/version),format.raw/*128.113*/("""">https://www.playframework.com/documentation</a>.
            </p>

            <p>
                Play comes with lots of example templates showcasing various bits of Play functionality at <a href="https://www.playframework.com/download#examples">https://www.playframework.com/download#examples</a>.
            </p>

            <h2>Need more help?</h2>

            <p>
                Play questions are asked and answered on Stackoverflow using the "playframework" tag: <a href="https://stackoverflow.com/questions/tagged/playframework">https://stackoverflow.com/questions/tagged/playframework</a>
            </p>

            <p>
                The <a href="https://discuss.playframework.com">Discuss Play Forum</a>  is where Play users come to seek help,
                announce projects, and discuss issues and new features.
            </p>

            <p>
                Gitter is a real time chat channel, like IRC. The <a href="https://gitter.im/playframework/playframework">playframework/playframework</a>  channel is used by Play users to discuss the ins and outs of writing great Play applications.
            </p>

        </article>

        <aside>
            <h3>Browse</h3>
            <ul>
                <li><a href="https://playframework.com/documentation/"""),_display_(/*155.71*/version),format.raw/*155.78*/("""">Documentation</a></li>
                <li><a href="https://playframework.com/documentation/"""),_display_(/*156.71*/version),format.raw/*156.78*/("""/api/"""),_display_(/*156.84*/style),format.raw/*156.89*/("""/index.html">Browse the """),_display_(/*156.114*/{style.capitalize}),format.raw/*156.132*/(""" """),format.raw/*156.133*/("""API</a></li>
            </ul>
            <h3>Start here</h3>
            <ul>
                <li><a href="https://playframework.com/documentation/"""),_display_(/*160.71*/version),format.raw/*160.78*/("""/PlayConsole">Using the Play console</a></li>
                <li><a href="https://playframework.com/documentation/"""),_display_(/*161.71*/version),format.raw/*161.78*/("""/IDE">Setting up your preferred IDE</a></li>
                <li><a href="https://playframework.com/download#examples">Example Projects</a>
            </ul>
            <h3>Help here</h3>
            <ul>
                <li><a href="https://stackoverflow.com/questions/tagged/playframework">Stack Overflow</a></li>
                <li><a href="https://discuss.playframework.com">Discuss Play Forum</a> </li>
                <li><a href="https://gitter.im/playframework/playframework">Gitter Channel</a></li>
            </ul>

        </aside>

    </div>
""")))}),format.raw/*174.2*/("""
"""))
      }
    }
  }

  def render(message:String,style:String,testnum:String): play.twirl.api.HtmlFormat.Appendable = apply(message,style,testnum)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (message,style,testnum) => apply(message,style,testnum)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/welcome.scala.html
                  HASH: 85b044e01498d9b150ac914c0fb11b97cfaa8dc6
                  MATRIX: 1011->94|1163->153|1190->155|1237->194|1287->207|1319->213|1460->328|1487->335|1521->343|1548->350|1753->528|1781->535|1822->548|1939->638|1967->645|2012->662|2657->1279|2686->1280|2718->1285|2861->1401|2889->1402|3465->1952|3494->1953|3525->1957|3587->1993|3615->1994|4474->2826|4503->2833|4670->2972|4699->2979|5331->3584|5346->3590|5391->3614|5595->3791|5624->3798|6274->4420|6290->4426|6334->4448|6539->4625|6569->4632|6956->4990|6986->4997|7582->5565|7611->5572|7872->5804|7902->5811|9220->7101|9249->7108|9372->7203|9401->7210|9435->7216|9462->7221|9516->7246|9557->7264|9588->7265|9766->7415|9795->7422|9939->7538|9968->7545|10558->8104
                  LINES: 27->2|32->3|33->4|33->4|33->4|35->6|37->8|37->8|37->8|37->8|47->18|47->18|48->19|52->23|52->23|53->24|71->42|71->42|72->43|77->48|77->48|90->61|90->61|92->63|94->65|94->65|108->79|108->79|108->79|108->79|115->86|115->86|115->86|119->90|119->90|129->100|129->100|129->100|133->104|133->104|139->110|139->110|151->122|151->122|157->128|157->128|184->155|184->155|185->156|185->156|185->156|185->156|185->156|185->156|185->156|189->160|189->160|190->161|190->161|203->174
                  -- GENERATED --
              */
          
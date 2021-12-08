
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

object topic extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,play.mvc.Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(key:String,request: play.mvc.Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""
"""),format.raw/*2.1*/("""<script type='text/javascript' src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
<script type='text/javascript' src='"""),_display_(/*3.38*/routes/*3.44*/.Assets.versioned("javascripts/index.js")),format.raw/*3.85*/("""'></script>  

<section data-ws-url=""""),_display_(/*5.24*/routes/*5.30*/.HomeController.wsTopic.webSocketURL(request)),format.raw/*5.75*/("""" style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
 
      <div class="container" style="display: flex;justify-content: center; ">
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
       <center> <span>Showing results for the topic: <h1 style="display:inline-block;margin-left: 10px;">"""),_display_(/*9.107*/key),format.raw/*9.110*/("""</h1> </span></center>
        <table style="width:800px;
          border-collapse: collapse;
          border: 1px solid #ddd;
          box-shadow: 0 0 20px rgba(0,0,0,0.1);">
            <thead style="background-color: #42a386; padding: 10px; height:50px ;">
              <tr>
                <th style="border: 1px solid rgb(211, 211, 211);">Owner</th>
                <th  style="border: 1px solid rgb(211, 211, 211);">Repository</th>
                <th  style="border: 1px solid rgb(211, 211, 211);">Topics</th>

              </tr>
            </thead>
            <tbody id="resultTableBody" style="background-color: #dee2e1; text-align: center;">
              
                <tr style="height: 50px ">
                <td style="border: 1px solid rgb(104, 207, 164);">obj.ownerName</td>
                <td style="border: 1px solid rgb(104, 207, 164);">obj.repoName</td>
                <td style="border: 1px solid rgb(104, 207, 164);">
             
                   <div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 3px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"> """),_display_(/*29.187*/topic),format.raw/*29.192*/(""" """),format.raw/*29.193*/("""</div> 
              
                </td>
              </tr>
                        
            </tbody> 
          </table>
        </div>
         </div>
        
 
</section>
"""))
      }
    }
  }

  def render(key:String,request:play.mvc.Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(key,request)

  def f:((String,play.mvc.Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (key,request) => apply(key,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/topic.scala.html
                  HASH: fb49821dc7707b4b5f144763479c53e48131d6ba
                  MATRIX: 929->1|1067->44|1095->46|1250->175|1264->181|1325->222|1391->262|1405->268|1470->313|1943->759|1967->762|3168->1935|3195->1940|3225->1941
                  LINES: 27->1|32->1|33->2|34->3|34->3|34->3|36->5|36->5|36->5|40->9|40->9|60->29|60->29|60->29
                  -- GENERATED --
              */
          
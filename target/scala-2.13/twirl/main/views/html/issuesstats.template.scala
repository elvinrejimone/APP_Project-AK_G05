
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

object issuesstats extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[ArrayList[Integer],Integer,ArrayList[String],Map[String, Integer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(details:ArrayList[Integer], s:Integer,keys:ArrayList[String],stats:Map[String,Integer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.90*/("""

"""),format.raw/*3.1*/("""<section style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
  <div class="header" style="padding: 30px;
	  text-align: center;
	  background: #1abc9c;
	  color: white;
	  font-size: 30px;">
    
  		<h3> <b><u>Word Level Statistics 📝</u> </b></h3>

		  <div class="container" style="display: flex;justify-content: center; ">
			<div style="padding: 5px;margin: 20px;background-color: #dee2e1;;border-radius: 5px;">
			  <table style="
				border-collapse: collapse;
				box-shadow: 0 0 20px rgba(0,0,0,0.1);">
				
				  <tbody style="background-color: #dee2e1; text-align: center;">
					
				
					<tr style="height: 50px ">
					  <td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Total Words: </td>
					  <td style="background-color: #dee2e1;width: 200px;"><b>"""),_display_(/*23.64*/details/*23.71*/.get(0)),format.raw/*23.78*/(""" """),format.raw/*23.79*/("""</b></td>

					  <td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Total Words Repeated: </td>
					  <td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*26.61*/details/*26.68*/.get(1)),format.raw/*26.75*/("""</td>

					  <td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Total Character: 📑 </td>
					  <td style="background-color: #dee2e1;width: 200px;"><b style="">"""),_display_(/*29.73*/details/*29.80*/.get(2)),format.raw/*29.87*/("""</b></td>
					
					</tr>

					<tr style="height: 50px ">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Unique words: </td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*35.60*/details/*35.67*/.get(3)),format.raw/*35.74*/("""</td>
  
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Maximum Word's Frequency :</td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*38.61*/details/*38.68*/.get(4)),format.raw/*38.75*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Minimum Word's Frequency :   </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*41.61*/details/*41.68*/.get(5)),format.raw/*41.75*/("""</td>
					  </tr> 

					 
				  </tbody> 
				</table>
	

			</div>

		</div>
     <div class="container" style="display: flex;justify-content: center; ">
      <div style="padding: 0px 40px 40px 40px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">
        <table style="width:800px;
          border-collapse: collapse;
          border: 1px solid #ddd;
          box-shadow: 0 0 20px rgba(0,0,0,0.1);">
            <thead style="background-color: #42a386; padding: 10px; height:50px ;">
			<tr>
				<th style="border: 1px solid rgb(211, 211, 211);">Word</th>
				<th  style="border: 1px solid rgb(211, 211, 211);">Count</th>	
				</tr>
			</thead>	
			  <tbody style="background-color: #dee2e1; text-align: center;">
				"""),_display_(/*65.6*/for(key<-keys) yield /*65.20*/{_display_(Seq[Any](format.raw/*65.21*/("""
					"""),format.raw/*66.6*/("""<tr style="height: 50px ">									
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*67.99*/key),format.raw/*67.102*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*69.99*/stats/*69.104*/.get(key)),format.raw/*69.113*/("""</td>						
					</tr>				
				""")))}),format.raw/*71.6*/("""			  
			  """),format.raw/*72.6*/("""</tbody> 
			</table>
			</div>
		</div>
	  <button style="display: none;
	  position: fixed;
	  bottom: 20px;
	  right: 30px;
	  z-index: 99;
	  font-size: 15px;
	  border: none;
	  outline: none;
	  background-color: rgb(15, 43, 80);
	  color: rgb(247, 247, 247);
	  cursor: pointer;
	  padding: 10px;" onclick="topFunction()" id="myBtn" title="Go to top"> ⬆ Back to Display</button>

	<button style="display: block;
	position: fixed;
	top: 20px;
	left: 30px;
	z-index: 99;
	font-size: 15px;
	border: none;
	outline: none;
	background-color: rgb(218, 218, 218);
	color: rgb(7, 75, 18) ;
	cursor: pointer;
	padding: 5px;" onclick="window.location.href='/'" title="Go Back"> ⬅ Back to Home pg </button>

  
</section>
<script>
	//Get the button
	var mybutton = document.getElementById("myBtn");
	
	// When the user scrolls down 20px from the top of the document, show the button
	window.onscroll = function() """),format.raw/*109.31*/("""{"""),format.raw/*109.32*/("""scrollFunction()"""),format.raw/*109.48*/("""}"""),format.raw/*109.49*/(""";
	
	function scrollFunction() """),format.raw/*111.28*/("""{"""),format.raw/*111.29*/("""
	  """),format.raw/*112.4*/("""if (document.body.scrollTop > 150 || document.documentElement.scrollTop > 150) """),format.raw/*112.83*/("""{"""),format.raw/*112.84*/("""
		"""),format.raw/*113.3*/("""mybutton.style.display = "block";
	  """),format.raw/*114.4*/("""}"""),format.raw/*114.5*/(""" """),format.raw/*114.6*/("""else """),format.raw/*114.11*/("""{"""),format.raw/*114.12*/("""
		"""),format.raw/*115.3*/("""mybutton.style.display = "none";
	  """),format.raw/*116.4*/("""}"""),format.raw/*116.5*/("""
	"""),format.raw/*117.2*/("""}"""),format.raw/*117.3*/("""
	
	"""),format.raw/*119.2*/("""// When the user clicks on the button, scroll to the top of the document
	function topFunction() """),format.raw/*120.25*/("""{"""),format.raw/*120.26*/("""
	  """),format.raw/*121.4*/("""document.body.scrollTop = 0;
	  document.documentElement.scrollTop = 0;
	"""),format.raw/*123.2*/("""}"""),format.raw/*123.3*/("""
	"""),format.raw/*124.2*/("""</script>"""))
      }
    }
  }

  def render(details:ArrayList[Integer],s:Integer,keys:ArrayList[String],stats:Map[String, Integer]): play.twirl.api.HtmlFormat.Appendable = apply(details,s,keys,stats)

  def f:((ArrayList[Integer],Integer,ArrayList[String],Map[String, Integer]) => play.twirl.api.HtmlFormat.Appendable) = (details,s,keys,stats) => apply(details,s,keys,stats)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/issuesstats.scala.html
                  HASH: 387797e2b9618897b648aa5ca90b9822a7d1f777
                  MATRIX: 972->1|1155->89|1185->93|2110->991|2126->998|2154->1005|2183->1006|2395->1191|2411->1198|2439->1205|2657->1396|2673->1403|2701->1410|2955->1637|2971->1644|2999->1651|3212->1837|3228->1844|3256->1851|3470->2038|3486->2045|3514->2052|4314->2826|4344->2840|4383->2841|4417->2848|4579->2983|4604->2986|4738->3093|4753->3098|4784->3107|4848->3141|4887->3153|5862->4099|5892->4100|5937->4116|5967->4117|6029->4150|6059->4151|6092->4156|6200->4235|6230->4236|6262->4240|6328->4278|6357->4279|6386->4280|6420->4285|6450->4286|6482->4290|6547->4327|6576->4328|6607->4331|6636->4332|6670->4338|6797->4436|6827->4437|6860->4442|6963->4517|6992->4518|7023->4521
                  LINES: 27->1|32->1|34->3|54->23|54->23|54->23|54->23|57->26|57->26|57->26|60->29|60->29|60->29|66->35|66->35|66->35|69->38|69->38|69->38|72->41|72->41|72->41|96->65|96->65|96->65|97->66|98->67|98->67|100->69|100->69|100->69|102->71|103->72|140->109|140->109|140->109|140->109|142->111|142->111|143->112|143->112|143->112|144->113|145->114|145->114|145->114|145->114|145->114|146->115|147->116|147->116|148->117|148->117|150->119|151->120|151->120|152->121|154->123|154->123|155->124
                  -- GENERATED --
              */
          
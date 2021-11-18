
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

object repodetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Models.RepositoryProfile,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Details: Models.RepositoryProfile):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*4.1*/("""<section style=" margin: 0;background: linear-gradient(45deg, #7ab1af, #aea7ec);font-family: sans-serif;font-weight: 100; padding-bottom: 40px">
  <div class="header" style="padding: 30px;
	  text-align: center;
	  background: #1abc9c;
	  color: white;
	  font-size: 30px;">
    
  		<h2> Repository Details : <b>"""),_display_(/*11.35*/Details/*11.42*/.repoName),format.raw/*11.51*/("""</b></h2>

		  <div class="container" style="display: flex;justify-content: center; ">
			<div style="padding: 5px;margin: 20px;background-color: #dee2e1;;border-radius: 5px;">
			  <table style="
				border-collapse: collapse;
				box-shadow: 0 0 20px rgba(0,0,0,0.1);">
				 <!-- <thead style="background-color: #42a386; padding: 10px; height:50px ;">
					<tr>
					  <th style="border: 1px solid rgb(211, 211, 211);">Owner</th>
					  <th  style="border: 1px solid rgb(211, 211, 211);">Repository</th>
					  <th  style="border: 1px solid rgb(211, 211, 211);">Topics</th>
	  
					</tr>
				  </thead>  -->
				  <tbody style="background-color: #dee2e1; text-align: center;">
					
				
					<tr style="height: 50px ">
					  <td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Repository Name 📂 </td>
					  <td style="background-color: #dee2e1;width: 200px;"><b >"""),_display_(/*31.65*/Details/*31.72*/.repoName),format.raw/*31.81*/(""" """),format.raw/*31.82*/("""</b></td>

					  <td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Repository Owner 👨‍💻 </td>
					  <td style="background-color: #dee2e1;width: 200px;"><a href="/">"""),_display_(/*34.73*/Details/*34.80*/.ownerName),format.raw/*34.90*/("""</a></td>

					  <td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Language 📑 </td>
					  <td style="background-color: #dee2e1;width: 200px;"><b style="">"""),_display_(/*37.73*/Details/*37.80*/.language),format.raw/*37.89*/("""</b></td>
					
					</tr>

					<tr style="height: 50px ">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Open issues 📝 </td>
						<td style="background-color: #dee2e1;width: 200px;">"""),_display_(/*43.60*/Details/*43.67*/.issuesCount),format.raw/*43.79*/("""</td>
  
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Creation Date 📅 </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*46.61*/Details/*46.68*/.created),format.raw/*46.76*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Size 📦  </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*49.61*/Details/*49.68*/.size),format.raw/*49.73*/(""" """),format.raw/*49.74*/("""<span>MB</span></td>
					  </tr> 

					  <tr style="height: 50px ">
						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Star Count ⭐ </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*54.61*/Details/*54.68*/.stars),format.raw/*54.74*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Watch Count 👁‍🗨 </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*57.61*/Details/*57.68*/.watch),format.raw/*57.74*/("""</td>

						<td style="background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Forks 📩 </td>
						<td style="background-color: #dee2e1; width: 200px;">"""),_display_(/*60.61*/Details/*60.68*/.watch),format.raw/*60.74*/("""</td>
					  </tr> 

 
				  </tbody> 
				</table>

				<table style="
				border-collapse: collapse;
				border: 1px solid #ddd;
				box-shadow: 0 0 20px rgba(0,0,0,0.1);">

				  	<tbody style="background-color: #dee2e1; text-align: center;">

						<tr style="height: 50px ">
							<td style="border: 1px solid rgb(20, 107, 71);background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Description 💭 </td>
							<td style="background-color: #dee2e1;width :80%;">"""),_display_(/*76.59*/Details/*76.66*/.description),format.raw/*76.78*/("""</td>
						</tr> 

					</tbody>
				</table>

				<table style="
				border-collapse: collapse;
				border: 1px solid #ddd;
				box-shadow: 0 0 20px rgba(0,0,0,0.1);">

				  	<tbody style="background-color: #dee2e1; text-align: center;">

						<tr style="height: 50px ">

							<td style="border: 1px solid rgb(20, 107, 71);background-color: rgb(20, 107, 71);color: #dee2e1;width: 200px;">Topics 🪧</td>
							<td style="background-color: #dee2e1;width :80%;">
								"""),_display_(/*93.10*/for(topic <- Details.getTopicsList()) yield /*93.47*/{_display_(Seq[Any](format.raw/*93.48*/("""
									"""),format.raw/*94.10*/("""<div style="display: inline-block;background-color: #0b7e5b;color: #dee2e1; border-radius:6px; padding: 4px; margin-right: 3px; margin-top: 3px;margin-bottom: 3px;"> """),_display_(/*94.177*/topic),format.raw/*94.182*/(""" """),format.raw/*94.183*/("""</div> 
								""")))}),format.raw/*95.10*/("""
							"""),format.raw/*96.8*/("""</td>
						</tr> 

					</tbody>
				</table>

			

			</div>

		</div>
      

		<center>
			<button
			onclick="window.location.href='#Issues';"
			style="background-color: #641515;
			border: none;
			color: white;
			padding: 17px 25px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 16px;
			margin: 4px 2px;
			cursor: pointer;" > Issues 📜 </button>
	
			<button
			onclick="window.location.href='#Collaborator';"
			style="background-color: #223779;
			border: none;
			color: white;
			padding: 17px 25px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 16px;
			margin: 4px 2px;
			cursor: pointer;" > Collaborators 👨‍💻 </button>
			
			<button
			onclick="window.location.href='/repos/"""),_display_(/*137.43*/Details/*137.50*/.ownerName),format.raw/*137.60*/("""/"""),_display_(/*137.62*/Details/*137.69*/.repoName),format.raw/*137.78*/("""/commits';"
			style="background-color: #075c4e;
			border: none;
			color: white;
			padding: 17px 25px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 16px;
			margin: 4px 2px;
			cursor: pointer;" > Commits 📥 </button>
	
			<button
			onclick="window.location.href='"""),_display_(/*150.36*/Details/*150.43*/.repoLink),format.raw/*150.52*/("""';"
			 style="background-color: #b9411c;
			border: none;
			color: white;
			padding: 17px 25px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 16px;
			margin: 4px 2px;
			cursor: pointer;" > Code 📄 </button>

			<button
			onclick="window.location.href='/statistics/';"
			style="background-color: #344147;
			border: none;
			color: white;
			padding: 17px 25px;
			text-align: center;
			text-decoration: none;
			display: inline-block;
			font-size: 16px;
			margin: 4px 2px;
			cursor: pointer;" > Issue Statistics 📊 </button>
	
		  </center>
		

 	 </div>


  
	  <div  id="Issues" class="container" style="display: flex;justify-content: center; ">
		<div style="padding: 10px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">

			<center> <h3>Showing  <span style=" font-size: 30px; color:rgb(18, 105, 69)">"""),_display_(/*185.82*/Details/*185.89*/.issueList.size()),format.raw/*185.106*/(""" """),format.raw/*185.107*/("""</span>  Latest issues </h3></center>
			
		  <table style="
			border-collapse: collapse;
			border: 1px solid #ddd;
			box-shadow: 0 0 20px rgba(0,0,0,0.1);">

			<thead style="background-color: #42a386; padding: 10px; height:50px ;">

				<tr>
				<th style="border: 1px solid rgb(211, 211, 211);">Issue Number</th>
				<th style="border: 1px solid rgb(211, 211, 211);">Issue Title</th>
				<th  style="border: 1px solid rgb(211, 211, 211);">Raised Time</th>	 
				<th  style="border: 1px solid rgb(211, 211, 211);">State</th>
					
				</tr>

			</thead>	
			    
			  <tbody style="background-color: #dee2e1; text-align: center;">
				
			
			

			
					"""),_display_(/*210.7*/for(issue <- Details.issueList) yield /*210.38*/{_display_(Seq[Any](format.raw/*210.39*/("""
					"""),format.raw/*211.6*/("""<tr style="height: 50px ">
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*212.99*/issue/*212.104*/.issueNumber),format.raw/*212.116*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*214.99*/issue/*214.104*/.issueTitle),format.raw/*214.115*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 30px;">"""),_display_(/*216.99*/issue/*216.104*/.issueCreatedDate),format.raw/*216.121*/(""" """),format.raw/*216.122*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 10px; "><span style="color: """),_display_(/*218.120*/issue/*218.125*/.stateColor),format.raw/*218.136*/(""" """),format.raw/*218.137*/("""; font-size: 25px;">"""),_display_(/*218.158*/issue/*218.163*/.issueState),format.raw/*218.174*/("""</span></td>
					</tr> 
					""")))}),format.raw/*220.7*/("""
			
			  
			  """),format.raw/*223.6*/("""</tbody> 
			</table>
		 </div>
		</div>
		<div id="Collaborator" class="container" style="display: flex;justify-content: center; ">
		 <div style="padding: 10px;margin: 20px;background-color: rgb(211, 211, 211);border-radius: 5px;">

			<center> <h3>Collaborators</h3></center>
		  <table style="
			border-collapse: collapse;
			border: 1px solid #ddd;
			box-shadow: 0 0 20px rgba(0,0,0,0.1);">

			<thead style="background-color: #42a386; padding: 10px; height:50px ;">

				<tr>
				<th style="border: 1px solid rgb(211, 211, 211); padding: 20px;"></th>
				<th style="border: 1px solid rgb(211, 211, 211); padding: 20px;">Name</th>
				<th  style="border: 1px solid rgb(211, 211, 211); padding: 20px;">ID</th>	 
				<th  style="border: 1px solid rgb(211, 211, 211); padding: 20px;">Contribution Count</th>
				<th style="border: 1px solid rgb(211, 211, 211); padding: 20px;"> </th>
					
				</tr>

			</thead>	
			    
			  <tbody style="background-color: #dee2e1; text-align: center;">
				
			
			

			
					"""),_display_(/*255.7*/for(Collaborator <- Details.collabList) yield /*255.46*/{_display_(Seq[Any](format.raw/*255.47*/("""
					"""),format.raw/*256.6*/("""<tr style="height: 50px ">
						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1;padding: 20px; "> <img src="""),_display_(/*257.109*/Collaborator/*257.121*/.ContributorAvatarURL),format.raw/*257.142*/(""" """),format.raw/*257.143*/("""alt="Avatar" width="100" height="100"></td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">"""),_display_(/*259.99*/Collaborator/*259.111*/.ContributorName),format.raw/*259.127*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">"""),_display_(/*261.99*/Collaborator/*261.111*/.ContributorID),format.raw/*261.125*/(""" """),format.raw/*261.126*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">"""),_display_(/*263.99*/Collaborator/*263.111*/.ContributorContributions),format.raw/*263.136*/("""</td>

						<td style="border: 1px solid rgb(104, 207, 164);background-color: #dee2e1; padding: 20px;">
						
							<button
							onclick="window.location.href='/';"
							style="background-color: #ca1d65;
							border: none;
							color: white;
							padding: 17px 25px;
							text-align: center;
							text-decoration: none;
							display: inline-block;
							font-size: 16px;
							margin: 4px 2px;
							cursor: pointer;" > Go to Profile 👨‍💻 </button>
						
						</td>
					</tr> 
					""")))}),format.raw/*282.7*/("""
			
			  
			  """),format.raw/*285.6*/("""</tbody> 
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
	  padding: 10px;" onclick="topFunction()" id="myBtn" title="Go to top"> ⬆ Back to Details</button>

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
	padding: 5px;" onclick="window.location.href='/'" title="Go Back"> ⬅ Back </button>

  
</section>
<script>
	//Get the button
	var mybutton = document.getElementById("myBtn");
	
	// When the user scrolls down 20px from the top of the document, show the button
	window.onscroll = function() """),format.raw/*324.31*/("""{"""),format.raw/*324.32*/("""scrollFunction()"""),format.raw/*324.48*/("""}"""),format.raw/*324.49*/(""";
	
	function scrollFunction() """),format.raw/*326.28*/("""{"""),format.raw/*326.29*/("""
	  """),format.raw/*327.4*/("""if (document.body.scrollTop > 150 || document.documentElement.scrollTop > 150) """),format.raw/*327.83*/("""{"""),format.raw/*327.84*/("""
		"""),format.raw/*328.3*/("""mybutton.style.display = "block";
	  """),format.raw/*329.4*/("""}"""),format.raw/*329.5*/(""" """),format.raw/*329.6*/("""else """),format.raw/*329.11*/("""{"""),format.raw/*329.12*/("""
		"""),format.raw/*330.3*/("""mybutton.style.display = "none";
	  """),format.raw/*331.4*/("""}"""),format.raw/*331.5*/("""
	"""),format.raw/*332.2*/("""}"""),format.raw/*332.3*/("""
	
	"""),format.raw/*334.2*/("""// When the user clicks on the button, scroll to the top of the document
	function topFunction() """),format.raw/*335.25*/("""{"""),format.raw/*335.26*/("""
	  """),format.raw/*336.4*/("""document.body.scrollTop = 0;
	  document.documentElement.scrollTop = 0;
	"""),format.raw/*338.2*/("""}"""),format.raw/*338.3*/("""
	"""),format.raw/*339.2*/("""</script>"""))
      }
    }
  }

  def render(Details:Models.RepositoryProfile): play.twirl.api.HtmlFormat.Appendable = apply(Details)

  def f:((Models.RepositoryProfile) => play.twirl.api.HtmlFormat.Appendable) = (Details) => apply(Details)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/repodetails.scala.html
                  HASH: fc0085678f21746a3ee049e5eb9974bb8cfef65b
                  MATRIX: 931->1|1060->37|1088->39|1429->353|1445->360|1475->369|2397->1264|2413->1271|2443->1280|2472->1281|2694->1476|2710->1483|2741->1493|2952->1677|2968->1684|2998->1693|3247->1915|3263->1922|3296->1934|3497->2108|3513->2115|3542->2123|3733->2287|3749->2294|3775->2299|3804->2300|4062->2531|4078->2538|4105->2544|4305->2717|4321->2724|4348->2730|4539->2894|4555->2901|4582->2907|5086->3384|5102->3391|5135->3403|5638->3879|5691->3916|5730->3917|5768->3927|5963->4094|5990->4099|6020->4100|6068->4117|6103->4125|6914->4908|6931->4915|6963->4925|6993->4927|7010->4934|7041->4943|7382->5256|7399->5263|7430->5272|8342->6156|8359->6163|8399->6180|8430->6181|9117->6841|9165->6872|9205->6873|9239->6879|9392->7004|9408->7009|9443->7021|9576->7126|9592->7131|9626->7142|9759->7247|9775->7252|9815->7269|9846->7270|10001->7396|10017->7401|10051->7412|10082->7413|10132->7434|10148->7439|10182->7450|10244->7481|10288->7497|11333->8515|11389->8554|11429->8555|11463->8561|11627->8696|11650->8708|11694->8729|11725->8730|11896->8873|11919->8885|11958->8901|12091->9006|12114->9018|12151->9032|12182->9033|12315->9138|12338->9150|12386->9175|12926->9684|12970->9700|13902->10603|13932->10604|13977->10620|14007->10621|14067->10652|14097->10653|14129->10657|14237->10736|14267->10737|14298->10740|14363->10777|14392->10778|14421->10779|14455->10784|14485->10785|14516->10788|14580->10824|14609->10825|14639->10827|14668->10828|14700->10832|14826->10929|14856->10930|14888->10934|14989->11007|15018->11008|15048->11010
                  LINES: 27->1|32->2|34->4|41->11|41->11|41->11|61->31|61->31|61->31|61->31|64->34|64->34|64->34|67->37|67->37|67->37|73->43|73->43|73->43|76->46|76->46|76->46|79->49|79->49|79->49|79->49|84->54|84->54|84->54|87->57|87->57|87->57|90->60|90->60|90->60|106->76|106->76|106->76|123->93|123->93|123->93|124->94|124->94|124->94|124->94|125->95|126->96|167->137|167->137|167->137|167->137|167->137|167->137|180->150|180->150|180->150|215->185|215->185|215->185|215->185|240->210|240->210|240->210|241->211|242->212|242->212|242->212|244->214|244->214|244->214|246->216|246->216|246->216|246->216|248->218|248->218|248->218|248->218|248->218|248->218|248->218|250->220|253->223|285->255|285->255|285->255|286->256|287->257|287->257|287->257|287->257|289->259|289->259|289->259|291->261|291->261|291->261|291->261|293->263|293->263|293->263|312->282|315->285|354->324|354->324|354->324|354->324|356->326|356->326|357->327|357->327|357->327|358->328|359->329|359->329|359->329|359->329|359->329|360->330|361->331|361->331|362->332|362->332|364->334|365->335|365->335|366->336|368->338|368->338|369->339
                  -- GENERATED --
              */
          

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
			onclick="window.location.href='/';"
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
<<<<<<< HEAD
                  HASH: dcff26d01fad8c1e0051725cb31a67962dab0514
                  MATRIX: 931->1|1061->36|1093->42|1441->363|1457->370|1487->379|2429->1294|2445->1301|2475->1310|2504->1311|2729->1509|2745->1516|2776->1526|2990->1713|3006->1720|3036->1729|3291->1957|3307->1964|3340->1976|3544->2153|3560->2160|3589->2168|3783->2335|3799->2342|3825->2347|3854->2348|4117->2584|4133->2591|4160->2597|4363->2773|4379->2780|4406->2786|4600->2953|4616->2960|4643->2966|5163->3459|5179->3466|5212->3478|5732->3971|5785->4008|5824->4009|5863->4020|6058->4187|6085->4192|6115->4193|6164->4211|6200->4220|7363->5355|7380->5362|7411->5371|8358->6290|8375->6297|8415->6314|8446->6315|9158->7000|9206->7031|9246->7032|9281->7039|9435->7165|9451->7170|9486->7182|9621->7289|9637->7294|9671->7305|9806->7412|9822->7417|9862->7434|9893->7435|10050->7563|10066->7568|10100->7579|10131->7580|10181->7601|10197->7606|10231->7617|10295->7650|10342->7669|11419->8719|11475->8758|11515->8759|11550->8766|11715->8902|11738->8914|11782->8935|11813->8936|11986->9081|12009->9093|12048->9109|12183->9216|12206->9228|12243->9242|12274->9243|12409->9350|12432->9362|12480->9387|13039->9915|13086->9934|14057->10876|14087->10877|14132->10893|14162->10894|14224->10927|14254->10928|14287->10933|14395->11012|14425->11013|14457->11017|14523->11055|14552->11056|14581->11057|14615->11062|14645->11063|14677->11067|14742->11104|14771->11105|14802->11108|14831->11109|14865->11115|14992->11213|15022->11214|15055->11219|15158->11294|15187->11295|15218->11298
                  LINES: 27->1|32->1|35->4|42->11|42->11|42->11|62->31|62->31|62->31|62->31|65->34|65->34|65->34|68->37|68->37|68->37|74->43|74->43|74->43|77->46|77->46|77->46|80->49|80->49|80->49|80->49|85->54|85->54|85->54|88->57|88->57|88->57|91->60|91->60|91->60|107->76|107->76|107->76|124->93|124->93|124->93|125->94|125->94|125->94|125->94|126->95|127->96|181->150|181->150|181->150|216->185|216->185|216->185|216->185|241->210|241->210|241->210|242->211|243->212|243->212|243->212|245->214|245->214|245->214|247->216|247->216|247->216|247->216|249->218|249->218|249->218|249->218|249->218|249->218|249->218|251->220|254->223|286->255|286->255|286->255|287->256|288->257|288->257|288->257|288->257|290->259|290->259|290->259|292->261|292->261|292->261|292->261|294->263|294->263|294->263|313->282|316->285|355->324|355->324|355->324|355->324|357->326|357->326|358->327|358->327|358->327|359->328|360->329|360->329|360->329|360->329|360->329|361->330|362->331|362->331|363->332|363->332|365->334|366->335|366->335|367->336|369->338|369->338|370->339
=======
                  HASH: c44cf3e89bdc7f1e471bcfdd480cb09ea3ca872a
                  MATRIX: 931->1|1060->37|1088->39|1429->353|1445->360|1475->369|2397->1264|2413->1271|2443->1280|2472->1281|2694->1476|2710->1483|2741->1493|2952->1677|2968->1684|2998->1693|3247->1915|3263->1922|3296->1934|3497->2108|3513->2115|3542->2123|3733->2287|3749->2294|3775->2299|3804->2300|4062->2531|4078->2538|4105->2544|4305->2717|4321->2724|4348->2730|4539->2894|4555->2901|4582->2907|5086->3384|5102->3391|5135->3403|5638->3879|5691->3916|5730->3917|5768->3927|5963->4094|5990->4099|6020->4100|6068->4117|6103->4125|7212->5206|7229->5213|7260->5222|8161->6095|8178->6102|8218->6119|8249->6120|8936->6780|8984->6811|9024->6812|9058->6818|9211->6943|9227->6948|9262->6960|9395->7065|9411->7070|9445->7081|9578->7186|9594->7191|9634->7208|9665->7209|9820->7335|9836->7340|9870->7351|9901->7352|9951->7373|9967->7378|10001->7389|10063->7420|10107->7436|11152->8454|11208->8493|11248->8494|11282->8500|11446->8635|11469->8647|11513->8668|11544->8669|11715->8812|11738->8824|11777->8840|11910->8945|11933->8957|11970->8971|12001->8972|12134->9077|12157->9089|12205->9114|12745->9623|12789->9639|13721->10542|13751->10543|13796->10559|13826->10560|13886->10591|13916->10592|13948->10596|14056->10675|14086->10676|14117->10679|14182->10716|14211->10717|14240->10718|14274->10723|14304->10724|14335->10727|14399->10763|14428->10764|14458->10766|14487->10767|14519->10771|14645->10868|14675->10869|14707->10873|14808->10946|14837->10947|14867->10949
                  LINES: 27->1|32->2|34->4|41->11|41->11|41->11|61->31|61->31|61->31|61->31|64->34|64->34|64->34|67->37|67->37|67->37|73->43|73->43|73->43|76->46|76->46|76->46|79->49|79->49|79->49|79->49|84->54|84->54|84->54|87->57|87->57|87->57|90->60|90->60|90->60|106->76|106->76|106->76|123->93|123->93|123->93|124->94|124->94|124->94|124->94|125->95|126->96|180->150|180->150|180->150|215->185|215->185|215->185|215->185|240->210|240->210|240->210|241->211|242->212|242->212|242->212|244->214|244->214|244->214|246->216|246->216|246->216|246->216|248->218|248->218|248->218|248->218|248->218|248->218|248->218|250->220|253->223|285->255|285->255|285->255|286->256|287->257|287->257|287->257|287->257|289->259|289->259|289->259|291->261|291->261|291->261|291->261|293->263|293->263|293->263|312->282|315->285|354->324|354->324|354->324|354->324|356->326|356->326|357->327|357->327|357->327|358->328|359->329|359->329|359->329|359->329|359->329|360->330|361->331|361->331|362->332|362->332|364->334|365->335|365->335|366->336|368->338|368->338|369->339
>>>>>>> 8894164018127bc3b18d5e171a028cce595d7ea0
                  -- GENERATED --
              */
          
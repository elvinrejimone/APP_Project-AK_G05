// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def topics(topicname:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "topic/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("topicname", topicname)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:14
    def issues(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "statistics/")
    }
  
    // @LINE:13
    def repoProfileRequestHandler(query:String, id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "repo/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("query", query)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}

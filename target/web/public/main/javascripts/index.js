(function() {
  $(function() {
    var wsTopic;
    wsTopic = new WebSocket($("section").data("ws-url"));
    return wsTopic.onmessage = function(event) {
      var message;
      message = JSON.parse(event.data);
      return $('#time').append(message.time + "<br/>");
    };
  });

}).call(this);

//# sourceMappingURL=index.js.map

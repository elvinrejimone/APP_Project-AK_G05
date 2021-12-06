$ ->
  wsTopic = new WebSocket $("section").data("ws-url")
  wsTopic.onmessage = (event) ->
    message = JSON.parse event.data
    $('#time').append message.time + "<br/>"
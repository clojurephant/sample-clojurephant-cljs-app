(ns my.group.myapp.dev
  (:require [figwheel.repl :as repl]))

(repl/connect "ws://localhost:9500/figwheel-connect")

(js/console.log "It's dev time!")

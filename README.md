# sample-clojurephant-cljs-app

Sample project using [clojurephant](https://github.com/clojurephant) to build a ClojureScript app.

## Usage

Start the nREPL server:

    $ ./gradlew clojureRepl

NOTE: REPL support for CLJS is in a rough state right in 0.7.0.

Connect to the nREPL server with your client/editor of choice and start the Figwheel REPL.

    user => (do
              (require '[cljs.build.api])
              (require '[figwheel.repl])
              (require '[cider.piggieback])
              (let [opts {:optimizations :none
                          :main 'my.group.myapp
                          :output-to "build/tmp/clojureRepl/public/js/main.js"
                          :output-dir "build/tmp/clojureRepl/public/js/out"
                          :asset-path "js/out"
                          :source-map true}]
              (cljs.build.api/build opts)
              (cider.piggieback/cljs-repl (figwheel.repl/repl-env) opts)))

NOTE: This only uses the `figwheel-repl` component not the full `figwheel-main`. This means you don't get the hot-reloading Figwheel normally provides, but do get it's other REPL capabilities.

## More Help

See [Clojurephant's docs](https://clojurephant.dev).

# sample-clojurephant-cljs-app

Sample project using [clojurephant](https://github.com/clojurephant) to build a ClojureScript app.

## Usage

Start the nREPL server:

    $ ./gradlew clojureRepl

NOTE: REPL support for CLJS is still expermintal in in 0.8.0.

Connect to the nREPL server with your client/editor of choice and start the Figwheel REPL.

    user => (do
              (require '[dev.clojurephant.tooling.figwheel-main :as fig])
              (fig/start :dev))

This uses the [clojurephant-tooling](https://github.com/clojurephant/clojurephant-tooling) JAR to interoperate with figwheel-main and the config in your `build.gradle`.

CIDER user's can use `M-x cider-jack-in-cljs` and use the `custom` option providing the above Clojure form to start the REPL.

## More Help

See [Clojurephant's docs](https://clojurephant.dev).

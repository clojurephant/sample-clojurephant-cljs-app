# sample-clojurephant-cljs-app

Sample project using [clojurephant](https://github.com/clojurephant) to build a ClojureScript app.

## Usage

In one terminal, start a continuous build of the `dev` ClojureScript:

    $ ./gradlew compileDevClojureScript -t

Then start nREPL:

    $ ./gradlew clojureRepl

Connect to the nREPL server with your client/editor of choice and start the Figwheel REPL:

    user => (do
              (require '[figwheel.repl])
              (require '[cider.piggieback])
              (cider.piggieback/cljs-repl (figwheel.repl/repl-env)))

NOTE: This only uses the `figwheel-repl` component not the full `figwheel-main`. This means you don't get the hot-reloading Figwheel normally provides, but do get it's other REPL capabilities. The continuous build from Gradle will keep your code updated, but you will need to reload namespaces as desired.

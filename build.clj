;; build.clj
(require '[cljs.build.api :as b])
(require '[cljs.repl :as r])
(require '[cljs.repl.node :as n])

(b/build "src"
         {:main 'aggregator.core
          :output-to "bin/aggregator.js"
          :optimizations :simple ;:advanced
          :target :nodejs
          :verbose true})

(b/watch "src"
         {:main 'aggregator.core
          :output-to "bin/aggregator.js"
          :optimizations :simple ;:advanced
          :target :nodejs
          :verbose true})

;; (r/repl (n/repl-env)
;;         :watch "src"
;;         :output-dir "out")


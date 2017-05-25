;; build.cljs
(require '[lumo.build.api :as b])

(b/build "src"
         {:main 'aggregator.core
          :output-to "bin/aggregator.js"
          :optimizations :simple ;:advanced
          :target :nodejs})


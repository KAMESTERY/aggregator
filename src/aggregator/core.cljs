(ns aggregator.core
  (:require [aggregator.crawler.core :refer [crawl-url]]))

(enable-console-print!)

;; (defn sleep [f ms]
;;   (js/setTimeout f ms))

;; (defn schedule [f ms]
;;   (js/setInterval f ms))

(crawl-url {:rateLimit 1000 ;; `maxConnections` will be forced to 1
            :callback (fn [err res done]
                        (println "Aggregating...")
                        (println (-> res (.$ "title") .text))
                        (done))}
           ["http://www.outcastgeek.com"
            "http://www.google.com"
            "http://www.amazon.com"])

;; (sleep
;;  #(println "Wrapping up :-)")
;;  2000)


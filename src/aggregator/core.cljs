(ns aggregator.core
  (:require [cljs.nodejs :as nodejs]
            [aggregator.crawler.core :refer [crawl-url]]))

(enable-console-print!)

(def $ (nodejs/require "cheerio"))

;; (defn sleep [f ms]
;;   (js/setTimeout f ms))

;; (defn schedule [f ms]
;;   (js/setInterval f ms))

(defn process-title [res]
  (println (-> res (.$ "title") .text))
  res)

(defn process-links [res]
  (let [links (-> res (.$ "a[href]"))]
    (.each links #(-> % $ println))
    (println "Links: " links))
  ;; (doseq [link (-> res (.$ "a") js->clj)]
  ;;         (println (.href link)))
  res)

(defn process-page [err res done]
  (println "Aggregating...")
  (-> res
      process-title
      process-links)
  (done))

(def default-options
  {:rateLimit 1000 ;; `maxConnections` will be forced to 1
   :callback process-page})

(crawl-url default-options
           ["http://www.outcastgeek.com"
            "http://www.google.com"
            "http://www.amazon.com"])

(crawl-url default-options
           "http://www.abidjan.net")

;; (sleep
;;  #(println "Wrapping up :-)")
;;  2000)


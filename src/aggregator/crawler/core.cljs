(ns aggregator.crawler.core
  (:require [cljs.nodejs :as nodejs]))

;;(def jsdom (nodejs/require "jsdom"))
(def Crawler (nodejs/require "crawler"))

(defn crawl-url [opts urls]
  (let [c (Crawler. (clj->js opts))]
    (.queue c (clj->js urls))))


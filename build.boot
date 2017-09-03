(set-env!
 :source-paths   #{"src/cljs"}
 :resource-paths #{"html"}

 :dependencies '[[adzerk/boot-cljs   "2.1.3" :scope "test"]
                 [adzerk/boot-reload "0.5.2" :scope "test"]
                 [pandeiro/boot-http "0.8.3" :scope "test"]])

(require '[adzerk.boot-cljs   :refer [cljs]]
         '[adzerk.boot-reload :refer [reload]]
         '[pandeiro.boot-http :refer [serve]])

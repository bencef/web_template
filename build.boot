(set-env!
 :source-paths   #{"src/cljs"}
 :resource-paths #{"html"}

 :dependencies '[[adzerk/boot-cljs "2.1.3" :scope "test"]])

(require '[adzerk.boot-cljs :refer [cljs]])


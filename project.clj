(defproject sss4clj "0.1.0-SNAPSHOT"
  :description "Shotgun Stochastic Search Algorithm"
  :url "https://github.com/michaellindon/sss4clj"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.commons/commons-math3 "3.6.1"]
                 [distributions "0.1.0-SNAPSHOT"]
                 [incanter/incanter-core "1.9.1"]
                 [net.mikera/core.matrix "0.57.0"]
                 [net.mikera/vectorz-clj "0.45.0"]
                 [org.clojure/test.check "0.9.0"]
                 [org.clojure/math.combinatorics "0.1.4"]
                 [codox-theme-rdash "0.1.1"]
                 [org.clojure/data.priority-map "0.0.7"]]
  :codox {:metadata {:doc/format :markdown}
          :themes [:rdash]
          :source-uri "https://github.com/michaellindon/sss4clj/blob/master/{filepath}#L{line}"})

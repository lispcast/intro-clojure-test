(defproject fitness "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :target-path "target/%s"
  :aot [fitness.safety.UnsafeResistanceException]
  :profiles {:uberjar {:aot :all}})

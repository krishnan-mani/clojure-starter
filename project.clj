(defproject clojure-starter "0.1.0-SNAPSHOT"
  :description "Clone this and you are off and running writing Clojure using TDD"
  :url "https://github.com/krishnan-mani/clojure-starter"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot clojure-starter.core
  :target-path "target/%s"
  :plugins [[lein-auto "0.1.3"]]
  :profiles {:dev     {:dependencies [[lambdaisland/kaocha "1.0.829"]]}
             :uberjar {:aot      :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}
             }
  :aliases {"kaocha" ["run" "-m" "kaocha.runner"]}
  )

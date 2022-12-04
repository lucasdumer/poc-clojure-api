(defproject lein-template.poc-clojure-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :eval-in-leiningen true
  :dependencies [
    [io.pedestal/pedestal.service "0.5.10"]
    [io.pedestal/pedestal.service-tools "0.5.10"] ;; Only needed for ns-watching; WAR tooling
    [io.pedestal/pedestal.jetty "0.5.10"]
    [io.pedestal/pedestal.immutant "0.5.10"]
    [io.pedestal/pedestal.tomcat "0.5.10"]
    [io.pedestal/pedestal.aws "0.5.10"] ;; API-Gateway, Lambda, and X-Ray support
    [io.pedestal/pedestal.log "0.5.10"] ;; Logging and runtime metrics
    [io.pedestal/pedestal.interceptor "0.5.10"] ;; The Interceptor chain and the Interceptor API
    [io.pedestal/pedestal.route "0.5.10"]] ;; Efficient routing algorithms and data structures
  :main leiningen.new.poc-clojure-api)

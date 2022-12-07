(ns leiningen.new.poc-clojure-api
  (:require [io.pedestal.http :as http]))

(defn hello-world
  [request]
  (let [name (get-in request [:params :name] "World")]
    {:status 200 :body (str "Hello " name "!\n")}))

(def routes
  #{["/greet" :get `hello-world]})

(def service {:env                 :prod
              ::http/routes        routes
              ::http/resource-path "/public"
              ::http/type          :jetty
              ::http/port          8080
              ::http/host          "0.0.0.0"
              ::http/allowed-origins {:creds true :allowed-origins (constantly true)}})

(defonce runnable-service (http/create-server service))

(defn -main
  [& args]
  (println "start...")
  (http/start runnable-service))

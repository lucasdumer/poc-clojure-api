FROM clojure:lein

WORKDIR /var/local/

EXPOSE 8080

ENTRYPOINT lein run -p 8080
build:
	docker-compose build
run-dev:
	make build
	docker-compose up
run:
	make build
	docker-compose up -d
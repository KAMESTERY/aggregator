
PATH := $(CURDIR)/node_modules/.bin:$(PATH)

.PHONY: all deps run

deps:
	yarn install

run:
	yarn start


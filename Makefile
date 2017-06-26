
PATH := $(CURDIR)/node_modules/.bin:$(PATH)

.PHONY: all dev run deps clean

all: deps
	yarn build

watch: deps
	yarn watch

dev: deps
	yarn dev

run: deps
	yarn start

deps:
	yarn install

clean:
	@rm -rf bin out node_modules



PATH := $(CURDIR)/node_modules/.bin:$(PATH)

.PHONY: all dev run deps clean

all: deps
	yarn build

dev: deps
	yarn dev

run: deps
	yarn start

deps:
	yarn install

clean:
	@rm -rf bin out node_modules


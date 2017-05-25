// --index.js--

import {crawlUrl} from 'crawler/core';

console.log("Hello from Aggregator!");

crawlUrl(
    {
        rateLimit: 1000, // `maxConnections` will be forced to 1
        callback: function(err, res, done){
            console.log(res.$("title").text());
            done();
        }
    },
    "http://outcastgeek.com"
);


#!/usr/bin/env bash
sshpass -p $WEB_PASS scp -r androidgraphextension/build/dokka/ schoolhelper@167.99.94.185:/var/www/schoolhelper.tech/

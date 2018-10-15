#!/usr/bin/env bash
set -ev
# copy id_rsa private key to cwd
chmod 400 ./id_rsa
chmod 400 ./id_rsa.pub
# scp using RSAKey authentication
# cp _site/* to remote hosts root directory
scp -o StrictHostKeyChecking=no -i ./id_rsa -o RSAAuthentication=yes -o PubkeyAuthentication=yes -r androidgraphextension/build/dokka root@167.99.94.185:/mnt/schoolhelper/html/androidgraphextension/
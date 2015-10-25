#!/bin/bash
vboxmanage snapshot "$1" restore "factory"
/Applications/Genymotion.app/Contents/MacOS/player --vm-name "$1" > /dev/null 2>&1  &
echo "Running Device"
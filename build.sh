#!/bin/sh

if [ -z "$1" ]; then
  echo "Usage: ./build.sh [one|two]"
  exit 1
fi

cd src

javac com/beacastroalves/practicingoop/$1/*.java -d ../build

cd ../build

java com.beacastroalves.practicingoop.$1.Window

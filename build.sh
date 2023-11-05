#!/bin/sh

if [ -z "$1" ]; then
  echo "Usage: ./build.sh [one|two]"
  exit 1
fi

cd src

if [ "$1" = "one" ]; then

  javac com/beacastroalves/practicingoop/one/*.java -d ../build

  cd ../build

  java com.beacastroalves.practicingoop.one.One

elif [ "$1" = "two" ]; then

  javac com/beacastroalves/practicingoop/two/*.java -d ../build

  cd ../build

  java com.beacastroalves.practicingoop.two.Two

else
  echo "option \"$1\" not recognized!"
  exit 1
fi
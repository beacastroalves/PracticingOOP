@Echo off

cd src

javac com\beacastroalves\practicingoop\one\*.java -d ..\build

cd ..\build

java com.beacastroalves.practicingoop.one.Window

cd ..\
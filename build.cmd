@Echo off

cd src

javac com\beacastroalves\practicingoop\*.java -d ..\build

cd ..\build

java com.beacastroalves.practicingoop.Window

cd ..\
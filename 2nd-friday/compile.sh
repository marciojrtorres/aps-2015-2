rm -r bin # rd bin /s /q
mkdir bin
javac -cp bin -d bin src/toolkit/StringUtil.java
javac -cp bin -d bin src/toolkit/StringUtilTest.java

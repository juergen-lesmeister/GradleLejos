# leJOS example project

Lejos EV3 API docs can be found at http://www.lejos.org/ev3/docs/

## Build
Uses the follwing artifact from Maven Central

group: 'com.github.bdeneuter', name: 'lejos-ev3-api', version: '0.9.1-beta'

gradlew build   Build project

Unfortunately that doesn't work for me, lejos-ev3-api is compiled
for Java language level 8, but my lejos installation is still running Java 7:
Exception in thread "main" java.lang.UnsupportedClassVersionError: lejos/internal/ev3/EV3Wrapper : Unsupported major.minor version 52.0
	at java.lang.ClassLoader.defineClass1(Native Method)
	at java.lang.ClassLoader.defineClass(ClassLoader.java:800)
	at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
	at java.net.URLClassLoader.defineClass(URLClassLoader.java:449)
	at java.net.URLClassLoader.access$100(URLClassLoader.java:71)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:361)
	at java.net.URLClassLoader$1.run(URLClassLoader.java:355)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:354)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:425)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:308)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:358)
	at sun.launcher.LauncherHelper.checkAndLoadMain(LauncherHelper.java:482)


Note to me: The language level is encoded in bytes 6 & 7 of the class file, for example: 0x00 0x34

- Java SE 9 = 53 (0x35)
- Java SE 8 = 52 (0x34)
- Java SE 7 = 51 (0x33)
- Java SE 6.0 = 50 (0x32)
- Java SE 5.0 = 49 (0x31)
- JDK 1.4 = 48 (0x30)
- JDK 1.3 = 47 (0x2F)
- JDK 1.2 = 46 (0x2E)
- JDK 1.1 = 45 (0x2D)
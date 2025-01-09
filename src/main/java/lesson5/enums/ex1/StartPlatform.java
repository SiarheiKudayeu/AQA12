package main.java.lesson5.enums.ex1;

public class StartPlatform {

    public static void main(String[] args) {
        startPlatform(Platforms.IOS);
        startPlatformElse(Platforms.ANDROID);
    }

    public static void startPlatform(Platforms platform) {
        switch (platform) {
            case ANDROID -> System.out.println("Android is started!!!");
            case IOS -> System.out.println("IOS is started!!!");
            case LINUX -> System.out.println("LINUX is started!!!");
            case WINDOWS -> System.out.println("WINDOWS is started!!!");
            case MACOS -> System.out.println("MACOS is started!!!");
        }
    }

    public static void startPlatformElse(Platforms platform) {
        if (platform.equals(Platforms.ANDROID)) {
            System.out.println("Android is started!!!");
        }
    }


}

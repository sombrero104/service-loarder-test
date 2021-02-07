package me.sombrero;

import java.util.ServiceLoader;

public class HelloMain {

    public static void main(String[] args) {
        ServiceLoader<HelloInterface> serviceLoader = ServiceLoader.load(HelloInterface.class);
        for (HelloInterface helloInterface : serviceLoader) {
            System.out.println(helloInterface.hello());
        }
        /**
         * 출력 결과:
         *          hello!! :D
         *          hallo? 'o'
         */
    }

}

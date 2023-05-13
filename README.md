````
  ____  ____ _____   ____                 _                                  _   
 / ___||  _ \_   _| |  _ \  _____   _____| | ___  _ __  _ __ ___   ___ _ __ | |_ 
 \___ \| |_) || |   | | | |/ _ \ \ / / _ \ |/ _ \| '_ \| '_ ` _ \ / _ \ '_ \| __|
  ___) |  __/ | |   | |_| |  __/\ V /  __/ | (_) | |_) | | | | | |  __/ | | | |_ 
 |____/|_|    |_|   |____/ \___| \_/ \___|_|\___/| .__/|_| |_| |_|\___|_| |_|\__|
                                                 |_|                                           
 cid ----------------------------------------------------------------------------
````

[![build_status](https://github.com/spt-development/spt-development-cid/actions/workflows/build.yml/badge.svg)](https://github.com/spt-development/spt-development-cid/actions)

A very simple library for getting/setting the current correlation ID, utilising ThreadLocal.

Usage
=====

```java
    import com.spt.development.cid.CorrelationId;
    
    public class MyApp {
        public static void main(String[] args) {
            CorrelationId.set(UUID.randomUUID().toString());

            System.out.printf("[%s] Hello, world!", CorrelationId.get());
        }
    }
```

Building locally
================

To build the library, run the following maven command:

```shell
$ mvn clean install
```

Release
=======

To build a release and upload to Maven Central push to `main`.
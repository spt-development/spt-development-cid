````
  ____  ____ _____   ____                 _                                  _   
 / ___||  _ \_   _| |  _ \  _____   _____| | ___  _ __  _ __ ___   ___ _ __ | |_ 
 \___ \| |_) || |   | | | |/ _ \ \ / / _ \ |/ _ \| '_ \| '_ ` _ \ / _ \ '_ \| __|
  ___) |  __/ | |   | |_| |  __/\ V /  __/ | (_) | |_) | | | | | |  __/ | | | |_ 
 |____/|_|    |_|   |____/ \___| \_/ \___|_|\___/| .__/|_| |_| |_|\___|_| |_|\__|
                                                 |_|                                           
 cid ----------------------------------------------------------------------------
````

[![build_status](https://travis-ci.com/spt-development/spt-development-cid.svg?branch=main)](https://travis-ci.com/spt-development/spt-development-cid)

A very simple library for getting/setting the current correlation ID, utilising ThreadLocal.

Usage
=====

    import com.spt.development.cid.CorrelationId;
    
    ...
    
    public void main(String[] args) {
        CorrelationId.set(UUID.randomUUID().toString());

        System.out.printf("[%s] Hello, world!", CorrelationId.get());
    }

Building locally
================

To build the library, run the following maven command:

    $ mvn clean install

Release
=======

To build a release and upload to Maven Central run the following maven command:

    $ export GPG_TTY=$(tty)
    $ mvn deploy -DskipTests -Prelease

NOTE. This is currently a manual step as not able to generate a sonatype nexus user token.
# Aphrodite
Just as the god of vanity reflects upon her gaze and asks all to admire, here I do the same.

## What is this?
This is a repo for my website to be found at https://www.philipbal.com; it is hosted on AWS using elastic 
beanstalk, with automatic code deployments done through Code Deploy/Pipeline. The backend
architecture is a Maven build Spring Boot webapp with some Junit thrown in for testing. Since
this is  my personal website and there's no confidential data testing is pretty lightweight if I 
even decide to do it at all.

## How To's/Setup Notes
### To manually generate relevant war file for EC2 server upload thru IntelliJ
You need to go to maven sidebar, open up lifecycle, and click package to build, war file will be in target folder.

### To see changes locally
Just install tomcat via brew, then the Smart Tomcat plugin (if in IntelliJ),
and setup per General Use Instructions here https://plugins.jetbrains.com/plugin/9492-smart-tomcat/. 

### For Code deploy Setup
You need to do a few pretty easy stuff in AWS that you can find just by looking up, but for the build
to actually work you need a buildspec.yaml file as can be found in this repo (see links in file).

### To setup Spring quickly for any new projects
You can use https://start.spring.io/ to quickly make a lot of the annoying boilerplate stuff.
This tutorial is pretty nice for intial setup as well: https://www.youtube.com/watch?v=ul1tJErDEkE.

### Https/SSL Setup
I use AWS Certificate manager attached to a load balancer on my EC2 instance. There's a solid tutorial 
on youtube if you'd like to see how to do this yourself: https://www.youtube.com/watch?v=bWPTq8z1vFY&list=PLUwLT1owqy0TSAOaM2mXv3gdsEAqHMQF1&index=4&t=619s

## TODOs
* Make the website not look like shit and deicde what to show lol
* Add favicon
* Add content
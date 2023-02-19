# Welcome to JNode-revisited!

This repo was created in order to encourage renewed interest in the JNode opeerating system and integrate modern patches.  As most new development is centered around Rust and Go (and others), I don't expect too much activity, but here it is if you're interested.

Note that I personally am not very familiar with the codebase, so it will take some time for me to get up to speed...

But I am soliciting collaboration in all aspects.  So have fun.

---

[![Build Status](https://travis-ci.org/jnode-revisited/jnode.svg?branch=master)](https://travis-ci.org/jnode-revisited/jnode)

In this file, you find the instructions needed to setup a JNode development environment.

## Screenshot
![image](https://user-images.githubusercontent.com/120995695/219909079-cb5eb46b-0503-410e-874f-1ae22c227d1e.png)

## Sub-Projects

JNode has been divided into several sub-projects in order to keep it "accessible". These sub-projects are:

*JNode-All*    The root project where everything comes together  
*JNode-Cli*    Various command line commands  
*JNode-Core*   The core java classes, the Virtual Machine, the OS kernel and the Driver framework  
*JNode-Distr*  Tools and apps needed for a JNode "distribution"  
*JNode-FS*     The Filesystems and the various block device drivers  
*JNode-GUI*    The AWT implementation and the various video & input device drivers  
*JNode-Net*    The Network implementation and the various network device drivers  
*JNode-Shell*  The Command line shell and several system commands  
*JNode-Sound*  Future work  
*JNode-Textui* Text based AWT interface  

Each sub-project has the same directory structure:

`<subprj>/build`       All build results   
`<subprj>/descriptors` All plugin descriptors  
`<subprj>/lib`         All sub-project specific libraries  
`<subprj>/src`         All sources   
`<subprj>/.classpath`  The eclipse classpath file  
`<subprj>/.project`    The eclipse project file  
`<subprj>/build.xml`   The Ant buildfile  
`<subprj>/build-tests.xml` The Ant buildfile for running all tests of this subproject  

## Eclipse

JNode is usually developed in Eclipse. (It can be done without)

The various sub-projects must be imported into eclipse. Since they reference each other, it is advisably to import them all at the same time
using `Import -> Existing projects into workspace`.

As the code has not been modified, it should still work in Eclipse...

## IntelliJ, Netbeans and Gradle

There had seemed to be some interest in compiling this with Gradle.  I am not against that.
My preferred IDE is IDEA, and netbeans (13 now, or whatever version would be compatible) is second place.

## Building

Execute:

*On Windows*:  build.bat cd-x86-lite  
*On Linux*:    build.sh cd-x86-lite  

Or in Eclipse, execute the "cd-x86-lite" target of all/build.xml.

The build will result in the following files:

`all/build/cdroms/jnode-x86-lite.iso`         bootable CD image  
`all/build/cdroms/jnode-x86-lite.iso.vmx`     VMWare configuration file  

## Running

*On VMWare*: Open `all/build/cdroms/jnode-x86-lite.iso.vmx` and click Start.  
*On Linux*:  `qemu.sh`  

## Questions

If you have any questions, please post them to the [Github Discussions](https://github.com/jnode-revisited/jnode/discussions) tab.
 
 -- The JNode-revisited Team --
 

# MoonLodge_Contract
Group E   


# Using this repo as a dependency
[**Find newest version here**](http://rasmuslynge.com:8081/#artifact/dk.cphbusiness.lsd.groupe.moonloodge/MoonLodgeContract) (can only be opened with http connection. firefox works)

This project can be used as a Java dependency 

Copy this into the pom file of your project to use it:
```yml
<repositories>
    <repository>
        <id>lsd-repository</id>          
        <name>Internet mirror for rasmuslynge.com</name>
        <url>http://rasmuslynge.com:8081/repository/internal/</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>dk.cphbusiness.lsd.groupe.moonloodge</groupId>
        <artifactId>MoonLodgeContract</artifactId>
        <version>1.1.5</version>
    </dependency>
</dependencies>
```

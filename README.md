# MoonLodge_Assigment3  
Group E  

- [Logic Data Model](https://github.com/LargeSystemsDevelopment2020/MoonLodge/blob/master/diagrams/LogicDataModel.md)

- [Use Case Model](https://github.com/LargeSystemsDevelopment2020/MoonLodge/blob/master/diagrams/UseCase.md)

- [Sequence Diagram](https://github.com/LargeSystemsDevelopment2020/MoonLodge/blob/master/diagrams/SequenceDiagram.md)  


# Using this repo as a dependency

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
        <version>1.0.0</version>
    </dependency>
</dependencies>
```

## 项目描述
本项目旨在促进校园内的信息流通，实现学生之间的高效沟通。通过提供一个生产和阅读内容的平台，学生可以便捷地发布与获取最新的校园信息。此平台不仅有助于信息的快速传播，还能提高学生之间的互动效率，营造一个更加紧密和高效的校园社区。

## 项目技术栈




## 项目结构
``` shell
.
├── TJU-campus-basic
│ └── TJU-campus-starter
│     └── src
│         ├── main
│         │ ├── java
│         │ │ └── com/shawen/file
│         │ │     └── config
│         │ │     └── service
│         │ │         └── impl
│         │ └── resources
│         │     └── META-INF
│         └── test
│             └── java
├── TJU-campus-common
│ └── src
│     ├── main
│     │ ├── java
│     │ │ └── com
│     │ │     └── shawen
│     │ │         └── common
│     │ │             ├── constants
│     │ │             ├── exception
│     │ │             ├── jackson
│     │ │             ├── redis
│     │ │             └── swagger
│     │ └── resources
│     │     └── META-INF
│     └── test
│         └── java
├── TJU-campus-feign-api
│ └── src
│     ├── main
│     │ ├── java
│     │ │ └── com
│     │ │     └── shawen
│     │ │         └── apis
│     │ │             ├── article
│     │ │             │ └── fallback
│     │ │             ├── schedule
│     │ │             └── wemedia
│     │ └── resources
│     └── test
│         └── java
├── TJU-campus-gateway
│ ├── TJU-campus-app-gateway
│ │ └── src
│ │     ├── main
│ │     │ ├── java
│ │     │ │ └── com
│ │     │ │     └── shawen
│ │     │ │         └── app
│ │     │ │             └── gateway
│ │     │ │                 ├── filter
│ │     │ │                 └── util
│ │     │ └── resources
│ │     └── test
│ │         └── java
│ └── TJU-campus-wemedia-gateway
│     └── src
│         ├── main
│         │ ├── java
│         │ │ └── com
│         │ │     └── shawen
│         │ │         └── wemedia
│         │ │             └── gateway
│         │ │                 ├── filter
│         │ │                 └── util
│         │ └── resources
│         └── test
│             └── java
├── TJU-campus-model
│ └── src
│     ├── main
│     │ └── java
│     │     └── com
│     │         └── shawen
│     │             └── model
│     │                 ├── article
│     │                 │ ├── dtos
│     │                 │ ├── pojos
│     │                 │ └── vos
│     │                 ├── behavior
│     │                 │ └── dtos
│     │                 ├── common
│     │                 │ ├── annotation
│     │                 │ ├── dtos
│     │                 │ └── enums
│     │                 ├── mess
│     │                 ├── schedule
│     │                 │ ├── dtos
│     │                 │ └── pojos
│     │                 ├── search
│     │                 │ ├── dtos
│     │                 │ └── vos
│     │                 ├── user
│     │                 │ ├── dtos
│     │                 │ └── pojos
│     │                 └── wemedia
│     │                     ├── dtos
│     │                     └── pojos
│     └── test
│         └── java
├── TJU-campus-service
│ ├── TJU-campus-article
│ │ ├── logs
│ │ └── src
│ │     ├── main
│ │     │ ├── java
│ │     │ │ └── com
│ │     │ │     └── shawen
│ │     │ │         └── article
│ │     │ │             ├── config
│ │     │ │             ├── controller
│ │     │ │             │ └── v1
│ │     │ │             ├── feign
│ │     │ │             ├── job
│ │     │ │             ├── listener
│ │     │ │             ├── mapper
│ │     │ │             ├── service
│ │     │ │             │ └── impl
│ │     │ │             └── stream
│ │     │ └── resources
│ │     │     ├── mapper
│ │     │     └── templates
│ │     └── test
│ │         └── java
│ │             └── com
│ │                 └── shawen
│ │                     └── article
│ │                         ├── service
│ │                         │ └── impl
│ │                         └── test
│ ├── TJU-campus-behavior
│ │ └── src
│ │     └── main
│ │         ├── java
│ │         │ └── com
│ │         │     └── shawen
│ │         │         └── behavior
│ │         │             ├── config
│ │         │             ├── controller
│ │         │             │ └── v1
│ │         │             ├── interceptor
│ │         │             └── service
│ │         │                 └── impl
│ │         └── resources
│ ├── TJU-campus-schedule
│ │ └── src
│ │     ├── main
│ │     ├── java
│ │     │ └── com
│ │     │     └── shawen
│ │     │         └── schedule
│ │     │             ├── feign
│ │     │             ├── mapper
│ │     │             └── service
│ │     │                 └── impl
│ │     └── resources
│ │         └── mapper
│ ├── TJU-campus-user
│ │ └── src
│ │     ├── main
│ │     │ ├── java
│ │     │ │ └── com/shawen/user
│ │     │ │     └── config
│ │     │ │     ├── controller
│ │     │ │     │ └── v1
│ │     │ │     ├── mapper
│ │     │ │     └── service
│ │     │ │         └── impl
│ │     │ └── resources
│ │     └── test
│ │         └── java
│ └── TJU-campus-wemedia
│     └── src
│         ├── main
│         │ ├── java
│         │ │ └── com
│         │ │     └── shawen
│         │ │         └── wemedia
│         │ │             ├── config
│         │ │             ├── controller
│         │ │             │ └── v1
│         │ │             ├── feign
│         │ │             ├── interceptor
│         │ │             ├── mapper
│         │ │             └── service
│         │ │                 └── impl
│         │ └── resources
│         │     └── mapper
│         └── test
│             └── java
│                 └── com
│                     └── shawen
│                         └── wemedia
│                             └── service
├── TJU-campus-test
│ ├── es-init
│ │ └── src
│ │     ├── main
│ │     │ ├── java
│ │     │ │ └── com
│ │     │ │     └── shawen
│ │     │ │         └── es
│ │     │ │             ├── config
│ │     │ │             ├── mapper
│ │     │ │             └── pojo
│ │     │ └── resources
│ │     │     └── mapper
│ │     └── test
│ │         └── java
│ │             └── com
│ │                 └── shawen
│ │                     └── es
│ ├── freemarker-demo
│ │ └── src
│ │     ├── main
│ │     │ ├── java
│ │     │ │ └── com
│ │     │ │     └── shawen
│ │     │ │         └── freemarker
│ │     │ │             ├── controller
│ │     │ │             └── entity
│ │     │ └── resources
│ │     │     └── templates
│ │     └── test
│ │         └── java
│ │             └── com
│ │                 └── shawen
│ │                     └── freemarker
│ │                         └── test
│ ├── kafka-demo
│ │ └── src
│ │     ├── main
│ │     │ ├── java
│ │     │ │ └── com
│ │     │ │     └── shawen
│ │     │ │         └── kafka
│ │     │ │             ├── controller
│ │     │ │             ├── listener
│ │     │ │             ├── pojo
│ │     │ │             └── sample
│ │     │ └── resources
│ │     └── test
│ │         └── java
│ └── minio-demo
│     └── src
│         ├── main
│         │ ├── java
│         │ │ └── com
│         │ │     └── shawen
│         │ │         └── minio
│         │ └── resources
│         └── test
│             └── java
│                 └── com
│                     └── shawen
│                         └── minio
│                             └── test
├── TJU-campus-utils
│ └── src
│     ├── main
│     │ └── java
│     │     └── com
│     │         └── shawen
│     │             └── utils
│     │                 ├── common
│     │                 └── thread
│     └── test
│         └── java
├── app-web
│ └── static
│     └── images
│         ├── buttons
│         ├── login
│         ├── menus
│         └── menus_active
├── logs
└── wemedia-web
    └── static
        ├── css
        ├── fonts
        ├── img
        ├── js
        └── tinymce

```
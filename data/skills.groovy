resume {
  skills {
    leadership {
      children {
        business_analysis
        product_development
        project_management
        domain_modeling
        finance
        sales
        mentor
        math { label = 'Math' }
        communication
        compsci { label = 'CompSci' }
      }
    }
    programming {
      children {
        php
        jdk {
          label = 'JDK'
          children {
            java
            groovy
            kotlin
            xtend
            xtext
            spring
          }
        }
        python
        cpp {
          label = 'C/C++'
          children {
            android_ndk { label = 'NDK' }
            unreal_engine
          }
        }
        cs { label = 'C#/.NET' }
        rust
        test {
          label = 'Testing'
          children {
            serenity_bdd { label = 'Serenity BDD' }
            cucumber
            mocha
            jbehave { label = 'JBehave' }
          }
        }
        nodejs {
          children {
            redux
            sagasjs
            flow
            expressjs
            typescript
            loopback_4
            express
          }
        }
        closure_compiler
        flash {
          children {
            flex { label = 'Flex' }
            as3 { label = 'Actionscript' }
          }
        }
      }
    }
    ux {
      label = 'UI/UX'
      children {
        dataviz { label = 'DataViz' }
        mobile {
          label = 'Mobile'
          children {
            air { label = 'Adobe AIR' }
            gvr { label = 'GVR/Oculus' }
            android
            ios { label = 'iOS' }
          }
        }
        web {
          label = 'Web'
          children {
            html5 { label = 'HTML5' }
            pwa { label = 'PWA' }
            react
            nextjs { label = 'Next.js' }
            svelte
            vue
            vite
            jquery_mobile { label = 'jQuery' }
            bootstrap
            createjs
          }
        }
      }
    }
    systems {
      children {
        lsp { label = 'LSP' }
        sys_admin { label = 'Administrator' }
        database {
          label = 'Database'
          children {
            mysql { label = 'MySQL' }
            postgres { label = 'Postgresql' }
            msql { label = 'MS SQL' }
          }
        }
        api {
          label = 'API'
          children {
            rest { label = 'REST' }
            soap { label = 'SOAP' }
            scorm { label = 'SCORM' }
            oauth2 { label = 'OAuth 2' }
            servicenow { label = 'ServiceNow' }
            google_sheets
            emf { label = 'EMF/ECore' }
          }
        }
        devops {
          label = 'DevOps'
          children {
            jenkins
            apache_ant
            gradle_plugin { label = 'Gradle' }
            aws { label = 'AWS' }
            gcs { label = 'GCS' }
            digitalocean
            kubernetes
            stackstorm
            terraform
            vault
            microservices
            tomcat
            linux
            windows
          }
        }
        ecommerce {
          label = 'eCommerce'
          children { magento }
        }
      }
    }
  }
}

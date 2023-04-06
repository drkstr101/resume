resume {
    skills {
        leadership {
            children {
                business_analysis
                product_development
                project_management
                domain_modeling
                finance
                maths { label = 'Mathematics' }
                communication
                compsci { label = 'CompSci' }
                sys_admin { label = 'Administrator' }
                sales
                mentor
            }
        }
        programming {
            children {
                php
                jdk {
                    label = 'Java JDK'
                    children {
                        groovy
                        kotlin
                        xtend
                        spring
                    }
                }
                python
                cpp {
                    label = 'C/C++'
                    children {
                        android_ndk { label = 'Android NDK' }
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
                        react
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
                jquery_mobile { label = 'jQuery Mobile' }
                bootstrap
                createjs
                flash {
                    children {
                        flex { label = 'Apache Flex' }
                        as3 { label = 'Actionscript 3' }
                    }
                }
            }
        }
        ux {
            label = 'UI/UX Design'
            children {
                dataviz { label = 'Data Visualization' }
                html5 { label = 'HTML5/CSS3' }
                mobile {
                    label = 'Mobile Applications'
                    children {
                        air { label = 'Adobe AIR' }
                        gvr { label = 'GVR/Oculus' }
                        android
                        ios { label = 'iOS' }
                    }
                }
                web {
                    label = 'Web Applications'
                    children {
                        htm5 { label = 'HTML5' }
                        pwa { label = 'Progressive Web Apps' }
                    }
                }
            }
        }
        systems {
            children {
                database {
                    label = 'Databases'
                    children {
                        mysql { label = 'MySQL/Maria' }
                        postgres { label = 'Postgresql' }
                        msql { label = 'MS SQL Server' }
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
                        aws { label = 'Amazon Web Services' }
                        gcs { label = 'Google Cloud Services' }
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

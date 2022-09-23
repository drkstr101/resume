  /* groovylint-disable DuplicateListLiteral, DuplicateNumberLiteral, DuplicateStringLiteral, CompileStatic */
resume {
    accomplishments {
        ap_credits {
      type = 'Academic'
      startDate = calendar(2000)
      endDate = calendar(2002)
      description = '''
                Earned college credits through Advanced Placement classes in; Calculus (3),
                Computer Science (2), Speech & Debate (1), Macroeconomics (1)
            '''.stripIndent()
      skills = [
                'maths',
                'communication',
                'compsci'
            ]
      references = ['plano_east']
        }
        varsity_debate {
      type = 'Academic'
      startDate = calendar(2000)
      endDate = calendar(2002)
      description = '''
                Won multiple National Forensic League trophies for varsity debate in out-of-state
                competitions and tournaments
            '''.stripIndent()
      skills = ['communication']
      references = ['plano_east']
        }

        nokia_pppd {
      type = 'Personal'
      startDate = calendar(2003)
      description = '''
                Built a dialup ISP out of my home to provide internet access to my Nokia 9290
            '''.stripIndent()
      skills = ['linux', 'sys_admin']
        }
        gmailfs_howto {
      startDate = calendar(2006)
      type = 'Personal'
      description = '''
                Published the GMailFS HOWTO guide on mounting one’s Gmail account as a distributed
                *nix filesystem
            '''.stripIndent()
      skills = [
                'communication',
                'linux',
                'python'
            ]
      references = ['gmailfs_howto']
        }
        kate_as3 {
      startDate = calendar(2007)
      type = 'Personal'
      description = '''
                Wrote the syntax highlighting rules for Actionscript 3, included in KDevelop (Kate)
                3.5 release
            '''.stripIndent()
      skills = ['linux', 'as3']
        }
        digg_charts {
      type = 'Personal'
      startDate = calendar(2008)
      description = '''
                Created the DiggCharts app which won second place in the Digg.com API data visualizations contest
            '''.stripIndent()
      skills = ['flex', 'as3', 'dataviz']
      references = ['digg_api_contest']
        }
        cartoonifyit {
      type = 'Personal'
      startDate = calendar(2020, 1)
      startDate = calendar(2020, 4)
      description = '''
                Developing an Augmented Reality (AR) demo application with Rust and Android NDK
            '''.stripIndent()
      skills = [
                'mobile',
                'android_ndk',
                'rust',
                'cpp'
            ]
      references = ['cartoonifyit']
        }
        earthnewmedia {
      type = 'Personal'
      startDate = calendar(2019, 10)
      startDate = calendar(2020, 05)
      description = '''
                Creating a feterated social media app from scratch as a teaching tool to help a friend learn
                to develop software
            '''.stripIndent()
      skills = [
                'domain_modeling',
                'ux',
                'product_development',
                'business_analysis',
                'sagasjs',
                'bootstrap',
                'rest',
                'serenity_bdd',
                'typescript',
                'loopback_4'
            ]
        }

        childrens_center {
      type = 'Volunteer'
      startDate = calendar(2000)
      description = '''
                Laid underground sprinklers and built pipe valve mechanisms for Richland Children’s Center
            '''.stripIndent()
      skills = ['leadership']
        }
        playground_of_dreams {
      type = 'Volunteer'
      startDate = calendar(2000)
      description = '''
                Read blueprints and directed volunteer work crew to construct wooden playground equipment,
                suggested by my teacher/mentor as extra credit in Advanced Engineering & Design class
            '''.stripIndent()
      skills = ['leadership']
        }

        obi_org {
      startDate = calendar(2007, 1)
      endDate = calendar(2011, 2)
      type = 'Professional'
      description = '''
                Co-founder and CTO of small (3-5 employee) software development consultancy
            '''.stripIndent()
      skills = [
                'business_analysis',
                'product_development',
                'project_management',
                'communication',
                'sales'
            ]
        }
        obi_team08 {
      type = 'Professional'
      startDate = calendar(2007, 8)
      endDate = calendar(2008, 10)
      description = '''
        - Developed a Fullstack system to enabled custom snowboard designs to be created and
          purchased in online store
        - Integrated back-end database systems with CAD manufacturing systems
          to automatically produce working specs from the custom design builder
          in web front-end
      '''.stripIndent()
      skills = [
                'flex',
                'as3',
                'php',
                'magento',
                'linux',
                'mysql',
                'sys_admin'
            ]
        }
        obi_allstudent {
      type = 'Professional'
      startDate = calendar(2008)
      endDate = calendar(2009)
      description = '''
                Created client-server marketplace of rental properties for the winner of the "Best Business Idea" contest at California State University
            '''.stripIndent()
      skills = [
                'product_development',
                'project_management',
                'ux',
                'flex',
                'as3',
                'html5',
                'sys_admin',
                'postgres',
                'linux'
            ]
        }
        obi_demandlending {
      type = 'Professional'
      startDate = calendar(2009, 1)
      endDate = calendar(2010, 04)
      description = '''
                Designed and developed the software systems for the flagship product of a Direct Lending startup
            '''.stripIndent()
      skills = [
                'product_development',
                'project_management',
                'domain_modeling',
                'postgres',
                'linux',
                'maths'
            ]
        }
        obi_nulabel {
      type = 'Professional'
      startDate = calendar(2010)
      endDate = calendar(2011)
      description = '''
                Worked with Director of Science to develop database-driven software systems that replaced existing spreadsheet-based workflow in use by the lab techs
            '''.stripIndent()
      skills = [
                'business_analysis',
                'product_development',
                'project_management',
                'jenkins',
                'microservices',
                'ux',
                'jdk',
                'tomcat',
                'oauth2',
                'htm5',
                'python',
                'apache_ant',
                'domain_modeling',
                'maths',
                'compsci'
            ]
        }
        vivid_programmer_ii {
          type = 'Professional'
          startDate = calendar(2010)
          endDate = calendar(2012)
          description = '''
              - Implemented mobile compatible front-end architecture to bring a flagship product to the App/Play Store
              - Maintained existing flagship product that delivers and tracks the usage of rich media content for
                Computer-Aided Learning ("eLearning")
          '''.stripIndent()
          skills = ['ux', 'flex', 'as3', 'air', 'scorm', 'python', 'apache_ant', 'scorm', 'android', 'ios']
        }
        vivid_sr_programmer {
          type = 'Professional'
          startDate = calendar(2012)
          endDate = calendar(2017)
          description = '''
            - Developed prototype mobile VR app used by the sales team to entice potential customers at trade shows
            - Automated workflow for production department and drove the adoption of Continuous Integration into the
              development process
            - Designed and developed front end framework to enable the production of Computer Aided Learning content
              as a fully Progressive Web App, eliminating the reliance on Flash/Air runtimes in flagship product
            - Created prototype data service-oriented back-end architecture that supports user authentication and
              tracking for deployment scenarios outside a traditional LMS web portal, later adopted by another team
              as the basis for a rewrite to the backend LMS product
        '''.stripIndent()
          skills = [
                    'as3',
                    'mobile',
                    'cpp',
                    'jdk',
                    'android_ndk',
                    'gvr',
                    'apache_ant',
                    'ios',
                    'sys_admin',
                    'groovy',
                    'gradle_plugin',
                    'jenkins',
                    'microservices',
                    'linux',
                    'windows',
                    'cs',
                    'pwa',
                    'html5',
                    'msql',
                    'nodejs',
                    'test',
                    'mocha',
                    'mentor',
                    'createjs'
                ]
        }
        catalyte_surge {
          type = 'Professional'
          startDate = calendar(2017)
          endDate = calendar(2018)
          description = '''
              - Removed primary blockers and reduced runtime memory footprint by an order of magnitude in an Electronic Medical Record (EMR) web application
              - Developed client-side module and built a release system for custom 2FA authentication, when using the AWS Command Line Interface within Emory University's internal network
          '''.stripIndent()
          skills = [
              'microservices',
              'rest',
              'nodejs',
              'html5',
              'expressjs',
              'react',
              'redux',
              'sagasjs',
              'typescript',
              'aws',
              'soap',
              'gradle_plugin',
              'jdk',
              'groovy',
              'domain_modeling'
          ]
        }
        expedia_group {
          type = 'Professional'
          startDate = calendar(2018, 06)
          startDate = calendar(2019, 02)
          description = '''
              - Reduced maintenance cost by aiding in the transition of a legacy monolith project to a more modern automation framework
              - Improved the efficiency of Stackstorm pack development by building and maintaining an automated acceptance testing and specification framework
          '''.stripIndent()
          skills = [
            'devops',
            'vault',
            'servicenow',
            'microservices',
            'kubernetes',
            'cs',
            'python',
            'gradle_plugin',
            'stackstorm',
            'serenity_bdd',
            'groovy',
            'aws'
          ]
        }
        watheia_org {
      type = 'Professional'
      startDate = calendar(2019, 10)
      endDate = calendar(2022, 5)
      description = '''
                - Developed and produced a majority of the Lean Business Plan document, including an initial target market, product, sales/marketing, and pricing strategies
                - Identified talents and negotiated partnerships to fill the roles of CFO and COO, to delegate responsibilities for legal, accounting, business development and growth
                - Developed a basic reproducible sales process as a starting point used to train and onboard the COO, aiding them in the pursuit of sales growth
                - Created an append-only accounting system and tooling using a combination of plain text files, HLedger, and Git
                - Developed proprietary project estimation and pricing tools using the Eclipse Modeling Framework (EMF), accounted for as IP Assets in the main ledger and providing the primary competitive advantage for the company
            '''.stripIndent()
      skills = [
                'business_analysis',
                'product_development',
                'project_management',
                'domain_modeling',
                'communication',
                'sales',
                'mentor'
            ]
        }
        watheia_sys {
      type = 'Professional'
      startDate = calendar(2019, 10)
      endDate = calendar(2020, 6)
      description = '''
                - Created an append-only accounting system and tooling using a combination
                  of plain text files, HLedger, and Git
            - Developed proprietary project estimation and pricing tools using the
                  Eclipse Modeling Framework (EMF), accounted for as IP Assets in the main
                  ledger and providing the primary competitive advantage for the company
                - Developed a collection of integrated Gradle plugins for static website
                  development and publication
                - Developed Augmented Reality (AR) demo with Rust and Android NDK
                - Developing feterated social media app from scratch as a teaching tool to
                  help a friend learn to program
            '''.stripIndent()
      skills = [
                'terraform',
                'kubernetes',
                'aws',
                'gcs',
                'gradle_plugin',
                'groovy',
                'spring',
                'emf',
                'html5',
                'closure_compiler',
                'bootstrap',
                'serenity_bdd',
                'ux',
                'mobile',
                'web',
                'rust',
                'cpp',
                'android_ndk',
                'domain_modeling',
                'mentor',
                'react',
                'redux',
                'sagasjs',
                'html5',
                'rest',
                'typescript',
                'loopback_4'
            ]
        }
        natural {
      type = 'Professional'
      startDate = calendar(2020, 2)
      endDate = calendar(2020, 7)
      description = '''
                 ...
            '''.stripIndent()
        }
        eclipse_xtext {
      startDate = calendar(2020, 5)
      endDate = calendar(2020, 7)
      type = 'Professional'
      description = '''
                TODO ...
            '''.stripIndent()
        }
        sb_editor {
      startDate = calendar(2022, 1)
      endDate = calendar(2022, 8)
      type = 'Professional'
      description = '''
                TODO ...
            '''.stripIndent()
      skills = [
                'ux',
                'web',
                'react',
                'redux',
                'rest',
                'typescript',
                'express'
            ]
        }
    }
}

resume {
	skills {
		leadership {
			children {
				business_analysis
				product_development
				project_management
				domain_modeling
				finance
				mathematics
				communication
			}
		}
		programming {
			children {
				web {
					label = "Web Applications"
					children {
						pwa { label = "Progressive Web Apps" }
						closure_compiler
						jquery_mobile { label = "jQuery Mobile" }
						bootstrap
						createjs
						nodejs {
							children {
								react { label = "Rect/Redux" }
								flow
								expressjs
								typescript
							}
						}
					}
				}
				flash {
					children {
						flex { label = "Apache Flex" }
						as3 { label = "Actionscript 3" }
					}
				}
				php
				jdk {
					label = "Java JDK"
					children {
						groovy
						kotlin
						xtend
					}
				}
				python
				cpp
				cs
				rust
			}
		}
		ux {
			label = "UI/UX"
			children {
				dataviz { label = "Data Visualization" }
				html5 { label = "HTML5/CSS3" }
				flash { label = "Adobe Flash/Animate" }
			}
		}
		systems {
			children {
				database {
					children {
						mysql { label = "MySQL/Maria" }
						postgres { label = "Postgresql" }
						msql { label = "MS SQL Server" }
					}
				}
				api {
					label = "API"
					children {
						rest { label = "REST" }
						soap { label = "SOAP" }
						scorm { label = "SCORM" }
						oauth2 { label = "OAuth 2" }
						vault
						servicenow { label = "ServiceNow" }
						google_sheets
						emf { label = "EMF/ECore" }
					}
				}
				mobile {
					children {
						air { label = "Adobe AIR" }
						unreal_engine
						gvr { label = "GVR/Oculus" }
						android_ndk { label = "Android NDK" }
					}
				}
				ecommerce {
					label = "eCommerce"
					children { magento }
				}
			}
		}
		devops {
			label = "DevOps"
			children {
				jenkins
				apache_ant
				gradle
				aws { label = "Amazon Web Services" }
				gcs { label = "Google Cloud Services" }
				kubernetes
				stackstorm
				terraform
			}
		}
	}
}
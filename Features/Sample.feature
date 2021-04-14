 #Feature: lambdatest check for browsers
  #@Browsers
  #Scenario Outline: Check for mobile
    #Given I should give "<username>" and "<accesskey>"
    #When the access given i should set the capabilities for browsers as "<browserName>" ,"<version>","<resolution>","<platform>","<idleTimeout>","<network>","<visual>","<video>","<console>","<build>","<name>"
    #And i should get the url and set the driver
    #And i should click on first element
    #And i should click on second element
    #And send the keys to add item as "<keystoadd>"  
    #Then I should click on add button
#
    #Examples: 
      #| username  | accesskey | browserName | version | resolution | platform | idleTimeout | network | visual | video | console | build | name | keystoadd | 
#			|spandana.rajamahanthi|btBxjq0dTSFIqdnl8rT4XNIRewahqZsVTpotI5ZSsLlIXGXJQX|Chrome|75.0|1024x768|Windows 10|270|true|true|true|true|build1BDD|test1BDD|Yey, Let's add it to list|
  #
  #Scenario Outline: Check for mobile
    #Given I should give "<username>" and "<accesskey>" for mobiles
    #When the access given i should set the capabilities for mobiles as "<browserName>" ,"<appiumversion>","<platformVersion>","<platformName>","<deviceName>","<network>","<visual>","<video>","<console>","<build>","<name>"
    #And i should get the url and set the driver for mobiles
    #And i should give the keys
    #And i should click on search
    #Then I should close the driver
#
    #Examples: 
      #| username  | accesskey | browserName | appiumversion | platformVersion | platformName | deviceName | network | visual | video | console | build | name |
#			|spandana.rajamahanthi|btBxjq0dTSFIqdnl8rT4XNIRewahqZsVTpotI5ZSsLlIXGXJQX|Chrome|1.17.1|8|Android|One Plus 5|true|true|true|true|mobilebuild1BDD|mobiletest1BDD|
#			|spandana.rajamahanthi|btBxjq0dTSFIqdnl8rT4XNIRewahqZsVTpotI5ZSsLlIXGXJQX|Chrome|1.12.1|8|Android|One Plus 5|true|true|true|true|mobilebuild1BDD|mobiletest1BDD|	
#		
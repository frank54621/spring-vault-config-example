# spring-vault-config.example
This is a sample application which retrieves secrets from Spring vault.

## Install Vault server
*  Download vault  from https://www.vaultproject.io/downloads/
*  Extract the zip file 
*  Run Vault server using following command in a command window
   vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"
*  In another command window run following commands
     vault kv put secret/spring-vault-config-example springvault.test.username=someuser springvault.test.password=somepassword
     vault kv get secret/spring-vault-config-example 

## Building the jar file
* clone (git) the project into a folder in file system
* Run gradle build
* Jar file is created in build/libs folder
* Execute jar file 
java -jar spring-vault-config-example-0.0.1-SNAPSHOT.jar
* System would display the values for username and password from the vault


### Integration with HashiCorp [Vault](https://www.vaultproject.io/), a tool designed for securely managing sensitive data.


#### Spring Vault is a module within the Spring Framework ecosystem that provides integration with HashiCorp Vault, a tool designed for securely managing sensitive data. Vault allows you to store and access secrets such as passwords, API keys, and certificates in a centralized and secure manner.

#### Dependency 

```bash
Java 21    
Spring Boot: 3.2.0
Spring Cloud: 2023.0.0  
Spring Vault: 4.1.0

```

[Download and install Vault](https://developer.hashicorp.com/vault/install)


#### Start vault server
$ server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"

#### First, you need to set two environment variables to point the Vault CLI to the Vault endpoint and provide an authentication token.

$ export export VAULT_TOKEN="00000000-0000-0000-0000-000000000000"
$ export VAULT_ADDR="http://127.0.0.1:8200"

#### Now you can store a configuration key-value pairs inside Vault:

$ vault kv put secret/vault example.username=estevam example.password=estevam

$ vault kv put secret/vault/cloud example.username=cloud_user example.password=cloud_password
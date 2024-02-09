
### Reference Documentation

#### Spring boot application that retrieves its configuration properties from HashiCorp [Vault.](https://www.vaultproject.io/)

#### Dependency 

```bash
Java 21    
Spring Boot: 3.2.0
Spring Cloud: 2023.0.0  
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
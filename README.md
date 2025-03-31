# Automation Store Passwords In Vaults

This project demonstrates how to securely store and retrieve passwords using Azure Key Vault within a Java application. It includes utility classes for reading configurations, interacting with Azure Key Vault, and general-purpose utilities.

## Table of Contents

- [Project Overview](#project-overview)
- [Prerequisites](#prerequisites)
- [Configuration](#configuration)
- [Key Classes and Files](#key-classes-and-files)
  - [PropertyReader.java](#propertyreaderjava)
  - [Util.java](#utiljava)
  - [ImprovedKeyvault.java](#improvedkeyvaultjava)
  - [config.properties](#configproperties)
  - [pom.xml](#pomxml)
- [Setting Up Azure Key Vault](#setting-up-azure-key-vault)
- [Adding Secrets to Azure Key Vault](#adding-secrets-to-azure-key-vault)
- [Usage](#usage)
- [License](#license)

## Project Overview

The project provides a framework for integrating Azure Key Vault into Java applications to manage sensitive information securely. By leveraging Azure Key Vault, applications can maintain secrets such as passwords, API keys, and certificates outside of the source code, enhancing security and maintainability.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven for project build and dependency management
- An active [Azure DevOps account](https://azure.microsoft.com/en-us/services/devops/)
- Azure CLI installed for managing Azure resources

## Configuration

Configuration settings for the application are managed in the `config.properties` file. This file includes parameters such as Azure Key Vault name, client ID, client secret, and tenant ID. Ensure that this file is populated with the correct values corresponding to your Azure setup.

## Key Classes and Files

### PropertyReader.java

A utility class responsible for reading configuration properties from the `config.properties` file. It provides methods to load properties and retrieve their values, facilitating easy access to configuration settings throughout the application.

### Util.java

Contains general-purpose utility methods used across the application. This includes helper functions for string manipulation, logging, and other common tasks that support the core functionality of the application.

### ImprovedKeyvault.java

This class encapsulates the logic for interacting with Azure Key Vault. It includes methods for authenticating with Azure, retrieving secrets, and handling exceptions related to Key Vault operations. The class leverages Azure SDKs to facilitate secure communication with Azure services.

### config.properties

A configuration file that holds key-value pairs for various settings required by the application. This includes Azure-specific configurations such as Key Vault name, client credentials, and other parameters necessary for the application's operation.

### pom.xml

The Maven Project Object Model file that manages project dependencies, build configurations, and plugins. It includes dependencies for Azure SDKs, logging frameworks, and other libraries utilized by the application.

## Setting Up Azure Key Vault

To configure Azure Key Vault for use with this application, follow these steps:

1. **Azure DevOps Account**: Ensure you have an active [Azure DevOps account](https://azure.microsoft.com/en-us/services/devops/).

2. **Create a New Key Vault**:
   - Navigate to the [Azure Portal](https://portal.azure.com/).
   - Create a new Key Vault resource.
   - Set the permission model to "Vault access policy" during creation.

3. **Add Role Assignments to Your Key Vault (IAM)**:
   - Go to the "Access control (IAM)" section of your Key Vault.
   - Click the "Add" button to add role assignments:
     - **Key Vault Administrator**: Grants full access to manage Key Vaults.
     - **Key Vault Reader**: Allows read-only access to Key Vaults.
     - **Key Vault Secrets User**: Permits retrieval of secrets from Key Vaults.

   For detailed instructions on assigning roles, refer to [Assign Azure roles using the Azure portal](https://learn.microsoft.com/en-us/azure/role-based-access-control/role-assignments-portal).

4. **App Registration in Microsoft Entra ID**:
   - Register a new application in Microsoft Entra ID (formerly Azure Active Directory).
   - Generate a client secret for the application to authenticate and obtain Azure tokens for communication with Azure services.

5. **Assign Access Policies to Your App**:
   - Navigate to your Key Vault in the Azure Portal.
   - Add an access policy for your registered application.
   - Grant "Get" and "List" permissions to allow the application to retrieve and enumerate secrets.

   For more information on assigning access policies, see [Assign an Azure Key Vault access policy](https://learn.microsoft.com/en-us/azure/key-vault/general/assign-access-policy).

## Adding Secrets to Azure Key Vault

To add secrets to your Key Vault:

1. Navigate to the "Secrets" section of your Key Vault in the Azure Portal.
2. Click on "Generate/Import" to create a new secret.
3. Provide a name and value for the secret, corresponding to the sensitive information required by your application.

## Usage

After configuring Azure Key Vault and adding the necessary secrets, you can run the application. The application will retrieve configuration settings from the `config.properties` file and access secrets from Azure Key Vault as needed.

## License

This project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute this software in accordance with the license terms.

# Automation Store Passwords In Vaults

This project demonstrates how to securely store and retrieve passwords using Azure Key Vault within a Java application. It includes utility classes for reading configurations, interacting with Azure Key Vault, and general-purpose utilities.

## Table of Contents

- [Project Overview](#project-overview)
- [Prerequisites](#prerequisites)
- [Configuration](#configuration)
- [Key Classes and Files](#key-classes-and-files)
  - [PropertyReader.java](#propertyreaderjava)
  - [Util.java](#utiljava)
  - [ImprovedKeyvault.java](#improvedkeyvaultjava)
  - [config.properties](#configproperties)
  - [pom.xml](#pomxml)
- [Setting Up Azure Key Vault](#setting-up-azure-key-vault)
- [Adding Secrets to Azure Key Vault](#adding-secrets-to-azure-key-vault)
- [Usage](#usage)
- [License](#license)

## Project Overview

The project provides a framework for integrating Azure Key Vault into Java applications to manage sensitive information securely. By leveraging Azure Key Vault, applications can maintain secrets such as passwords, API keys, and certificates outside of the source code, enhancing security and maintainability.

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Maven for project build and dependency management
- An active [Azure DevOps account](https://azure.microsoft.com/en-us/services/devops/)
- Azure CLI installed for managing Azure resources

## Configuration

Configuration settings for the application are managed in the `config.properties` file. This file includes parameters such as Azure Key Vault name, client ID, client secret, and tenant ID. Ensure that this file is populated with the correct values corresponding to your Azure setup.

## Key Classes and Files

### PropertyReader.java

A utility class responsible for reading configuration properties from the `config.properties` file. It provides methods to load properties and retrieve their values, facilitating easy access to configuration settings throughout the application.

### Util.java

Contains general-purpose utility methods used across the application. This includes helper functions for string manipulation, logging, and other common tasks that support the core functionality of the application.

### ImprovedKeyvault.java

This class encapsulates the logic for interacting with Azure Key Vault. It includes methods for authenticating with Azure, retrieving secrets, and handling exceptions related to Key Vault operations. The class leverages Azure SDKs to facilitate secure communication with Azure services.

### config.properties

A configuration file that holds key-value pairs for various settings required by the application. This includes Azure-specific configurations such as Key Vault name, client credentials, and other parameters necessary for the application's operation.

### pom.xml

The Maven Project Object Model file that manages project dependencies, build configurations, and plugins. It includes dependencies for Azure SDKs, logging frameworks, and other libraries utilized by the application.

## Setting Up Azure Key Vault

To configure Azure Key Vault for use with this application, follow these steps:

1. **Azure DevOps Account**: Ensure you have an active [Azure DevOps account](https://azure.microsoft.com/en-us/services/devops/).

2. **Create a New Key Vault**:
   - Navigate to the [Azure Portal](https://portal.azure.com/).
   - Create a new Key Vault resource.
   - Set the permission model to "Vault access policy" during creation.

3. **Add Role Assignments to Your Key Vault (IAM)**:
   - Go to the "Access control (IAM)" section of your Key Vault.
   - Click the "Add" button to add role assignments:
     - **Key Vault Administrator**: Grants full access to manage Key Vaults.
     - **Key Vault Reader**: Allows read-only access to Key Vaults.
     - **Key Vault Secrets User**: Permits retrieval of secrets from Key Vaults.

   For detailed instructions on assigning roles, refer to [Assign Azure roles using the Azure portal](https://learn.microsoft.com/en-us/azure/role-based-access-control/role-assignments-portal).

4. **App Registration in Microsoft Entra ID**:
   - Register a new application in Microsoft Entra ID (formerly Azure Active Directory).
   - Generate a client secret for the application to authenticate and obtain Azure tokens for communication with Azure services.

5. **Assign Access Policies to Your App**:
   - Navigate to your Key Vault in the Azure Portal.
   - Add an access policy for your registered application.
   - Grant "Get" and "List" permissions to allow the application to retrieve and enumerate secrets.

   For more information on assigning access policies, see [Assign an Azure Key Vault access policy](https://learn.microsoft.com/en-us/azure/key-vault/general/assign-access-policy).

## Adding Secrets to Azure Key Vault

To add secrets to your Key Vault:

1. Navigate to the "Secrets" section of your Key Vault in the Azure Portal.
2. Click on "Generate/Import" to create a new secret.
3. Provide a name and value for the secret, corresponding to the sensitive information required by your application.

## Usage

After configuring Azure Key Vault and adding the necessary secrets, you can run the application. The application will retrieve configuration settings from the `config.properties` file and access secrets from Azure Key Vault as needed.


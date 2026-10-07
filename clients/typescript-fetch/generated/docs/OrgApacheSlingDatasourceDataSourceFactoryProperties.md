
# OrgApacheSlingDatasourceDataSourceFactoryProperties


## Properties

Name | Type
------------ | -------------
`datasourceName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`datasourceSvcPropName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`driverClassName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`url` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`username` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`password` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`defaultAutoCommit` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`defaultReadOnly` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`defaultTransactionIsolation` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`defaultCatalog` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`maxActive` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`maxIdle` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`minIdle` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`initialSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`maxWait` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`maxAge` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`testOnBorrow` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`testOnReturn` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`testWhileIdle` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`validationQuery` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`validationQueryTimeout` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`timeBetweenEvictionRunsMillis` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`minEvictableIdleTimeMillis` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`connectionProperties` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`initSQL` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jdbcInterceptors` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`validationInterval` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`logValidationErrors` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`datasourceSvcProperties` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { OrgApacheSlingDatasourceDataSourceFactoryProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "datasourceName": null,
  "datasourceSvcPropName": null,
  "driverClassName": null,
  "url": null,
  "username": null,
  "password": null,
  "defaultAutoCommit": null,
  "defaultReadOnly": null,
  "defaultTransactionIsolation": null,
  "defaultCatalog": null,
  "maxActive": null,
  "maxIdle": null,
  "minIdle": null,
  "initialSize": null,
  "maxWait": null,
  "maxAge": null,
  "testOnBorrow": null,
  "testOnReturn": null,
  "testWhileIdle": null,
  "validationQuery": null,
  "validationQueryTimeout": null,
  "timeBetweenEvictionRunsMillis": null,
  "minEvictableIdleTimeMillis": null,
  "connectionProperties": null,
  "initSQL": null,
  "jdbcInterceptors": null,
  "validationInterval": null,
  "logValidationErrors": null,
  "datasourceSvcProperties": null,
} satisfies OrgApacheSlingDatasourceDataSourceFactoryProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingDatasourceDataSourceFactoryProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



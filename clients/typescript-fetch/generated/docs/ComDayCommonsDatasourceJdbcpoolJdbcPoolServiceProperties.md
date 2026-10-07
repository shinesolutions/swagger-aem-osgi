
# ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties


## Properties

Name | Type
------------ | -------------
`jdbcDriverClass` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jdbcConnectionUri` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jdbcUsername` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jdbcPassword` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jdbcValidationQuery` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`defaultReadonly` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`defaultAutocommit` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`poolSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`poolMaxWaitMsec` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`datasourceName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`datasourceSvcProperties` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "jdbcDriverClass": null,
  "jdbcConnectionUri": null,
  "jdbcUsername": null,
  "jdbcPassword": null,
  "jdbcValidationQuery": null,
  "defaultReadonly": null,
  "defaultAutocommit": null,
  "poolSize": null,
  "poolMaxWaitMsec": null,
  "datasourceName": null,
  "datasourceSvcProperties": null,
} satisfies ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



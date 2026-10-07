
# OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties


## Properties

Name | Type
------------ | -------------
`datasourceName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`datasourceSvcPropName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`datasourceJndiName` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`jndiProperties` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "datasourceName": null,
  "datasourceSvcPropName": null,
  "datasourceJndiName": null,
  "jndiProperties": null,
} satisfies OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties


## Properties

Name | Type
------------ | -------------
`graniteWorkflowinboxSortPropertyName` | [ConfigNodePropertyDropDown](ConfigNodePropertyDropDown.md)
`graniteWorkflowinboxSortOrder` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`cqWorkflowJobRetry` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`cqWorkflowSuperuser` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`graniteWorkflowInboxQuerySize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`graniteWorkflowAdminUserGroupFilter` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`graniteWorkflowEnforceWorkitemAssigneePermissions` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`graniteWorkflowEnforceWorkflowInitiatorPermissions` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`graniteWorkflowInjectTenantIdInJobTopics` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`graniteWorkflowMaxPurgeSaveThreshold` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`graniteWorkflowMaxPurgeQueryCount` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)

## Example

```typescript
import type { ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "graniteWorkflowinboxSortPropertyName": null,
  "graniteWorkflowinboxSortOrder": null,
  "cqWorkflowJobRetry": null,
  "cqWorkflowSuperuser": null,
  "graniteWorkflowInboxQuerySize": null,
  "graniteWorkflowAdminUserGroupFilter": null,
  "graniteWorkflowEnforceWorkitemAssigneePermissions": null,
  "graniteWorkflowEnforceWorkflowInitiatorPermissions": null,
  "graniteWorkflowInjectTenantIdInJobTopics": null,
  "graniteWorkflowMaxPurgeSaveThreshold": null,
  "graniteWorkflowMaxPurgeQueryCount": null,
} satisfies ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



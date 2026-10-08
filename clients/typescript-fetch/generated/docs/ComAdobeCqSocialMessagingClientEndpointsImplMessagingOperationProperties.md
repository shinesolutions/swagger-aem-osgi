
# ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties


## Properties

Name | Type
------------ | -------------
`messageProperties` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`messageBoxSizeLimit` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`messageCountLimit` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`notifyFailure` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`failureMessageFrom` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`failureTemplatePath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`maxRetries` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`minWaitBetweenRetries` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`countUpdatePoolSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`inboxPath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`sentitemsPath` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`supportAttachments` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`supportGroupMessaging` | [ConfigNodePropertyBoolean](ConfigNodePropertyBoolean.md)
`maxTotalRecipients` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`batchSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`maxTotalAttachmentSize` | [ConfigNodePropertyInteger](ConfigNodePropertyInteger.md)
`attachmentTypeBlacklist` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`allowedAttachmentTypes` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)
`serviceSelector` | [ConfigNodePropertyString](ConfigNodePropertyString.md)
`fieldWhitelist` | [ConfigNodePropertyArray](ConfigNodePropertyArray.md)

## Example

```typescript
import type { ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "messageProperties": null,
  "messageBoxSizeLimit": null,
  "messageCountLimit": null,
  "notifyFailure": null,
  "failureMessageFrom": null,
  "failureTemplatePath": null,
  "maxRetries": null,
  "minWaitBetweenRetries": null,
  "countUpdatePoolSize": null,
  "inboxPath": null,
  "sentitemsPath": null,
  "supportAttachments": null,
  "supportGroupMessaging": null,
  "maxTotalRecipients": null,
  "batchSize": null,
  "maxTotalAttachmentSize": null,
  "attachmentTypeBlacklist": null,
  "allowedAttachmentTypes": null,
  "serviceSelector": null,
  "fieldWhitelist": null,
} satisfies ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



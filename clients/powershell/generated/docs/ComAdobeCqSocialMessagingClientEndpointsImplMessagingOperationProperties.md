# ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MessageProperties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**MessageBoxSizeLimit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MessageCountLimit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**NotifyFailure** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**FailureMessageFrom** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FailureTemplatePath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MaxRetries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MinWaitBetweenRetries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CountUpdatePoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**InboxPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SentitemsPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SupportAttachments** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SupportGroupMessaging** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**MaxTotalRecipients** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BatchSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxTotalAttachmentSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AttachmentTypeBlacklist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AllowedAttachmentTypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ServiceSelector** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FieldWhitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties  -MessageProperties null `
 -MessageBoxSizeLimit null `
 -MessageCountLimit null `
 -NotifyFailure null `
 -FailureMessageFrom null `
 -FailureTemplatePath null `
 -MaxRetries null `
 -MinWaitBetweenRetries null `
 -CountUpdatePoolSize null `
 -InboxPath null `
 -SentitemsPath null `
 -SupportAttachments null `
 -SupportGroupMessaging null `
 -MaxTotalRecipients null `
 -BatchSize null `
 -MaxTotalAttachmentSize null `
 -AttachmentTypeBlacklist null `
 -AllowedAttachmentTypes null `
 -ServiceSelector null `
 -FieldWhitelist null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


# ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EmailName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**EmailCreatePostFromReply** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**EmailAddCommentIdTo** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**EmailSubjectMaximumLength** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**EmailReplyToAddress** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**EmailReplyToDelimiter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**EmailTrackerIdPrefixInSubject** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**EmailTrackerIdPrefixInBody** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**EmailAsHTML** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**EmailDefaultUserName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**EmailTemplatesRootPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties  -EmailName null `
 -EmailCreatePostFromReply null `
 -EmailAddCommentIdTo null `
 -EmailSubjectMaximumLength null `
 -EmailReplyToAddress null `
 -EmailReplyToDelimiter null `
 -EmailTrackerIdPrefixInSubject null `
 -EmailTrackerIdPrefixInBody null `
 -EmailAsHTML null `
 -EmailDefaultUserName null `
 -EmailTemplatesRootPath null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


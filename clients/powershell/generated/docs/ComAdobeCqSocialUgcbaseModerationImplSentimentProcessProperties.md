# ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**WatchwordsPositive** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**WatchwordsNegative** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**WatchwordsPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SentimentPath** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties  -WatchwordsPositive null `
 -WatchwordsNegative null `
 -WatchwordsPath null `
 -SentimentPath null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


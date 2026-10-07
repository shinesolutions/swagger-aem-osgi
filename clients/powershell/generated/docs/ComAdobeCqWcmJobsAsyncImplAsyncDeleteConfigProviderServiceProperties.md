# ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**JobTopicName** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**EmailEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties = Initialize-PSOpenAPIToolsComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties  -Threshold null `
 -JobTopicName null `
 -EmailEnabled null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


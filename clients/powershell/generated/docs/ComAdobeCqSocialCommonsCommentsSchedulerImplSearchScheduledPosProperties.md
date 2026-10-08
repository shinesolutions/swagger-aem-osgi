# ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EnableScheduledPostsSearch** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**NumberOfMinutes** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxSearchLimit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties  -EnableScheduledPostsSearch null `
 -NumberOfMinutes null `
 -MaxSearchLimit null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


# ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CqDamWebdavVersionLinkingEnable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CqDamWebdavVersionLinkingSchedulerPeriod** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CqDamWebdavVersionLinkingStagingTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties = Initialize-PSOpenAPIToolsComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties  -CqDamWebdavVersionLinkingEnable null `
 -CqDamWebdavVersionLinkingSchedulerPeriod null `
 -CqDamWebdavVersionLinkingStagingTimeout null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


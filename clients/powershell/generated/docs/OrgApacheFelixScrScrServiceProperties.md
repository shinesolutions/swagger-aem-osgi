# OrgApacheFelixScrScrServiceProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DsLoglevel** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**DsFactoryEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DsDelayedKeepInstances** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DsLockTimeoutMilliseconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DsStopTimeoutMilliseconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DsGlobalExtender** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheFelixScrScrServiceProperties = Initialize-PSOpenAPIToolsOrgApacheFelixScrScrServiceProperties  -DsLoglevel null `
 -DsFactoryEnabled null `
 -DsDelayedKeepInstances null `
 -DsLockTimeoutMilliseconds null `
 -DsStopTimeoutMilliseconds null `
 -DsGlobalExtender null
```

- Convert the resource to JSON
```powershell
$OrgApacheFelixScrScrServiceProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


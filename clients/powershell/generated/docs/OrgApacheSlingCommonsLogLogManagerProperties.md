# OrgApacheSlingCommonsLogLogManagerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgApacheSlingCommonsLogLevel** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**OrgApacheSlingCommonsLogFile** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheSlingCommonsLogFileNumber** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**OrgApacheSlingCommonsLogFileSize** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheSlingCommonsLogPattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheSlingCommonsLogConfigurationFile** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheSlingCommonsLogPackagingDataEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OrgApacheSlingCommonsLogMaxCallerDataDepth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**OrgApacheSlingCommonsLogMaxOldFileCountInDump** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**OrgApacheSlingCommonsLogNumOfLines** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingCommonsLogLogManagerProperties = Initialize-PSOpenAPIToolsOrgApacheSlingCommonsLogLogManagerProperties  -OrgApacheSlingCommonsLogLevel null `
 -OrgApacheSlingCommonsLogFile null `
 -OrgApacheSlingCommonsLogFileNumber null `
 -OrgApacheSlingCommonsLogFileSize null `
 -OrgApacheSlingCommonsLogPattern null `
 -OrgApacheSlingCommonsLogConfigurationFile null `
 -OrgApacheSlingCommonsLogPackagingDataEnabled null `
 -OrgApacheSlingCommonsLogMaxCallerDataDepth null `
 -OrgApacheSlingCommonsLogMaxOldFileCountInDump null `
 -OrgApacheSlingCommonsLogNumOfLines null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingCommonsLogLogManagerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


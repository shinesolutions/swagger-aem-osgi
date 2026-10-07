# OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrgApacheSlingCommonsLogFile** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheSlingCommonsLogFileNumber** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**OrgApacheSlingCommonsLogFileSize** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OrgApacheSlingCommonsLogFileBuffered** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties = Initialize-PSOpenAPIToolsOrgApacheSlingCommonsLogLogManagerFactoryWriterProperties  -OrgApacheSlingCommonsLogFile null `
 -OrgApacheSlingCommonsLogFileNumber null `
 -OrgApacheSlingCommonsLogFileSize null `
 -OrgApacheSlingCommonsLogFileBuffered null
```

- Convert the resource to JSON
```powershell
$OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


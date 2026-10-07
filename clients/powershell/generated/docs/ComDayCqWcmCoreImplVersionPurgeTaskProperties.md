# ComDayCqWcmCoreImplVersionPurgeTaskProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VersionpurgePaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**VersionpurgeRecursive** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**VersionpurgeMaxVersions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**VersionpurgeMinVersions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**VersionpurgeMaxAgeDays** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmCoreImplVersionPurgeTaskProperties = Initialize-PSOpenAPIToolsComDayCqWcmCoreImplVersionPurgeTaskProperties  -VersionpurgePaths null `
 -VersionpurgeRecursive null `
 -VersionpurgeMaxVersions null `
 -VersionpurgeMinVersions null `
 -VersionpurgeMaxAgeDays null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmCoreImplVersionPurgeTaskProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


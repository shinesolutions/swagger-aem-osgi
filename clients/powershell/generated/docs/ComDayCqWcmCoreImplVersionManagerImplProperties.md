# ComDayCqWcmCoreImplVersionManagerImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VersionmanagerCreateVersionOnActivation** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**VersionmanagerPurgingEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**VersionmanagerPurgePaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**VersionmanagerIvPaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**VersionmanagerMaxAgeDays** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**VersionmanagerMaxNumberVersions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**VersionmanagerMinNumberVersions** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComDayCqWcmCoreImplVersionManagerImplProperties = Initialize-PSOpenAPIToolsComDayCqWcmCoreImplVersionManagerImplProperties  -VersionmanagerCreateVersionOnActivation null `
 -VersionmanagerPurgingEnabled null `
 -VersionmanagerPurgePaths null `
 -VersionmanagerIvPaths null `
 -VersionmanagerMaxAgeDays null `
 -VersionmanagerMaxNumberVersions null `
 -VersionmanagerMinNumberVersions null
```

- Convert the resource to JSON
```powershell
$ComDayCqWcmCoreImplVersionManagerImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


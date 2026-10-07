# ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeletePathRegexps** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**DeleteSql2Query** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties = Initialize-PSOpenAPIToolsComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties  -DeletePathRegexps null `
 -DeleteSql2Query null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


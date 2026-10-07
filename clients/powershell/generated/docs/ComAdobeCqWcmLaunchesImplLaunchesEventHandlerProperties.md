# ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventFilter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LaunchesEventhandlerThreadpoolMaxsize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**LaunchesEventhandlerThreadpoolPriority** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**LaunchesEventhandlerUpdatelastmodification** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties = Initialize-PSOpenAPIToolsComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties  -EventFilter null `
 -LaunchesEventhandlerThreadpoolMaxsize null `
 -LaunchesEventhandlerThreadpoolPriority null `
 -LaunchesEventhandlerUpdatelastmodification null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


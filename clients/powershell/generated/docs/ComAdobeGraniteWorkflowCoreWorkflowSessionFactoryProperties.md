# ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GraniteWorkflowinboxSortPropertyName** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**GraniteWorkflowinboxSortOrder** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**CqWorkflowJobRetry** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CqWorkflowSuperuser** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**GraniteWorkflowInboxQuerySize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GraniteWorkflowAdminUserGroupFilter** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteWorkflowEnforceWorkitemAssigneePermissions** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteWorkflowEnforceWorkflowInitiatorPermissions** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteWorkflowInjectTenantIdInJobTopics** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteWorkflowMaxPurgeSaveThreshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GraniteWorkflowMaxPurgeQueryCount** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties = Initialize-PSOpenAPIToolsComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties  -GraniteWorkflowinboxSortPropertyName null `
 -GraniteWorkflowinboxSortOrder null `
 -CqWorkflowJobRetry null `
 -CqWorkflowSuperuser null `
 -GraniteWorkflowInboxQuerySize null `
 -GraniteWorkflowAdminUserGroupFilter null `
 -GraniteWorkflowEnforceWorkitemAssigneePermissions null `
 -GraniteWorkflowEnforceWorkflowInitiatorPermissions null `
 -GraniteWorkflowInjectTenantIdInJobTopics null `
 -GraniteWorkflowMaxPurgeSaveThreshold null `
 -GraniteWorkflowMaxPurgeQueryCount null
```

- Convert the resource to JSON
```powershell
$ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


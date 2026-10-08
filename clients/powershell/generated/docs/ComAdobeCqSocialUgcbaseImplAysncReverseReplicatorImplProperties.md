# ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxPoolSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueueSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**KeepAliveTime** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties = Initialize-PSOpenAPIToolsComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties  -PoolSize null `
 -MaxPoolSize null `
 -QueueSize null `
 -KeepAliveTime null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


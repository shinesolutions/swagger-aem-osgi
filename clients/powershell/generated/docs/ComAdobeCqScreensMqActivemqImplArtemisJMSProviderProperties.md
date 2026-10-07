# ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServiceRanking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GlobalSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxDiskUsage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PersistenceEnabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ThreadPoolMaxSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ScheduledThreadPoolMaxSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GracefulShutdownTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Queues** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Topics** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AddressesMaxDeliveryAttempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AddressesExpiryDelay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AddressesAddressFullMessagePolicy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**AddressesMaxSizeBytes** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AddressesPageSizeBytes** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AddressesPageCacheMaxSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterUser** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ClusterPassword** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ClusterCallTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterCallFailoverTimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterClientFailureCheckPeriod** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterNotificationAttempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterNotificationInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**IdCacheSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterConfirmationWindowSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterConnectionTtl** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterDuplicateDetection** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ClusterInitialConnectAttempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterMaxRetryInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterMinLargeMessageSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterProducerWindowSize** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterReconnectAttempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterRetryInterval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterRetryIntervalMultiplier** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties = Initialize-PSOpenAPIToolsComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties  -ServiceRanking null `
 -GlobalSize null `
 -MaxDiskUsage null `
 -PersistenceEnabled null `
 -ThreadPoolMaxSize null `
 -ScheduledThreadPoolMaxSize null `
 -GracefulShutdownTimeout null `
 -Queues null `
 -Topics null `
 -AddressesMaxDeliveryAttempts null `
 -AddressesExpiryDelay null `
 -AddressesAddressFullMessagePolicy null `
 -AddressesMaxSizeBytes null `
 -AddressesPageSizeBytes null `
 -AddressesPageCacheMaxSize null `
 -ClusterUser null `
 -ClusterPassword null `
 -ClusterCallTimeout null `
 -ClusterCallFailoverTimeout null `
 -ClusterClientFailureCheckPeriod null `
 -ClusterNotificationAttempts null `
 -ClusterNotificationInterval null `
 -IdCacheSize null `
 -ClusterConfirmationWindowSize null `
 -ClusterConnectionTtl null `
 -ClusterDuplicateDetection null `
 -ClusterInitialConnectAttempts null `
 -ClusterMaxRetryInterval null `
 -ClusterMinLargeMessageSize null `
 -ClusterProducerWindowSize null `
 -ClusterReconnectAttempts null `
 -ClusterRetryInterval null `
 -ClusterRetryIntervalMultiplier null
```

- Convert the resource to JSON
```powershell
$ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


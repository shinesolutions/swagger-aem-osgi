# OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**org_apache_sling_installer_configuration_persist** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**mode** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]
**port** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**primary_host** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**primary_allowed_client_ip_ranges** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]
**secure** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**standby_readtimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**standby_autoclean** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]

## Example

```typescript
import { OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties } from './api';

const instance: OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties = {
    org_apache_sling_installer_configuration_persist,
    mode,
    port,
    primary_host,
    interval,
    primary_allowed_client_ip_ranges,
    secure,
    standby_readtimeout,
    standby_autoclean,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

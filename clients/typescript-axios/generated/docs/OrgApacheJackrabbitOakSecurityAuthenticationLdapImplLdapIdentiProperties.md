# OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provider_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**host_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**host_port** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**host_ssl** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**host_tls** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**host_noCertCheck** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**bind_dn** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**bind_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**searchTimeout** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**adminPool_maxActive** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**adminPool_lookupOnValidate** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**userPool_maxActive** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] [default to undefined]
**userPool_lookupOnValidate** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**user_baseDN** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**user_objectclass** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]
**user_idAttribute** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**user_extraFilter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**user_makeDnPath** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**group_baseDN** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**group_objectclass** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]
**group_nameAttribute** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**group_extraFilter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**group_makeDnPath** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**group_memberAttribute** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**useUidForExtId** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**customattributes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]

## Example

```typescript
import { OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties } from './api';

const instance: OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties = {
    provider_name,
    host_name,
    host_port,
    host_ssl,
    host_tls,
    host_noCertCheck,
    bind_dn,
    bind_password,
    searchTimeout,
    adminPool_maxActive,
    adminPool_lookupOnValidate,
    userPool_maxActive,
    userPool_lookupOnValidate,
    user_baseDN,
    user_objectclass,
    user_idAttribute,
    user_extraFilter,
    user_makeDnPath,
    group_baseDN,
    group_objectclass,
    group_nameAttribute,
    group_extraFilter,
    group_makeDnPath,
    group_memberAttribute,
    useUidForExtId,
    customattributes,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
